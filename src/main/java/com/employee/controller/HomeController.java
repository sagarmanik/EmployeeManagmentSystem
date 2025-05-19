package com.employee.controller;

import com.employee.model.Employee;
import com.employee.service.EmployeeService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/home")
    public String showHomePage() {
        return "home";
    }

    @GetMapping("/register")
    public String showRegistrationPage(Model model) {
        model.addAttribute("employee", new Employee());
        return "register";
    }

    @PostMapping("/register")
    public String handleRegistration(@ModelAttribute Employee employee, Model model) {
        employeeService.register(employee);
        model.addAttribute("message", "Employee registered successfully!");
        return "redirect:/home";
    }

    @GetMapping("/login")
    public String showLoginPage() {
        return "login";
    }

    @PostMapping("/login")
    public String handleLogin(@RequestParam("loginId") String loginId,
                              @RequestParam("password") String password,
                              Model model,
                              HttpSession session) {

        Employee employee = employeeService.getEmployeeByLoginIdAndPassword(loginId, password);

        if (employee != null) {
            session.setAttribute("loggedInEmployee", employee); // Store user in session
            model.addAttribute("username", employee.getName());
            return "welcome";
        } else {
            model.addAttribute("error", "Invalid login credentials!");
            return "login";
        }
    }

    @GetMapping("/employee")
    public String employee(Model model, HttpSession session) {
        Employee loggedInEmployee = (Employee) session.getAttribute("loggedInEmployee");

        if (loggedInEmployee == null) {
            return "redirect:/login"; // Ensure user is logged in
        }

        model.addAttribute("username", loggedInEmployee.getName());
        // Get all employees EXCEPT the current user directly from database
        List<Employee> employees = employeeService.getAllEmployeesExceptCurrent(loggedInEmployee.getLoginId());
        model.addAttribute("employees", employees);
        return "employee";
    }

    @GetMapping("/welcome")
    public String showWelcomePage(HttpSession session, Model model) {
        Employee loggedInEmployee = (Employee) session.getAttribute("loggedInEmployee");
        if (loggedInEmployee != null) {
            model.addAttribute("username", loggedInEmployee.getName());
        }
        return "welcome";
    }

    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate(); // Clears session
        return "redirect:/home";
    }
}

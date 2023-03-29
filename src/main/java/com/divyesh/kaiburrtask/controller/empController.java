package com.divyesh.kaiburrtask.controller;
import java.util.*;
import  java.util.List;
import com.divyesh.kaiburrtask.model.Employee;
import com.divyesh.kaiburrtask.repository.empRepository;
import com.divyesh.kaiburrtask.service.empService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@RequestMapping("/employee")
@Controller
public class empController {


    private final empService employeeService;

    @PostMapping("/addEmployee")
    public ResponseEntity addEmployee(@RequestBody Employee employee) {


        employeeService.addEmployee(employee);
        return ResponseEntity.status(HttpStatus.CREATED).build();

    }




    @GetMapping({"/getEmployee/{id}", "/getEmployee"})
    public ResponseEntity<?> getEmployee(@PathVariable(required = false) String id) {

        return ResponseEntity.ok(employeeService.getEmployee(id));

    }


    @GetMapping("/name/{name}")
    public ResponseEntity<Employee> getEmployeeByName(@PathVariable String name) {


        return ResponseEntity.ok().body(employeeService.getEmployeeByName(name));

    }

    @PutMapping("/updateEmployee")
    public ResponseEntity updateEmployee(@RequestBody Employee employee) {


        employeeService.updateEmployee(employee);
        return ResponseEntity.status(HttpStatus.OK).build();

    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteEmployee(@PathVariable String id) {


        employeeService.deleteEmployee(id);
        return ResponseEntity.noContent().build();

    }

    @GetMapping({"/list-employee", "/"})
    public ModelAndView getAllEmployees() {
        ModelAndView mav = new ModelAndView("list-employee");
        mav.addObject("employees", employeeService.getAllEmployee());
        return mav;
    }

    @GetMapping("/addEmployeeForm")
    public ModelAndView addEmployeeForm() {
        ModelAndView mav = new ModelAndView("add-employee-form");
        Employee newEmployee = new Employee();
        mav.addObject("employee", newEmployee);
        return mav;
    }

    @PostMapping("/saveEmployee")
    public String saveEmployee(@ModelAttribute Employee employee) {
        employeeService.addEmployee(employee);
        return "list-employee";
    }



    @GetMapping("/deleteEmployee")
    public String deleteEmployeeForm(@RequestParam String employeeId) {
        employeeService.deleteEmployee(employeeId);
        return "list-employee";
    }

}





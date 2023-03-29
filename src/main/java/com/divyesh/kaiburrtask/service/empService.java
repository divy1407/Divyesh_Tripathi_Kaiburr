package com.divyesh.kaiburrtask.service;
import com.divyesh.kaiburrtask.model.Employee;
import com.divyesh.kaiburrtask.repository.empRepository;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Service
@RequiredArgsConstructor
@Transactional
public class empService{
    private final empRepository employeeRepository;

    public void addEmployee(Employee employee) {

        employeeRepository.insert(employee);

    }

    public List<Employee> getEmployee(String id){


        if(id==null) {
            List<Employee> employee=employeeRepository.findAll();
            return employee;
        }

        else{
            return Collections.singletonList(employeeRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("404 NOT FOUND BY ID")));
        }


    }

    public Employee getEmployeeByName(String name) {

        Optional<Employee> employee=this.employeeRepository.findByName(name);

        if(employee.isPresent()) {
            return employee.get();
        }

        else {

            throw new ResourceNotFoundException("404 NOT FOUND EMPLOYEE BY NAME");
        }

    }

    public void updateEmployee( Employee employee) {

        Employee addemployee = employeeRepository.findById(employee.getId()).orElseThrow(() -> new RuntimeException(String.format("EMPLOYEE NOT FOUND %s", employee.getId())));
        addemployee.setName(employee.getName());
        addemployee.setEmpDept(employee.getEmpDept());
        addemployee.setEmpSalary(employee.getEmpSalary());
        employeeRepository.save(employee);


    }

    public void deleteEmployee(String id) {
        employeeRepository.deleteById(id);
    }

    public List<Employee> getAllEmployee() {
        List<Employee> employee=employeeRepository.findAll();
        return employee;
        
    }

    public Employee getEmployeeById(String employeeId) {
        Optional<Employee> employee=this.employeeRepository.findById(employeeId);


            return employee.get();




    }
}

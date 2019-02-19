package com.tcs.fresco;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;



@Service
public class EmployeeService {


    private static final Map<Integer, Employee> employeeMap = new HashMap<Integer, Employee>();
    static {
    	employeeMap.put(1, new Employee(1,"Arun", "10", "AP", 2));
    	employeeMap.put(2, new Employee(2,"Ajay", "9", "AP", 3));
    	employeeMap.put(3, new Employee(3,"Ben", "6", "TN", 4));
        employeeMap.put(4, new Employee(4,"Balu", "5", "TN", 5));
        employeeMap.put(5, new Employee(5,"chetan", "7", "KA", 6));
        employeeMap.put(6, new Employee(6,"dallas", "8", "KA", 1));
        employeeMap.put(7, new Employee(7,"allen", "4", "TA", 3));
        employeeMap.put(8, new Employee(8,"norries", "7", "TA", 0));
        employeeMap.put(9, new Employee(9,"vyom", "4", "UP", 4));
        employeeMap.put(10, new Employee(10,"kumar", "10", "UP", 3));
    }


    public Employee getStudentDetails(int id) {
    	if (employeeMap.containsKey(id)) 
    		return employeeMap.get(id);
    	else
    		throw new RuntimeException("No Record found.");
    }

    
    private Employee getDefaultEmp(int id){
    	return new Employee(id, "test_user", "SBC", "INDIA", 0);
    }
}

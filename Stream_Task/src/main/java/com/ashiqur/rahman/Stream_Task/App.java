package com.ashiqur.rahman.Stream_Task;

import com.ashiqur.rahman.Stream_Task.Employee;
import java.util.*;
import java.util.stream.*;

//import Reference_to_Instance_Method.Reference_to_Instance_Method.Employee;

public class App
{
    public static void main( String[] args )
    {
    	
   
         
    }
    public int streamTest() {
    	List<Employee> empList =  Arrays.asList(
    			new Employee("Rakib",	"1000",	 	10000.00,	Gender.MALE),
    			new Employee("Meena", 	"1001", 	15000.00,	Gender.FEMALE),
    			new Employee("Rabbi", 	"1002",		25000.00,	Gender.MALE),
    			new Employee("Nila", 	"1003",		85000.00,	Gender.FEMALE),
    			new Employee("Sadia",	"1004", 	25000.00, 	Gender.FEMALE));
    	    		   		
    	
        	 List<Employee> startWithM =empList.stream().filter(p ->p.getName().startsWith("M")).collect(Collectors.toList());
        	 System.out.println(startWithM);
        	 System.out.println();
        	 List<Employee> mEmployee =empList.stream().filter(p ->p.getGender().equals(Gender.MALE)).collect(Collectors.toList());
        	 System.out.println(mEmployee);
        	 System.out.println();
        	 List<Employee> fEmployee =empList.stream().filter(p ->p.getGender().equals(Gender.FEMALE)).collect(Collectors.toList());
        	 System.out.println(fEmployee);
        	 System.out.println();
        	 List<Double> collect = empList.stream().map(x -> x.getSalary()).collect(Collectors.toList());
             System.out.println(collect);     
             System.out.println();
             Double doubleSum=empList.stream().mapToDouble(Employee::getSalary).sum();
             System.out.println(doubleSum);
             int i = (int)Math.round(doubleSum);
             return i;
    }
}

package demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import ApplicationService.ApplicationService;
import bean.Employee;

public class Test {

	public static void main(String[] args) {
		
		Employee e1 = new Employee("Abhishek", "Kara", 500, "Finance");
		Employee e2 = new Employee("Rajkumar", "Uk", 20000, "Engineering");
		Employee e3 = new Employee("Bhim", "khandre", 300, "HR");
		Employee e4 = new Employee("Vikas", "RJ", 7600, "Finance");
		Employee e5 = new Employee("Lokesh", "Reddy", 8000, "Engineering");
		Employee e6 = new Employee("Pawan", "Cp", 3000, "Engineering");
		Employee e7 = new Employee("Karishma", "HY", 100, "HR");

		List<Employee> empList = new ArrayList<>(Arrays.asList(e1,e2,e3,e4,e5,e6,e7));
		ApplicationService service = new ApplicationService();
		
		// Print the list of employees in that department
		   service.getEmployeesList("HR",empList); // can be paased by constants
		   
		// Print the total salaries of all employess
		   service.getTotalSalary(empList);
		   
		// print the employee with heighest salary
		   service.getHeighestSal(empList);
		   
		// sort and print the list of employees by department and then sort based on the desc order of their salaries
		   service.sortBySal(empList);
		   
		// Print the list of employees per department in a Map structure  
		   service.toMap(empList);
		   
		 // Count total employees per department  
		   service.countEmpPerDepartment(empList);
		   
		 // average salaries per department
		   service.avgSalaryPerDep(empList);
		   
		 // Find first five emp
		   service.getFirstFive(empList);
	}
}

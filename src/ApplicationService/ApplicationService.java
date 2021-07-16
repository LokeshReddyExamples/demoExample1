package ApplicationService;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import bean.Employee;
import java.util.Comparator;

public class ApplicationService {
	
	public List<Employee> getEmployeesList(String departName,List<Employee> empList){
		return empList.stream()
				   .filter(e -> e.getDepartment().equals(departName))
				   .map(p -> p).collect(Collectors.toList());
	}

	public double getTotalSalary(List<Employee> empList){
		return empList.stream()
	            .collect(Collectors.summingDouble(Employee :: getSalary));
	}

	public List<Employee> sortBySal(List<Employee> empList) {
		List<Employee> empResult = empList.stream()
				.sorted(Comparator.comparing(Employee::getDepartment)
						.thenComparing(Comparator.comparing(Employee::getSalary).reversed())).collect(Collectors.toList());
		return empResult;
	}

	public Optional<Employee> getHeighestSal(List<Employee> employees){
		return employees.stream()
				.collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
	}
	
	public Map<String, List<Employee>> toMap(List<Employee> employees){
		return employees.stream()
				 .collect(Collectors.groupingBy(Employee::getDepartment));
	}
	
	public Map<String, Long> countEmpPerDepartment(List<Employee> employees){
		return employees.stream()
		         .collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
	}
	
	public Map<String, Double> avgSalaryPerDep(List<Employee> employees){
		return employees.stream()
		         .collect(Collectors.groupingBy(Employee::getDepartment,
		        		 Collectors.averagingDouble(Employee::getSalary)));
	}

}

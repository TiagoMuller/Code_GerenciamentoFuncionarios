package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Employee> list = new ArrayList<>();
		
		System.out.println("How many employees will be registered? ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.printf("Employee #%d\n", i);
			System.out.print("Id:");
			int id = sc.nextInt();
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Saraly: ");
			double salary = sc.nextDouble();
			list.add(new Employee(id, name, salary));
			}
			
			System.out.println("Enter the employee id that will have salary increase: ");
			int id = sc.nextInt();
			Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
			if(emp == null) {
				System.out.println("This id does not exist!");
			}else {
				System.out.println("Enter the percentage: ");
				double percentage = sc.nextDouble();
				emp.increaseSalary(percentage);
			}
			System.out.println("List of employees:");
			for(Employee obj : list) {
				System.out.println(obj);
			}
				
			
			

			
			

			
			
		
		sc.close();
	}

}

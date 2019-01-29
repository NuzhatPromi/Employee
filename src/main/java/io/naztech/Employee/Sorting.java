package io.naztech.Employee;

import static org.hamcrest.CoreMatchers.containsString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sorting {
	public static void main(String[] args) {
		int[] intarr = { 2, 1, 10, 5, 6 };
		Arrays.sort(intarr);
		System.out.println(Arrays.toString(intarr));

		String[] strarr = { "A", "C", "B", "Z" };
		Arrays.sort(strarr);
		System.out.println(Arrays.toString(strarr));

		Employee[] empArr = new Employee[4];
		empArr[0] = new Employee(10, "Mikey", 25, 10000);
		empArr[1] = new Employee(20, "Arun", 29, 20000);
		empArr[2] = new Employee(5, "Lisa", 35, 5000);
		empArr[3] = new Employee(1, "Pankaj", 32, 50000);

		// sorting employees array using Comparable interface implementation
		Arrays.sort(empArr);
		System.out.println("Default Sorting of Employees list:\n" + Arrays.toString(empArr));
		
		Arrays.sort(empArr, Employee.AgeComparator);
		System.out.println("Sorting by Age:\n " + Arrays.toString(empArr));
		
		Arrays.sort(empArr, Employee.NameComparator);
		System.out.println("Sorting by Name:\n " + Arrays.toString(empArr));
		
		Arrays.sort(empArr, Employee.SalaryComparator);
		System.out.println("Sorting by Salary:\n " + Arrays.toString(empArr));
	}
}

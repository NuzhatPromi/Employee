package io.naztech.Employee;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class SortTest {

	@Test
	public void testAge() {
		Employee[] empArr = new Employee[4];
		empArr[0] = new Employee(10, "Mikey", 25, 10000);
		empArr[1] = new Employee(20, "Arun", 29, 20000);
		empArr[2] = new Employee(5, "Lisa", 35, 5000);
		empArr[3] = new Employee(1, "Pankaj", 32, 50000);
		
		Employee[] actualEmployees = new Employee[4];
		actualEmployees = {{10, "Mikey", 25, 10000}, {20, "Arun", 29, 20000}, {1, "Pankaj", 32, 50000}, {5, "Lisa", 35, 5000}};
		assertArrayEquals(Arrays.sort(empArr, Employee.AgeComparator), actualEmployees);
	}

}

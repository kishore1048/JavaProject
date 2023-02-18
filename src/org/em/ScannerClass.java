package org.em;

import java.util.Scanner;

public class ScannerClass {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("1.empId ?");
		String id = scanner.nextLine();
		System.out.println("Ans : "+ id);
		
		System.out.println("2.empName");
		String name = scanner.nextLine();
		System.out.println("Ans : " +name);
		
		
		System.out.println("3.EmpName");
		String empname = scanner.nextLine();
		System.out.println("Ans : "+ empname);
		
		
		System.out.println("4.EmpPhoneno");
		String empphoneno = scanner.nextLine();
		System.out.println("Ans : "+ empphoneno);
		
		System.out.println("5.empSalary");
		String salary = scanner.nextLine();
		System.out.println("Ans : " + salary);
		
		System.out.println("6.empGender");
		String  Gender = scanner.nextLine();
		System.out.println("Ans : "+ Gender);
		
		System.out.println("7.EmpCity");
		String City = scanner.nextLine();
		System.out.println("Ans : "+ City);
		
	

}
}

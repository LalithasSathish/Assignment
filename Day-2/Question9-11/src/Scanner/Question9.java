package Scanner;

import java.util.Scanner;

public class Question9 {
	
	public static void main(String[] args) {
		//empId
		System.out.println("Enter Employee Id:- ");
		Scanner scan=new Scanner(System.in);
		int empId=scan.nextInt();
		System.out.println("EMP ID:- "+empId+"\n");
		//empName
		System.out.println("Enter Employee Name:- ");
		Scanner scan1=new Scanner(System.in);
		String empName=scan1.next();
		System.out.println("EMP Name:- "+empName);
	}

}

package main.java;

import java.util.*;

//Employee Wage Computation Problem


public class employeeWageComputation {

	//	random function for check employee is absent or present
	
	public static int generateRandomNumber() {
		double x = Math.random();
		int y = (int) Math.round(x);
		return y;
	}

	public static String presenteeCheckForEmployee(int value) {
		if (value == 1) {
			return "Employee is Present";
		} else {
			return "Employee is Absent";
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome To Employee Wage Calculation Problem");
		int randomValue = generateRandomNumber();
		String presenteeCheck = presenteeCheckForEmployee(randomValue);
		System.out.println(presenteeCheck);
	}

}


package main.java;

import java.util.*;

//Employee Wage Computation Problem

public class employeeWageComputation {

	// Constants
	static final int PRESENT = 1, WAGE_PER_HOUR = 20;

	public static int generateRandomNumber() {
		double x = Math.random();
		int y = (int) Math.round(x);
		return y;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Worked_Hrs = 0, Day_Salary_Of_Employee = 0;
		System.out.println("Wecome to employee wage program");
		
		int Random_No = (int) (Math.floor(Math.random() * 10) % 2);
		// random function for check employee is absent or present

		if (PRESENT == Random_No) {
			System.out.println("Employee is present.");
			Worked_Hrs = 8;
		} else
			System.out.println("Employee is absent.");
		// computing employee wage for one day
		Day_Salary_Of_Employee = WAGE_PER_HOUR * Worked_Hrs;
		System.out.println("Your one day salary creadited to your account, rupees " + Day_Salary_Of_Employee);

	}

}

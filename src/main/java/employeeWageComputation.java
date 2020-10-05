package main.java;

import java.util.*;

//Employee Wage Computation Problem

public class employeeWageComputation {

	// Constants
	static final int PRESENT = 1, WAGE_PER_HOUR = 20, FULL_TIME = 1, PART_TIME = 0, WORKING_DAYS_IN_MONTH = 20,
			MAX_WORKING_HRS = 100;
	
	public static int generateRandomNumber() {
		double x = Math.random();
		int y = (int) Math.round(x);
		return y;
	}
	
	//to calculate Total salary of employee
	public static int calculateEmpWage(int Worked_Hrs, int Day_Salary_Of_Employee , int  Month_Salary_Of_Employee) {
		
		int Emp_Worked_hrs = 0, i, Salary, Total_Salary_Of_Employee = 0;
		
		for ( i = 1; i <= WORKING_DAYS_IN_MONTH && Emp_Worked_hrs <= MAX_WORKING_HRS; i++) {
			
			if (Emp_Worked_hrs == 96 || Emp_Worked_hrs == 94) {
				if (Worked_Hrs == 8)
					break;
			} else if (Emp_Worked_hrs == 98) {
					break;
			}
			
			Emp_Worked_hrs += Worked_Hrs;
			Salary = WAGE_PER_HOUR * Worked_Hrs;
			Total_Salary_Of_Employee += Salary;
		}
		return Total_Salary_Of_Employee;
	}	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Worked_Hrs = 8; 
		 * Day_Salary_Of_Employee = 200;
		 *  Month_Salary_Of_Employee =
		 * 1600;
		 */
		
		System.out.println("Welcome to employee wage program");
		
		int wageOfEmp = calculateEmpWage(8, 200, 1600);
		System.out.println("Total salary of employee : " + wageOfEmp);  
		
		empWageForCompanies wageOfEmpforCompanies = new empWageForCompanies("JIO", 8, 200, 1600);
		wageOfEmpforCompanies.calculateEmpWageForCompanies();
		
		empWageForCompanies wageOfEmpforCompanies2 = new empWageForCompanies("REALIANCE", 8, 10, 800);
		wageOfEmpforCompanies2.calculateEmpWageForCompanies();
		
		
	
	}

}
 class empWageForCompanies {
	 
		 String companieName;
		 int Worked_Hrs;
		 int Day_Salary_Of_Employee;
		 int Month_Salary_Of_Employee;
		 int worked_days=0;
		 int empWage = 0;

		 empWageForCompanies( String companieName, int Worked_Hrs, int Day_Salary_Of_Employee , int  Month_Salary_Of_Employee ){
			    this.companieName 				=  companieName;
				this.Worked_Hrs					=  Worked_Hrs;
				this.Day_Salary_Of_Employee		=  Day_Salary_Of_Employee;
				this.Month_Salary_Of_Employee	=  Month_Salary_Of_Employee;
		 }
		 
		 public int calculateEmpWageForCompanies() {
			 while(worked_days!=30) {
				  empWage =  empWage + (Worked_Hrs* Day_Salary_Of_Employee);
		          worked_days = worked_days+1; 
			 }
			 System.out.println("Emp salary of company "+companieName+" is :"+empWage);
			return empWage ;
		 }
	}
	



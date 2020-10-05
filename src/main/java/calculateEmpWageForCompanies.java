package main.java;

public class calculateEmpWageForCompanies extends employeeWageComputation {

	private static final int JIO = 0;
	private static final int TATA = 1;

	public void empWageForCompanies() {
		
		int companies = (int) (Math.floor(Math.random() * 10) % 2);
		
		int Worked_Hrs;
		switch (companies) {
			case JIO:
				System.out.println("Employee Wage for JIO.");
				Worked_Hrs = 8;
				break;
				
			case TATA:
				System.out.println("Employee Wage for TATA.");
				Worked_Hrs = 4;
				break;
			default:
		}
	}
	

}

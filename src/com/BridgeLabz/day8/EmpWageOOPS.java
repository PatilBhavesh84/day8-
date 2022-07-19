package com.BridgeLabz.day8;

public class EmpWageOOPS {

	public static final int FULL_TIME=2;
	public static final int PART_TIME=1;
	public static final int WORKING_DAY=20;
	EmpWageOOPS(){
		int empRatePerHrs=20;
		int totalSalary=0;
		int salary,empHrs;
		for(int i=1;i<=WORKING_DAY;i++){ 

			int empCheck = (int)Math.floor(Math.random()*10)%3;

			switch(empCheck)	{
			case FULL_TIME:
				empHrs = 8;
				break;
			case PART_TIME:
				empHrs = 4;
				break;
			default:
				empHrs =0;
			}
			salary = empRatePerHrs*empHrs;
			totalSalary = totalSalary + salary;
		}
		System.out.println("Monthly Wage is "+ totalSalary);
	}


	public static void main(String[]args) {
		System.out.println("Welcome to Employee Wage Computation");

		EmpWageOOPS obj = new EmpWageOOPS();
	}
}

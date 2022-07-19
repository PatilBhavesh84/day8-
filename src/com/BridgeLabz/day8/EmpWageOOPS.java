package com.BridgeLabz.day8;

public class EmpWageOOPS {

	public static final int FULL_TIME=1;
	public static final int PART_TIME=2;
	EmpWageOOPS(int p){
		int ratePerHr=20;
		int salary;
		int empHr;

		switch(p)  {
		case FULL_TIME:
			empHr=8;
			break;

		case PART_TIME: 
			empHr=4;
			break;

		default:
			empHr=0;

		}
		salary=ratePerHr*empHr;
		System.out.println("Salary is "+salary);
	}

	public static void main(String[]args) {
		System.out.println("Welcome to Employee Wage Computation");
		int empCheck=(int)Math.floor(Math.random()*10%3);
		EmpWageOOPS obj = new EmpWageOOPS(empCheck);
	}
}

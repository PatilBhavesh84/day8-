package com.BridgeLabz.day8;

public class EmpWageOOPS {

	public static final int FULL_TIME=1;
	public static final int PART_TIME=2;
	EmpWageOOPS(int p){
		int ratePerHr=20;
		int salary;
		if(p==FULL_TIME) {
			int empHr=8;
			salary=empHr*ratePerHr;
			System.out.println("Employee wage is-"+salary);
		}
		else if(p==PART_TIME) {
			int empHr=4;
			salary=empHr*ratePerHr;
			System.out.println("Employee wage is-"+salary);
		}
		else {
			System.out.println("Employee is absent");
		}
	}

	public static void main(String[]args) {
		System.out.println("Welcome to Employee Wage Computation");
		int empCheck=(int)Math.floor(Math.random()*10%3);
		EmpWageOOPS obj = new EmpWageOOPS(empCheck);
	}
}

package com.BridgeLabz.day8;

public class EmpWageOOPS {

	EmpWageOOPS(int p){
		int RatePerHr=20;
		int empHr=8;
		int salary;
		if(p==1) {
			salary=empHr*RatePerHr;
			System.out.println("Employee wage is-"+salary);
		}
		else
			System.out.println("Employee wage is-0");
	}

	public static void main(String[]args) {
		System.out.println("Welcome to Employee Wage Computation");
		int empCheck=(int)Math.floor(Math.random()*10%2);
		EmpWageOOPS obj = new EmpWageOOPS(empCheck);
	}
}

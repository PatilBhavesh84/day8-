package com.BridgeLabz.day8;

public class EmpWageOOPS {

	EmpWageOOPS(int p){

		if(p==1) {
			System.out.println("Employee is present");
		}
		else
			System.out.println("Employee is absent");
	}

	public static void main(String[]args) {
		System.out.println("Welcome to Employee Wage Computation");
		int empCheck=(int)Math.floor(Math.random()*10%2);
		EmpWageOOPS obj = new EmpWageOOPS(empCheck);
	}
}
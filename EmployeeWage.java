package com.day10;

import java.util.Scanner;

class Employee
{
	void display()
	{
		System.out.print("Welcome to Employee Wage Computation Program");
	}
}

class Attendence extends Employee
{
	void attendence()
	{
		int ab = (int) ((Math.random()) * 10) % 2;
		if(ab == 1) 
		{
			System.out.println("Employee is Present!!");
		}
		else 
		{
			System.out.println("Employee is Absent!!");
		}
	}
}

class Wage extends Attendence
{
	void wage(boolean x)
	{
		if (x) 
		{
			int wagePerHr = 0;
			int fullDayHr = 0;
			int employee_wage = ( wagePerHr * fullDayHr);
			System.out.println("The wage of a full time employee is = $ " + employee_wage);
		}
		else 
		{
			System.out.println("-");
		}
	}
}

public class EmployeeWage 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		System.out.print("Welcome to Employee Wage Computation Program");
		
		Attendence a1 = new Attendence();
		a1.attendence();
		Wage w = new Wage();
		w.wage(false);

	}
}


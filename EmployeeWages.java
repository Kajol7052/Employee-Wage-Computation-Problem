//Welcome to Employee Wages Computation

import java.util.*;
import java.util.Random;

//UC-1 To Check If Employee is Present or Absent
//UC-2 To Calculate Daily Employee Wage
//UC-3 To Add Part Time Employee and Wages
//UC-4 Using Switch Case Statement
//UC-5 Calculate Monthly Wages
//UC-6 Calculate Wages Based on Hours And Days

public class EmployeeWages {
	public static void main(String args[]){
        	int IS_FULL_TIME= 1;
        	int IS_PART_TIME = 0;
        	int FULL_TIME = 8;
        	int PART_TIME = 4;
        	int WORKING_HOUR = 0;
        	int EMP_RATE_PER_HOUR= 20;
        	int empCheck=(int) (Math.floor(Math.random()*10) %2);
        	int MAX_HOURS_IN_MONTH = FULL_TIME*EMP_RATE_PER_HOUR;
        	int WORKING_DAY_IN_A_MONTH = 20;
        	int NUMBER_OF_HOURS_WORKED = 0;
        	int NUMBER_OF_DAYS_WORKED = 0;
        	while (NUMBER_OF_HOURS_WORKED <= MAX_HOURS_IN_MONTH && NUMBER_OF_DAYS_WORKED <= WORKING_DAY_IN_A_MONTH) {
        		switch (empCheck) {
        			case 1:
        				WORKING_HOUR=FULL_TIME;
        				break;
        			case 0:
        				WORKING_HOUR=PART_TIME;
        				break;
        			default:
        				break;
        		}
        		NUMBER_OF_DAYS_WORKED++;
        		NUMBER_OF_HOURS_WORKED= NUMBER_OF_HOURS_WORKED + WORKING_HOUR;
        	}
        	int MONTHLY_WAGE = NUMBER_OF_HOURS_WORKED * EMP_RATE_PER_HOUR;
        	System.out.println("Monthly Wages is " + MONTHLY_WAGE);
	}
}


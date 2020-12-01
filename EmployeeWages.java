//Welcome to Employee Wages Computation

import java.util.*;
import java.util.Random;

//UC-1 To Check If Employee is Present or Absent
//UC-2 To Calculate Daily Employee Wage
//UC-3 To Add Part Time Employee and Wages
//UC-4 Using Switch Case Statement
public class EmployeeWages {
        public static void main(String args[]){
                int IS_FULL_TIME= 1;
		int IS_PART_TIME= 0;
		int RATE_PER_HOUR= 20;
        	int empHours=0;
                int empCheck=(int) (Math.floor(Math.random()*10) %2);
                System.out.println(empCheck);
                switch (empCheck) {
        	case 1:
        		empHours=8;
            		break;
        	case 0:
        		empHours=4;
        		break;
        	default:
        		break;
        }
		int DAILY_WAGE = empHours*RATE_PER_HOUR;
        	System.out.println("Salary is " + DAILY_WAGE);

        	int WORKING_DAY_IN_A_MONTH = 20;
        	int MONTHLY_WAGE = DAILY_WAGE*WORKING_DAY_IN_A_MONTH;
        	System.out.println("Monthly Wages is " + MONTHLY_WAGE);
        }
}

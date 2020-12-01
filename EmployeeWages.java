//Welcome to Employee Wages Computation

import java.util.*;
import java.util.Random;

//UC-1 To Check If Employee is Present or Absent
//UC-2 To Calculate Daily Employee Wage
public class EmployeeWages {
        public static void main(String args[]){
                int IS_FULL_TIME= 1;
		int RATE_PER_HOUR= 20;
        	int empHours=0;
                double empCheck=Math.floor(Math.random()*10)%2;
                System.out.println(empCheck);
                if(empCheck == IS_FULL_TIME)
                {
			empHours=8;
                        //System.out.println("Present");
                }
                else
                {
			empHours=0;
                        //System.out.println("Absent");
                }
		int salary = empHours*RATE_PER_HOUR;
        	System.out.println("Salary is : " + salary);
        }
}

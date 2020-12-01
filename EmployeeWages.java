//Welcome to Employee Wages Computation

import java.util.*;
import java.util.Random;

//UC-1 To check if Employee is Present or Absent
public class EmployeeWages {
        public static void main(String args[]){
                int IS_FULL_TIME= 1;
                double empCheck=Math.floor(Math.random()*10)%2;
                System.out.println(empCheck);
                if(empCheck == IS_FULL_TIME)
                {
                        System.out.println("Present");
                }
                else
                {
                        System.out.println("Absent");
                }
        }
}

import java.util.*;

public class EmployeeWagesUtil {

	public static final int IS_FULL_TIME= 2;
	public static final int IS_PART_TIME = 1;
	public static final int EMP_RATE_PER_HOUR= 20;
	public static final int WORKING_DAY_IN_A_MONTH = 20;
	public static final int MAX_HOURS_IN_MONTH = 100;

	public void returnAmount()
	{
		//VARIABLES
		int empHrs = 0;
        int totalEmpHours = 0;
        int totalWorkingDays = 0;
        //COMPUTATION
        while (totalEmpHours <= MAX_HOURS_IN_MONTH && totalWorkingDays <= WORKING_DAY_IN_A_MONTH) {
        	    totalWorkingDays++;
        	    int empCheck = (int) (Math.floor(Math.random()*10) % 3);
                switch (empCheck) {
                        case IS_PART_TIME:
                                empHrs=4;
                                break;
                        case IS_FULL_TIME:
                                empHrs=8;
                                break;
                        default:
                        	    empHrs=0;
                                break;
                }
                totalEmpHours += empHrs;
                System.out.println("Day#: " + totalWorkingDays + " Employee Hours: " + empHrs);
        }

        int totalEmpWage = totalEmpHours * EMP_RATE_PER_HOUR;
        System.out.println("Total Wages is " + totalEmpWage);
	}

}


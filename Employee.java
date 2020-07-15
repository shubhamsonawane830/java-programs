/**
*The Employee class
*/
public class Employee
{
	//Constant Variables
	public static int EMP_RATE_PER_HOUR=20;
	public static int workHours=8;
	public static int totalWage=0;
	public static int salaryPerDay=0;
	public static int partTimeWorkHours=4;
	public static int totalWorkingHours=0;
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;

	public static void main(String args[])
	{
	System.out.println("Welcome to Employee Wage calculation");
	//Check Working Day is not beyond 20
	for(int day=1;day<=20;day++)
	{
		//Check Working Hour is Less Than 100
		while(totalWorkingHours<100)
		{
			//Check Employee is Present or Absent
			int check=((int)(Math.random()*3 + 1));
			switch(check)
			{
				//Calculate Full Time Wage
				case IS_FULL_TIME:
				System.out.println("Employee is Full time Employee");
				salaryPerDay = EMP_RATE_PER_HOUR * workHours;
				System.out.println("Salary of Employee per day is : " + salaryPerDay);
				totalWorkingHours+=workHours;
				break;
				//Calculate Part Time Wage
				case IS_PART_TIME:
				System.out.println("Employee is a part time");
				salaryPerDay = EMP_RATE_PER_HOUR * partTimeWorkHours;
				System.out.println("Salary of Employee per day is : " + salaryPerDay);
				totalWorkingHours+=partTimeWorkHours;
				break;

				default:
				System.out.println("Employee is absent");
				salaryPerDay=0;
				totalWorkingHours+=0;
				break;
			}
			totalWage+=salaryPerDay;
		}
	}
		//Display Total Salary Of Employee
		System.out.println("The total month salary is given as : " +totalWage);
	}
}


public class EmployeeCompute
{
	//Constant Variable
	public static final int IS_FULL_TIME=1;
	public static final int IS_PART_TIME=2;
	private final String companyName;
	private final int empRatePerHour;
	private final int numOfWorkingDays;
	private final int maxHoursPerMonth;
	//Constructor
	public EmployeeBuilder(String companyName, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth)
	{
		this.companyName=companyName;
		this.empRatePerHour=empRatePerHour;
		this.numOfWorkingDays=numOfWorkingDays;
		this.maxHoursPerMonth=maxHoursPerMonth;
	}
	//method
	private int empCheck()
	{
		int empHrs=0, totalEmpHrs=0, totalWorkingDays=0;
		while(totalEmpHrs<=maxHoursPerMonth && totalWorkingDays<numOfWorkingDays)
		{
			totalWorkingDays++;
			int check=(int)Math.floor(Math.random()*10)%3;
			switch(check)
			{
				case IS_FULL_TIME:
				empHrs=8;
				break;

				case IS_PART_TIME:
				empHrs=4;
				break;

				default:
				empHrs=0;
				break;
			}
			totalEmpHrs+=empHrs;
			System.out.println("Days "+totalWorkingDays+" Employee Hours "+empHrs);
		}
		return totalEmpHrs*empRatePerHour;
	}
	public static void main(String[] args)
	{
		//Created  and Initialise Object
		EmployeeBuilder dmart=new EmployeeBuilder("DMART", 20, 20, 100);
		System.out.println("Total Employee Wage Of "+dmart.companyName+" is "+dmart.empCheck());
		System.out.println();
		//Created and Initialise Object
		EmployeeBuilder reliance=new EmployeeBuilder("Reliance", 30, 25, 90);
		System.out.println("Total Employee Wage Of "+reliance.companyName+" is "+reliance.empCheck());
	}
}


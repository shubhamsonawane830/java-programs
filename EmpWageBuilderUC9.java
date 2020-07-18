
 public class EmployeeTotal
{
	//static variables
   private static final int IS_FULL_TIME=1;
   private static final int IS_PART_TIME=2;
	/** instance method is created to compute emp wage
   * @return totalWage of employees of different Companies
   */
   public static void computeEmpWage(final Company company)
 	{
   	//variables
   	int empHrs=0, totalEmpHrs=0, totalWorkingDays=0;
   	//Computation
   	while(totalEmpHrs <= company.getMaxHrsInMonth() && totalWorkingDays < company.getNumOfWorkingDays())
		{
      	totalWorkingDays++;
         int check = (int)Math.floor(Math.random() * 10) % 3;
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
      	System.out.println("Day: "+ totalWorkingDays+ " Emp Hrs: "+ empHrs);
      }
      final int wage = totalEmpHrs * company.getEmpRatePerHrs();
      company.setTotalEmpWage(wage);
   }
   public static void main(String[] args)
   {
		//Creating Object and Initialize
		Company apple = new Company("Apple",20, 100, 20);
  		computeEmpWage(apple);
   	System.out.println("Total Emp wage for "+ apple.getName()+" : "+apple.getTotalEmpWage());
		System.out.println();
   	//Creating Object and Initialize
   	final Company samsung = new Company("Samsung",10, 110, 50);
   	computeEmpWage(samsung);
   	System.out.println("Total Emp wage for "+ samsung.getName()+" : "+samsung.getTotalEmpWage());
   }
}

   /** Created a class named Company
     * default and parameterized construct is formed
     * we have used getter and setter method to privately access the variables
     */
class Company
{
	private String name;
   private int empRatePerHrs;
   private int numOfWorkingDays;
   private int maxHrsInMonth;
   private int totalEmpWage;

   //default constructor
   public Company() {
   }

   //parameterized constructor
   public Company(final String name, final int empRatePerHrs, final int numOfWorkingDays, final int maxHrsInMonth)
	{
      this.name=name;
      this.empRatePerHrs=empRatePerHrs;
      this.numOfWorkingDays=numOfWorkingDays;
      this.maxHrsInMonth=maxHrsInMonth;
   }
   // @return values using get and set method
   public void setName(final String name)
	{
      this.name = name;
   }
   public String getName()
	{
      return name;
   }
   public void setEmpRatePerHrs(final int empRatePerHrs)
	{
      this.empRatePerHrs = empRatePerHrs;
   }
   public int getEmpRatePerHrs()
	{
      return empRatePerHrs;
   }
   public void setNumOfWorkingDays(final int numOfWorkingDays)
	{
      this.numOfWorkingDays = numOfWorkingDays;
   }
   public int getNumOfWorkingDays()
	{
      return numOfWorkingDays;
   }
   public void setMaxHrsInMonth(final int maxHrsInMonth)
	{
      this.maxHrsInMonth = maxHrsInMonth;
   }
   public int getMaxHrsInMonth()
	{
      return maxHrsInMonth;
   }
   public void setTotalEmpWage(final int totalEmpWage)
	{
      this.totalEmpWage = totalEmpWage;
   }
   public int getTotalEmpWage()
	{
      return totalEmpWage;
   }
}


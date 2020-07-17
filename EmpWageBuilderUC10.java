public class EmpWageBuilderUC10 {
	
	private static final int IS_PART_TIME = 1;
	private static final int IS_FULL_TIME = 2;
	//private static final int EMP_RATE_PER_HRS = 20;
	//private static final int NUM_OF_WORKING_DAYS = 20;
	//private static final int MAX_HRS_IN_MONTH = 100;

	public static int computeEmpWage(final Company company){
		//variables
		int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;

		while(totalEmpHrs <= company.getMaxHrsInMonth() && totalWorkingDays < company.getTotalWorkingDays()) {
			totalWorkingDays++;
			final int value = (int) Math.floor(Math.random() * 10) % 3;
			switch(value) {
				case 1:
					empHrs = 4;
					break;
				case 2:
					empHrs = 8;
					break;
				default: 
					empHrs = 0;
					break;
			}
			totalEmpHrs+=empHrs;
			System.out.println("Day#: "+totalWorkingDays +" Emp Hrs: "+  empHrs);
		}
		return totalEmpHrs * company.getEmpRate();
	}

	public static void main(String [] args){
		//For Apple
		final Company apple = new Company("Apple", 20, 20, 100);
		final int totalWageApple = computeEmpWage(apple);
		System.out.println("Total Emp wage for "+ apple.getName() +": "+ totalWageApple);

		//For Samsung
		final Company samsung = new Company("samsung", 22, 30, 120);
		final int totalWageSamSung = computeEmpWage(samsung);
		System.out.println("Total Emp wage for "+ samsung.getName() +": "+ totalWageSamSung);
	}

   class EmpWageBuilderArray {
	private static final int IS_PART_TIME = 1;
	private static final int IS_FULL_TIME = 2;

	private int numOfCompany = 0;
	private final Company[] companyWageArray;

	public EmpWageBuilderArray() {
		companyWageArray = new Company[5];
	}
  	public void printEmpWage() {
		for (int i = 0; i < numOfCompany; i++) {
			computeEmpWage(companyWageArray[i]);
			companyWageArray[i] = Company.setToalEmpWage(EmpWageBuilderArray.computeEmpWage(companyWageArray[i]));
			System.out.println(companyWageArray[i]);
		}

    	public void addCpompnyEmployWage(final String companyName, final int companyWage, final int workingDays,
			final int workingHours) {
		companyWageArray[numOfCompany] = new Company(companyName, companyWage, workingDays, workingHours);
		numOfCompany++;
}

class Company {

	private String name;

	private int empRate;

	private int totalWorkingDays;

	private int maxHrsInMonth;

	public Company(){
	}

	public Company(final String name, final int empRate, final int totalWorkingDays, final int maxHrsInMonth){
		this.name = name;
		this.empRate = empRate;
		this.totalWorkingDays =totalWorkingDays;
		this.maxHrsInMonth = maxHrsInMonth;
	}	

	public void setName(final String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}

	public void setEmpRate(final int empRate){
		this.empRate = empRate;
	}
	public int getEmpRate(){
		return empRate;
	}

	public void setTotalWorkingDays(final int totalWorkingDays){
		this.totalWorkingDays = totalWorkingDays;
	}
	public int getTotalWorkingDays(){
		return totalWorkingDays;
	}

	public void setMaxHrsInMonth(final int maxHrsInMonth){
		this.maxHrsInMonth = maxHrsInMonth;
	}
	public int getMaxHrsInMonth(){
		return maxHrsInMonth;
	}
}
	
}	
	

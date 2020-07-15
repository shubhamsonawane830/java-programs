
public class EmpWageBuilderUC5 {

  private static final int  is_fulltime=2;
  private static final int is_parttime=1;
  private static final double ratePerHrs=20.0;
  private static final int totdays=20;
  private static  string empType;
  private static double calculateWage;
  private static int hours;


 public static void main(String[] args){

   empcheck();
}

public static double empcheck() {

   final int ranNumber=(int) (Math.floor(Math.random()*10)%3);
   System.out.println(ranNumber);

   switch(ranNumber){
   case is_fulltime:
            empType="Full-Time";
            break;
    case is_parttime:
            empType="Part-Time";
            break;
     default:
          empType="Absent";
}
    
    hour= 4*ranNumber;
    calculateWage=ratePerHrs*hours;
   totHours=totHours-hours;
    
    System.out.println("Employee is"+empType+" and its wage is :"+calculateWage);
    return 0.0;

  if (ranNumber == is_fulltime){
       double wage = calculateWage();
      System.out.println("Employee is Present and its wage is :"+wage);
  }else if(ranNumber == is_parttime){
     double wage = calculatewage();
    System.out.println("Employee is Parttimer and its wage is :"+wage);
  }else{
  System.out.println("Employee is absent  no earning");
  }
 }
}

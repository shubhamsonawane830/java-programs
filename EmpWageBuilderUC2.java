
public class EmpWageBuilderUC2 {

   private static final int IS_FULL_TIME=1;
    public static void main(String[] args){

      double wage=empcheck();
         System.out.println("Total Employee Wage is:"+wage);

    }
  
     public static double empcheck(){
         final double ranNumber=Math.floor(Math.random()*10)%2;

        if( IS_FULL_TIME==ranNumber ){
    System.out.println("Employee is present and its employee wage is");
    final double TotalWage=20*8;
    return TotalWage;
}else{
      System.out.println("Employee is absent");
       return 0.0;
         }
       }
      }

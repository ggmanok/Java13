package java13;
class Ctest{
   public static void test(int num,int den) throws ArithmeticException{
      System.out.println(num+"/"+den+"="+num/den);
   }
}
public class class08{
   public static void main(String args[]){
     try{
        Ctest.test(5,0);
     }
     catch(ArithmeticException e){
        System.out.println("����:0");
     }
     finally{
        System.out.println("end of main() method!!");
     }
   }
}

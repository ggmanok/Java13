package java13;
public class class03{
   public static void main(String args[]){
      try{
    	  int num=12,den=0;
    	  int ans=num/den;
    	  System.out.println("ans="+ans);
      }
      catch(ArithmeticException e){      //加入catch
         System.out.println("除數為 0");
      }
      finally{
         System.out.println("end of main() method!!");
      }
   }
}

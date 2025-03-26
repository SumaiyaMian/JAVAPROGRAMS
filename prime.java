import java.util.Scanner;
 
public class prime{
 public static void main (String[] args){
   Scanner Scanner = new Scanner(System.in);
 
   System.out.println("Enter a number:");
   int num = Scanner.nextInt();
   boolean isprime = true;

   if ( num <= 1){
      isprime = false;
   }else{
      for ( int i=2; i < num/2; i++){
         if (num%i ==0){
            isprime=false;
            break; 
            }
         }
      }

      if (isprime){
         System.out.println(num + "is a Prime number");
      }else{
         System.out.println(num + "is not a Prime number");

}
}  
}
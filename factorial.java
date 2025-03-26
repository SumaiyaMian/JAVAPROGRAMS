import java.util.Scanner;
 
public class factorial{
 public static void main (String[] args){
   Scanner Scanner = new Scanner(System.in);
 
   System.out.println("Enter a number:");
   int num = Scanner.nextInt();
  
   int factorial = 1;
   for ( int  i=1 ; i<=num; i++){
         factorial*=i;
    }

      System.out.println("The Factorial " + num + " is " + factorial);
 }

}


import java.util.Scanner;
 
public class reverseastring{
 public static void main (String[] args){
   Scanner Scanner = new Scanner(System.in);
 
   System.out.println("Enter a number:");
   String input = Scanner.next();

   String reversed = "";
   for ( int i= input.length()-1; i>=0;i--){
      reversed+=input.charAt(i);
   }

      System.out.print("Reversed String:" +reversed);
   

 }
}
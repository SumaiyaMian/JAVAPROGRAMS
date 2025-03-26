import java.util.Scanner;
 
public class reverseastring{
 public static void main (String[] args){
   Scanner Scanner = new Scanner(System.in);
 
   System.out.println("Enter a number:");
   String input = scanner.nextline();

   String reversed = "";
   for ( int I = input.length()-1; i>0; i--){
      reversed+=input.charAt(I);
   }

   System.out.println("Reversed String:" + reversed);
   }

 }
}
import java.util.Scanner;
 
public class simplecalculator{
 public static void main (String[] args){
   Scanner scanner = new Scanner(System.in);
 
   System.out.println("Enter the first number:");
   Double num1 = scanner.nextDouble();


   System.out.print("Enter the second number:");   
   Double num2 =  scanner.nextDouble();

   System.out.print("Choose operation on ((+,-,*,/):");

   char operator =  scanner.next().charAt(0);

   double result = 0;
   switch (operator){
      case '+':
        result =  num1+num2;
        System.out.println("The result is:"+result);
        break;
      case '-':
        result = num1-num2;
        System.out.println("The result is:"+result);
        break;
      case '*':
        result = num1*num2;
        System.out.println("The result is:"+result);
        break;
      case '/':
        if (num2!=0){
            result = num1/num2;
        }else{
        System.out.println("Invalid opertor:");
        return;
        }
        System.out.println("The result is:"+ result);
	}
 }
}


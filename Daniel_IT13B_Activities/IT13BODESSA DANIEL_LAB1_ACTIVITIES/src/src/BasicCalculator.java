
package activities.MIDTERM;
import java.util.Scanner;
public class BasicCalculator {
      public static double add(double a, double b){
     return a + b;
    }
    
     public static double subtract(double a, double b){
     return a - b;
    }
     
         public static double multiply(double a, double b){
     return a * b;
    }
        public static double divide(double a, double b){
            if(b == 0){
               System.out.println("Error! Division by zero."); 
               return 0;
            }
 
    return a / b;
    }
        
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first Number: ");
        double num1 = scanner.nextInt();
        
       
        System.out.print("Enter Second Number: ");
        double num2 = scanner.nextInt();
        
        System.out.println("Select Operation: ");
        
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        
        int choice = scanner.nextInt();
        
        double result = 0;
        if (choice == 1){
            result = add(num1, num2);
        }   else if (choice == 2){
            result = subtract(num1, num2);
        }   else if (choice ==3){
            result = multiply(num1, num2);
        }    else if (choice ==4){
            result = divide(num1, num2);  
        } else{
            System.out.println("Invalid choice!");
            
            return;
        }
        System.out.printf("Result: %.2f\n", result);
        
        scanner.close();
            
        }
    }
  
    


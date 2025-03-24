
package Midterm;


public class Bocon_DanielO_Multi_Dimensional_Array {
    
    public static void main(String[] args) {
        int numbers[][] = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            
        };
        for (int m = 0; m < numbers.length; m++){
            System.out.print("The elements in Row " + (m + 1) + ": ");
            for (int j = 0; j < numbers[m].length; j++) {
                  
                System.out.print(numbers[m] [j] + " ");
                
            }
            System.out.println();
        }
    }
    
}

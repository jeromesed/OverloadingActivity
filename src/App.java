public class App {
     /**
     * This method takes in two int parameters to add.
     * 
     */
    private static int sum2(int num1, int num2){
        return num1 + num2;
    }
     /**
     * This method takes in 3 int parameters to add.
     * 
     */
    private static int sum3(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }

    /**
     * Modify the methods in such a way that the Class App
     * can now have 2 overloaded computeSum() methods.
     * One computing the sum of two numbers, and one computing the sum
     * of three numbers. 
     */
    void computeSum(int num1, int num2){
        int sum = num1 + num2;
        System.out.println("Sum of two numbers is " + sum);
    }
    void computeSum2(int num1, int num2, int num3){
        int sum = num1 + num2 + num3;
        System.out.println("Sum of three numbers is: " + sum);
    }
    
    /**
     * 
     * Create method that returns the greater integer value
     */
    public static int greatVal(int num1, int num2){
        if (num1 > num2){
            return num1;
        } else{
            return num2;
        }
      }
      /**
     * 
     * Create method that returns the greater integer value
     */
      public static double greatVal(double num1, double num2){
        if (num1 > num2){
            return num1;
        } else{
            return num2;
        }
        }
        
    public static void main(String[] args) throws Exception {
   
     /**
         * Create Method calls that takes in 2 parameters, and 3 parameters
         * respectively and computes their sum.
         */
    System.out.println("The Sum of the 2 numbers is: " + App.sum2(1, 2));
    System.out.println("The Sum of the 3 numbers is: " + App.sum3(1, 2, 3));

    System.out.println("");// Spaceing 

    App sc = new App();
    sc.computeSum(2, 4);
    sc.computeSum2(20, 40, 60);

    System.out.println(""); // Spaceing

        /**
         * Call the greaterValue method with integer parameters
         */
    System.out.println("The Greater Value of 1 and 4 is: " + App.greatVal(1,4));

        /**
         * Call the greaterValue method with double parameters
         */
    System.out.println("The Greater Value of 6.9 nad 2.1 is: "+ App.greatVal(6.9,2.1));

    }
}

package Welcome.methodsandconstructors;
import java.io.*;
 class MethodProg {
     int c;

     /* public static void main(String[] args) {
          System.out.println(" hi all");
          //MethodProg method1= new MethodProg();*/
     public int addition(int a, int b) {
         c = a + b;
         return c;
     }
 }
         class GFG {

             // Main driver method
             public static void main(String[] args)
             {

                 // Creating object of class 1 inside main() method
                 MethodProg md = new MethodProg();

                 // Calling method of above class
                 // to add two integer
                 // using instance created
                  int s = md.addition(1,2);

                 // Printing the sum of two numbers
                 System.out.println("Sum of two integer values :"
                         + s);
             }
         }









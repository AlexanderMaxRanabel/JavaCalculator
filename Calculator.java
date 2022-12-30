import java.util.*;

 // Compiler version JDK 11.0.2

 class Calculator
 {
   public static void main(String args[])
   { 
     
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Please Enter A Number");
    int x = scanner.nextInt();
    System.out.println("Please Enter A Number");
    int y = scanner.nextInt();
    System.out.println("Please Enter A Number");
    int z = scanner.nextInt();
    
    int sum = y + z;
    int equ = y - z;
    int mul = y * z;
    int div = y / z;
    
    if (x == 1){
      System.out.println(sum);
    }
    if (x == 2){
      System.out.println(equ);
    }
    if (x == 3){
      System.out.println(mul);
    }
    if (x == 4){
      System.out.println(div);
    }
   }
 }

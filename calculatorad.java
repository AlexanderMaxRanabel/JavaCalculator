import java.util.*;

 // Compiler version JDK 11.0.2

 class Dcoder
 {
   public static void main(String args[])
   { 
     
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Please Enter A Number for the operation. 1 2 3 4 are for four main equations and rest of them what if these numbers switched places");
    int x = scanner.nextInt();
    System.out.println("Please Enter A Number");
    int y = scanner.nextInt();
    System.out.println("Please Enter A Number");
    int z = scanner.nextInt();
    
    int sum = y + z;
    int equ = y - z;
    int mul = y * z;
    int div = y / z;
    int rsum = z + y;
    int requ = z - y;
    int rmul = z * y;
    int rdiv = z / y;
    
    int sqcontrol = 0;
    int sq = 0;
    int recmode = 0;
    
    if (x == 1){
      System.out.println("Here v");
      System.out.println(sum);
    }
    if (x == 2){
      System.out.println("Here v");
      System.out.println(equ);
    }
    if (x == 3){
      System.out.println("Here v");
      System.out.println(mul);
    }
    if (x == 4){
      System.out.println("Here v");
      System.out.println(div);
    }
    if (x == 5){
      System.out.println("Here v");
      System.out.println(rsum);
    }
    if (x == 6){
      System.out.println("Here v");
      System.out.println(requ);
    }
    if (x == 7){
      System.out.println("Here v");
      System.out.println(rmul);
    }
    if (x == 8){
      System.out.println("Here v");
      System.out.println(rdiv);
      }
      
    if (x == 99){
      System.out.println("1 to calculate the are of a square 2 to calculate the perimeter 3 to start rectangle mode");
      sqcontrol = scanner.nextInt();
    }
    if (sqcontrol == 1){
      System.out.println("Please Enter How Long a side of the Square");
      sq = scanner.nextInt();
      int sqarea = sq * sq;
      System.out.println(sqarea);
    }
       
   if (sqcontrol == 2){
      System.out.println("Please Enter How Long a side of the Square");
      sq = scanner.nextInt();
      int sqperi = sq * 4;
      System.out.println(sqperi);
   }
      
    if (sqcontrol == 3){
        System.out.println("You entered Rectangle Mode. 1 Calculate the area of a rectangle. 2 to calculate the perimeter of rectangle");
        recmode = scanner.nextInt();
        }
     
    if (recmode == 1){
        System.out.println("Please enter how long the short side of the rectangle");
        int vb = scanner.nextInt();
        System.out.println("Please enter how long the short side of the rectangle");
        int bv = scanner.nextInt();
        
        int recarea = vb * bv;
        System.out.println(recarea);
        }
       
    if (recmode == 2){
        System.out.println("Please enter how long the short side of the rectangle");
        int ty = scanner.nextInt();
        System.out.println("Please enter how long the short side of the rectangle");
        int yt = scanner.nextInt();
        
        int recperi = ty + ty + yt + yt;
        System.out.println(recperi);
        }
   }
}

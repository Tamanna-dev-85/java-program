  //public class Basics{
   // public static void main(String args[]){
       // System.out.print("12345\nhello\n  world\n"); // ln or \n ka use next line ke liye hota hai
        
   // }
//}
    

//  }

// public class Basics{
//   public static void main(String args[]) {
//     System.out.println("****");
//     System.out.println("***");
//     System.out.println("**");
//     System.out.println("*");      
//   }
// }


//VARIABLE IN JAVA

// public class Basics{
//     public static void main(String args[]) {
//         int a = 10;
//         int b = 5;
//         System.out.println(a);
//         System.out.println(b);
//         System.out.println(a+b);

//         String name = "Eram";
//         System.out.println(name);
        
//         a=b;
//         System.out.println(a);
//     }
// }


//DATA TYPE USE

// public class Basics{
//     public static void main(String[] args) {
//         byte b=7;
//         System.out.println(b);
//         char ch='a';
//         System.out.println(ch);
        
//     }
// }
//SUM OF A & B

// public class Basics{
//     public static void main(String args[]){
//         int a=10;
//         int b=5;
//         int sum=a+b;
//         System.out.println(sum);
//     }
// }

//INPUT IN JAVA
// import java.util.*;

// public class Basics{
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
        // String input = sc.next();
        // System.out.println(input);

        // String name = sc.nextLine();
        // System.out.println(name);

        // int number=sc.nextInt();
        // System.out.println(number);

        // float num=sc.nextFloat();
        // System.out.println(num);

        // boolean boo=sc.nextBoolean();
        // System.out.println(boo);

        
//    }

//}

// import java.util.*;
// public class Basics{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int put=sc.nextInt();
//         System.out.println(put);
//     }
// }

// SUM OF A & B USING INPUT

// import java.util.*;
// public class Basics{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int a=sc.nextInt();
//         int b=sc.nextInt();
//         int sum= a+b;
//         System.out.println(sum);
//     }
// }

//PRODUCT OF A & B

// import java.util.*;
// public class Basics{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int product = a*b;
//         System.out.println(product);
//     }
// }

//Area of a circle

// import java.util.*;
// public class Basics{
//     public static void main(String args[]) {
//         Scanner sc=new Scanner(System.in);
//         float rad = sc.nextFloat();
//         float area = 3.14f * rad *rad;
//         System.out.println(area);
//     }
// }

//Area of a square
//   import java.util.*;
//   public class Basics{
//   public static void main(String args[]) {
//        Scanner sc=new Scanner(System.in);
//        float side= sc.nextFloat();
//        float area =  side *side;
//        System.out.println(area);
//  }
// }

//AREA OF RECTANGLE

// import java.util.*;
//   public class Basics{
//   public static void main(String args[]) {
//        Scanner sc=new Scanner(System.in);
//        int length= sc.nextInt();
//        int breath= sc.nextInt();

//        int area =  length *breath;
//        System.out.println(area);
//  }
// }

// import java.util.Scanner;

// class Basics{
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter your name: ");
//         String name = sc.nextLine();

//         System.out.println("Hello " + name);
//     }
// }

// import java.util.Scanner;

// class Basics{

//     static int add(int a, int b) {
//         return a + b;
//     }

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter first number: ");
//         int a = sc.nextInt();

//         System.out.print("Enter second number: ");
//         int b = sc.nextInt();

//         System.out.println("Sum = " + add(a, b));
//     }
// // }

// import java.util.Scanner;

// class Basics{
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter a number: ");
//         int num = sc.nextInt();

//         System.out.println("You entered: " + num);
//     }
// }

// public class Basics{

//     public static void main(String[] args) {
//         for(int i = 1; i<=6;i++){
//             for(int j = 1; j<=(4-i+1); j++){
//                System.out.print("*");
//             }
//            System.out.println();
//         }
//     }
// }

// public class Basics{
//    public static void main(String[] args) {
    
//     int a=2,b=3;
//     int larger = (a>b)?a:b;
//     System.out.println(larger);
//   }
// }

// public class Basics{
//     public static void main(String[] args) {
//         int[] arr = {10, 20, 30, 40, 50};

//         System.out.println("Array elements are:");

//         for (int i = 0; i < arr.length; i++) {
//             System.out.println(arr[i]);
//         }
//     }
 //}
 
//  public class Basics{
//     public static void main(String[] args) {
//         int[] arr = {10, 20, 30, 40, 50};
//         int sum = 0;

//         for (int i = 0; i < arr.length; i++) {
//             sum = sum + arr[i];
//         }

//         System.out.println("Sum = " + sum);
//     }
// }


import java.util.Scanner;

public class  Basics {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        System.out.println("Enter 5 numbers:");

        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Array elements are:");

        for (int i = 0; i < 5; i++) {
            System.out.println(arr[i]);
        }

        sc.close();
    }
}


// public class hello{
//     public static void main(String[] args) {
//          String name = "Eram";
//           System.out.println(name);
//     }
// }

// //practice

//how to use the pattern

// public class hello{
//     public static void main(String[] args) {
//         int n=7;
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
// System.out.println();
//         }

//     }
// }

// public class hello{
//     public static void main(String[] args) {
//         int n=7;
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=(n-i+1);j++){
//                 System.out.print("*");
//             }
// System.out.println();
//         }

//     }
// }

// public class hello{
//     public static void main(String[] args) {
//         int n=7;
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print(j);
//             }
// System.out.println();
//         }

//     }
// }

// public class hello{
//     public static void main(String[] args) {
//         int n=7;
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=(n-i+1);j++){
//                 System.out.print(j);
//             }
// System.out.println();
//         }

//     }
// }

// public class hello {

//     public static void main(String[] args) {
//         int a=3;
//         int b=2;
//         int c=a+b;
//         System.out.println(c);
//     }
// }

// import java.util.Scanner;

// public class hello {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
        
//         int a=sc.nextInt();
//         int b=sc.nextInt();

//         int num=a+b;
//         System.out.println(num);
//     }
// }

// import java.util.*;
// public class hello{
//     public static void main(String[] args) {
//          Scanner sc = new Scanner(System.in);
//           int n = sc.nextInt();
//          int counter = 1;
       
//          while(counter<=n){
//              System.out.print(counter + " ");
//           counter++;
//          }
//  System.out.println();
//      }
//  }

// public class hello{
//    public static void main(String[] args) {
        
//          for(int i=1; i<=10; i++){
//              System.out.println("hello world");
//          }
//          System.out.println("hw printed");
//      }
//  }

// public class Opera{
//    public static void main(String[] args) {
    
//       int number=3;

//       switch(number){

//         case 1: System.out.println("samosa");
//         break;
//         case 2: System.out.println("pizza");
//         break;
//         case 3: System.out.println("momo");
//         break;
//         default:System.out.println("dreaming");

//     }
//   }
// }

// public class hello{
//    public static void main(String[] args) {
    
//     int marks=25;
    


//     String larger = (marks>=33)?"PASS":"FAIL";
//     System.out.println(larger);
//   }
// }

// public class hello{
//   public static void main(String[] args) {
//       int age=20;
//       if(age>=18){
//         System.out.println("voted");
//       }
//       else{
//         System.out.println("not voted");
//       }
//   }
//  }


// import java.util.*;
// public class hello{
//     public static void main(String[] args) {
//         Scanner sc =new Scanner(System.in);
//        int A =sc.nextInt();
//        int B=sc.nextInt();
       
//         if(A>=B){
//             System.out.println("A is the largest of 2");

//         }
//         else{
//             System.out.println("B is the largest of 2");
//         }
//     }
// }

// public class hello{
//     public static void main(String[] args) {
//         int x = 9, y = 12;
//         int a = 2, b = 4, c = 6;

//         int exp = 4/3 * (x + 34) + 9 * (a + b * c) + (3 + y * (2 + a)) / (a + b*y);
//         System.out.println(exp);
//     }
// }

// public class hello{
//     public static void main(String[] args) {
//         int x = 200, y = 50 ,z=100;

//         if(x>y && y>z){
//             System.out.println("hello");
//         }
//         if(z>y && z<x){
//             System.out.println("java");
//         }
//         if((y+200)< x && (y+150)<z){
//             System.out.println("hello java");
//         }
//     }
// }

// public class hello{
//     public static void main(String[] args) {
//         int x = 2, y = 5;

//         int exp1 =(x*y/x);
//         int exp2 =(x*(y/x));

//         System.out.println(exp1);
//         System.out.println(exp2);


//     }
// }

// public class hello{
//     public static void main(String[] args) {
//         int A=10;
//          //A=A+10;
//          A+=10;
//          A*=10;
//         System.out.println(A);
//     }
// }

// public class hello{
//     public static void main(String[] args) {
//         int a = 10;
//         int b = a++;     //  ++a  means a+1
//         System.out.println(a);
//         System.out.println(b);

//     }
// }

// public class hello {
//     public static void main(String[] args) {
//         int A=10;
//         int B=5;
//         System.out.println("add="+(A+B));
//         System.out.println("sub="+(A-B));
//         System.out.println("mul="+(A*B));
//         System.out.println("div="+(A/B));
//         System.out.println("mod="+(A%B));



//     }
// }

// public class hello{
//     public static void main(String[] args) {
//         byte b=5;
//         byte a=(byte)(b*2);
//         System.out.println(a);
//     }
// }

// public class hello{
//     public static void main(String[] args) {
//         System.out.println((3>10)||(5>10));
//     }
// }

// public class hello{
//       public static void main(String args[]){
//             int n = 18099;

//             while(n>0){
//                   int lastdigit = n % 10;
//                   System.out.print(lastdigit+" ");

//                   n = n/10;
//             }
//             System.out.println();
//       }
// }

// import java.util.*;
// public class hello{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int put=sc.nextInt();
//         System.out.println(put);
//     }
// }

// import java.util.*;
// public class hello{
//     public static void main(String args[]) {
//         Scanner sc=new Scanner(System.in);
//         float rad = sc.nextFloat();
//         float area = 3.14f * rad *rad;
//         System.out.println(area);
//     }
// }

// import java.util.*;
//   public class hello{
//   public static void main(String args[]) {
//        Scanner sc=new Scanner(System.in);
//        float side= sc.nextFloat();
//        float area =  side *side;
//        System.out.println(area);
//  }
// }

// import java.util.*;
// public class hello{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int product = a+b;
//         System.out.println(product);
//     }
// }

import java.util.*;
public class hello{
       public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            float a = 23.5f;
            int b = (int)a;
            System.out.println(b);

char ch = 'a';
char ch2 ='b';
int num=ch;
int num2=ch2;
System.out.println(num);
System.out.println(num2);

        }
 }

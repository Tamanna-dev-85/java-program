
//import java.util.Scanner;


//import java.util.Scanner;


//         int counter = 0;

//         while(counter<5){
//             System.out.println("Hello world");
//             counter++;
//         }
//         System.out.println("printed HW 5x");
//     }
// }
//  public class loops{
//     public static void main(String[] args) {
//         int counter =1;
//         while (counter<=100){
//             System.out.print(counter+" ");
//             counter++;
//         }
//          System.out.println();
//     }
//  }


// public class loops{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int counter = 1;
       
//         while(counter<=n){
//             System.out.print(counter + " ");
//          counter++;
//         }
// System.out.println();
//     }
// }


      //print sum of first n natural numbers

// import java.util.Scanner;

// public class loops{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         int sum = 0;
//         int i = 1;

//         while(i<=n){
//          sum += i;
//          i++;
//         }
//         System.out.println("sum is the :"+sum);
//     }
//  }     

// public class loops{
//     public static void main(String[] args) {
//         int i = 0;

//         while(i<5){
//             System.out.println("HELLOWorld");
//             i++;
//         }
//         System.out.println("printed HW 5x");
//     }
// }

// import java.util.Scanner;

// public class loops{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int i = 1;

//         while(i<=n){
//             System.out.print(i+ " ");
//             i++;

//         }
//         System.out.println();
//     }
// }
// public class loops{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         int sum=0;
//         int i = 1;

//         while(i<=n){
//             sum+= i;
//             i++;

//         }
//         System.out.println("sum is the :"+sum);
//     }
// }

//      FOR LOOP

// public class loops{
//     public static void main(String[] args) {
        
//         for(int i=1; i<=10; i++){
//             System.out.println("hello world");
//         }
//         System.out.println("hw printed");
//     }
// }

// public class loops{
//     public static void main(String[] args) {
        
//         // for(int line= 1; line<=4; line++){
//         //     System.out.println("****");
//         // }

//         int line = 1;
//         while(line<=4){
//             System.out.println("****");
//             line++;
//         }
//     }
// }


// REVERSE OF A NUMBER

// public class loops{
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
// public class loops{
//       public static void main(String[] args) {
//           Scanner sc = new Scanner(System.in);

//           int n = sc.nextInt();

//           while(n>0){
//             int lastdigit = n % 10;
//             System.out.print( lastdigit);

//             n = n/10;
//           }
//           System.out.println();
//       }
// }

// public class loops{
//       public static void main(String[] args) {
//           int n = 10899;
//           int rev = 0;

//           while(n>0){
//             int lastdigit = n % 10;
//             rev = (rev*10) + lastdigit;
//             n= n/10;
//           }
//           System.out.println(rev);
//       }
// }


// public class loops{
//       public static void main(String[] args) {
//           int counter = 1;
//           do { 
//               System.out.println("hello world");
//               counter++;
//           } while (counter<=10);
//       }
// }

// public class loops{
//     public static void main(String[] args) {
//         for (int i = 1; i <= 10; i++) {

//             if(i==5){
//                 break;
//             }
//           System.out.println(i);  
//         }
//         System.out.println("i am out of the loop");
//     }
// }

// import java.util.Scanner;

// public class loops{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         do { 
//             System.out.println("enter your number: ");
//             int n = sc.nextInt();

//             if(n% 10==0){
//                 break;
//             }
//         } while (true);
//     }
// }

// public class loops{
//     public static void main(String[] args) {
//         for(int i = 1; i<=5;i++){
//             if(i ==3){
//                 continue;
//             }
//             System.out.println(i);
//         }
//     }
// }
// public class loops{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         do { 
//             System.out.print("enter your num: ");
//             int n = sc.nextInt();
            
//             if(n % 10 ==0){
//                 continue;
//             }

//             System.out.println("num was:"+n);
//         } while (true);
//     }
// }

// public class loops{
//       public static void main(String[] args) {
//             int counter=0;

//             while (counter<50) {
//                   System.out.println(counter);
//                   counter++;
                  
//             }
//             System.out.print("this is done");
//       }
// }

// public class loops{
//       public static void main(String[] args) {
//             for(int i=0;i<=5;i++){
//                   if (i==4){
//                         continue;
//                   }
// System.out.println(i);
//             }
//       }
//}

// import java.util.Scanner;

// public class loops{
//       public static void main(String[] args) {
//           Scanner sc= new Scanner(System.in);
//           do {
//             System.err.println("enter the number : "); 
//               int n = sc.nextInt();

//               if(n % 10 == 0){
//                   continue;
//               }
//               System.err.println("number was : "+ n);
//           } while (true);
              
//           }
//       }

// n is prime or not prime

// public class loops{
//       public static void main(String[] args) {
//           Scanner sc = new Scanner(System.in);
//           int n = sc.nextInt();
//           if(n==2){
//             System.err.println("n is prime");
//           }else{
//           boolean isPrime = true;
//           for(int i=2;i<=n-1;i++){
//             if(n%i==0){
//                   isPrime=false;
//             }
//           }
//           if(isPrime == true){
//             System.err.println("n is prime");
//           }else{
//             System.err.println("n is not prime");
//           }
//       }
// }} 


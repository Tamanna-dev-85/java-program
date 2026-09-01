//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();

//         if(a>0){
//             System.out.println("a is greater than 0");
//         }
//         else{
//             System.out.println("a is less than 0");
//         }
//     }
// }

// import java.util.Scanner;

// public class solution{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         float temp = sc.nextFloat();

//         if(temp>100){
//             System.out.println("fever");

//         }
//         else{
//             System.out.println("not fever");
//         }
//     }
// }

import java.util.Scanner;

public class solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     System.out.println("enter week number:");
     int week = sc.nextInt();

     switch(week){
        case 1:System.out.println("monday");
        break;
        case 2:System.out.println("Tuesday");
        break;

        case 3:System.out.println("Wednesday");
        break;

        case 4:System.out.println("Thursday");
        break;

        case 5:System.out.println("Friday");
        break;

        case 6:System.out.println("Saturday");
        break;

        case 7:System.out.println("Sunday");
        break;

        default:System.out.println("invalid");
        
     }
    }
}

// import java.util.Scanner;

// public class solution{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("input the year:");
//         int year = sc.nextInt();

//         boolean x = (year % 4) ==0;
//         boolean y = (year % 100) !=0;
//         boolean z = ((year % 100 ==0) && (year % 400 == 0));
        
//      if(x && (y ||z)){
//         System.out.println(year +" is leap year");
//      }
//      else{
//         System.out.println(year + "is not a leap year");

//      }
//     }
// }

// LOOPS SOLUTION
import java.util.*;

public class function{
    public static void tamanna(){
        System.out.println("i am tamanna");
        System.out.println("i am tamanna");

        System.out.println("i am tamanna");
        //return;
    }

//     public static void main(String[] args) {
//         tamanna();// function call
//     }
// }

// import java.util.*;
//public class function{
    public static void sum(){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the num a :");
        int a = sc.nextInt();

        System.out.print("enter the num b :");
        int b = sc.nextInt();
        int sum = a+b;

       System.out.println("sum is :"+sum);
    }
    public static void main(String[] args) {
        sum();
        tamanna();
    }
}
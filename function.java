
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
//     public static void sum(int a ,int b){
//         int sum = a+b;
//         System.out.println("sum is :"+sum);

//     }
    
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         sum(a,b);
        
//     }
// }

// public static int calculate(int a ,int b){ //parameter or formal parameter
//         int sum = a+b;
//         return sum;

    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int a = sc.nextInt();
    //     int b = sc.nextInt();
    //     int sum = calculate(a,b);// arguments or actual parameters
    //     System.out.println("sum is : "+ sum);
        
    // }
    
public static void swap(int a, int b){
    int temp = a;
    a = b;
    b = temp;
    System.out.println("a is :"+a);
    System.out.println("b is :"+b);

}
public static void main(String[] args) {
    int a=5;
    int b=10;
     swap(a,b);
    
}  
}


public static int multiply(int a,int b){
    int product = a*b;
    return product;
}

public static void main(String[] args) {
    int a=3;
    int b= 5;
    int prod = multiply(a,b);
    System.out.println(prod);

    prod = multiply(10, 3);
    System.out.println(prod);
     

}
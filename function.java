
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

//import java.util.*;
//public class function{
    public static void sum(int a ,int b){
        int sum = a+b;
        System.out.println("sum is :"+sum);

    }
    
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         sum(a,b);
        
//     }
// }

public static int calculate(int a ,int b){ //parameter or formal parameter
        int sum = a+b;
        return sum;

    }
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
// public static void main(String[] args) {
//     int a=5;
//     int b=10;
//      swap(a,b);
    
// }  
//}



public static int multiply(int a,int b){
    int product = a*b;
    return product;
}

// public static void main(String[] args) {
//     int a=3;
//     int b= 5;
//     int prod = multiply(a,b);
//     System.out.println(prod);

//     prod = multiply(10, 3);
//     System.out.println(prod);
     
//}
// }


public static int factorial(int n){
    int f = 1;

    for(int i=1;i<=n;i++){
        f = f * i;
    }
    return f; 
}



public static void butterfly (int n ){
    for (int i =1;i<=n;i++){
        for (int j=1;j<=i;j++){
            System.out.print("*");
        }
        for (int j=1;j<=2*(n-i);j++){
            System.out.print(" ");
        }
        for (int j =1 ;j<=i; j++){
            System.out.print("*");
        }
        System.out.println();
    }
    for (int i=n;i>=1;i--){
         for (int j=1;j<=i;j++){
            System.out.print("*");
        }
        for (int j=1;j<=2*(n-i);j++){
            System.out.print(" ");
        }
        for (int j =1 ;j<=i; j++){
            System.out.print("*");
        }
        System.out.println();
    }
}

public static  int multiplys(int a,int b){
   return a*b;
}

//public static void main(String[] args) {
   // System.out.println(factorial(7));
   //butterfly(5);
 // System.out.println(multiplys(3, 2));
   
//}

public static int binCoeff(int n, int r){
    int fact_n = factorial(n);
    int fact_r = factorial(r);
    int fact_nmr = factorial(n-r);

    int binCoeff = fact_n / (fact_r * fact_nmr);
    return  binCoeff;

}

public static int mul(int a,int b){
    int product=a*b;
    return product;
}

public static int factorial1(int n){
    int f = 1;
    for (int i = 1; i <= n; i++) {
        f= f*i;
        
    }
    return f;
}

//function of 2 num
public static int sum1(int a,int b){
    return a+b;
}
//function of sum of 3 num
public static int sum1(int a,int b,int c){
    return a+b+c;
}

//function of 2 num integer
public static int sum2(int a,int b){
    return a+b;
}
//function of sum of 3 num float
public static float  sum2(float a,float  b){
    return a+b;
}

public static void main(String[] args) {
    //System.out.println(binCoeff(5, 2));
    //System.out.println(mul(3, 2));
    //System.out.println(factorial1(4));
    System.out.println(sum2(3, 4));
    System.out.println(sum2(3.1f, 4.2f));

    
}
}

  // public class test {
  //    public static void main(String[] args) {
  //        for(int i = 1;i<=4; i++){
  //          System.err.println("hello world");
  //        }
  //        System.err.println("hw printed");
  //    }

  //   }

    // public class test{
    //   public static void main(String[] args) {
    //       int n = 23456;

    //       while(n>0){
    //         int lastdigit = n%10;
    //         System.out.print(lastdigit+" ");

    //         n= n/10;
    //       }
    //    System.out.println();
          
    //   }
    // }


//     public class test{
//     public static void main(String[] args) {
//         int n = 8;
//         for(int i = 1; i<=n; i++){
//             for( int numb=1; numb<=(n-i+1); numb++){
//                 System.out.print(numb);
//             }
            
//         }System.out.println();
//     }
//

// public class test{
//   public static int getlarge(int number[]){
//     int largest=Integer.MIN_VALUE;
//     for(int i=0;i<number.length;i++){
//       if(largest<number[i]){
//         largest=number[i];
//       }

//     }
//     return largest;
//   }
//   public static void main(String[] args) {
//       int numbers[]={1,5,7,9,10,3};
//       System.err.println("lasgest value:"+getlarge(numbers));
//   }
// }

// public class test {
//     public static void main(String[] args) {
//         int[] arr = {10, 20, 30, 40, 50};

//         for (int i = arr.length - 1; i >= 0; i--) {
//             System.out.println(arr[i]);
//         }
//     }
// }

// public class test {
//     public static void main(String[] args) {
//         int[] arr = {10, 50, 30, 80, 20};
//         int max = arr[0];

//         for (int i = 1; i < arr.length; i++) {
//             if (arr[i] > max) {
//                 max = arr[i];
//             }
//         }

//         System.out.println("Largest = " + max);
//     }
// }


//function calling

public class test{
  public static void helloworld(){
    System.out.println("hello world");
  }

  public static void add(int a,int b){
     System.out.println(a+b);
   }

public static void swaap(int a,int b){
  int temp=a;
  a=b;
  b=temp;
System.out.println("a="+a);
System.out.println("b="+b);


}
   
public static int multiply(int a,int b){
  int product= a*b;
  return product;

}

public static int factorial(int n){
  int fact=1;
  for(int i=1;i<=n;i++){
    fact=fact*i;
  }
  return fact;
}

public static int bincoeff(int n, int r){
  int fact_n = factorial(n);
  int fact_r = factorial(r);

  int fact_nmr=factorial(n-r);

  int bincoeff = fact_n/(fact_r*fact_nmr);
  return bincoeff;

}

//function overloading
public static int sum(int a,int b){
  return a+b;
}

public static int sum (int a, int b,int c){
  return a+b+c;
}
//function overloading

public static int sum1(int a,int b){
  return a+b;
}
public static float sum1(float a, float b){
  return a+b;
}
  public static void main(String[] args) {
      // helloworld();
      // add(5,3);
      //swaap(5,10);
      //int prod=multiply(3, 5);
      //System.out.println(prod);
      //System.out.println((bincoeff(5, 2)));
      
      System.out.println(sum(11,8));
      System.out.println(sum(11,8,2));

      System.out.println(sum1(3, 9));
      System.out.println(sum1(8.6f, 5.1f));


  }
}
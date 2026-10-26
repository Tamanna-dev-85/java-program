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

public class test {
    public static void main(String[] args) {
        int[] arr = {10, 50, 30, 80, 20};
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Largest = " + max);
    }
}
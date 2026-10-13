//public class array {
    //public static void main(String[] args) {
       // int marks[]=new int[100];
       // Scanner sc = new Scanner(System.in);

    //     marks[0] = sc.nextInt(); //phy
    //     marks[1] = sc.nextInt(); //chem
    //     marks[2] = sc.nextInt(); //math
        
    //     System.out.println("phy: "+marks[0]);
    //     System.out.println("chem: "+marks[1]);
    //     System.out.println("math: "+marks[2]);

    //     //marks[2] =100;
    //     //marks[2]=marks[2]+1;
    //    // System.out.println("math: "+marks[2]);

    //    int percentage = (marks[0]+marks[1]+marks[2]) /3;
    //    System.out.println("percentage :"+ percentage+ "%");


     //}
    
//}


//lenght of array
//public class array{
  //  public static void main(String[] args) {
    //    int marks[]= new int[100];

      //  System.out.println("length of array:"+marks.lengt);
    //}
//}
// public class array {

//     public static void update(int marks[]){
//         for(int i=0;i<marks.length;i++){
//             marks[i]=marks[i] + 1;
//         }
//     }
//     public static void main(String[] args) {
//         int marks[]={96,98,99};
//         update(marks);

//         //print our marks

//         for(int i=0;i<marks.length;i++){
//             System.out.print(marks[i]+" ");
//         }
//         System.out.println();
//     }
// }


//linersearch

// public class array{
//   public static int linearSearch(int number[],int key){
//       for(int i=0;i<number.length;i++){
//         if(number[i]==key){
//           return i;
//         }
//       }
//       return -1;
//   }
//   public static void main(String[] args) {
//       int number[]={2,4,6,8,10,12,14,16};
//       int key=10;

//       int index=linearSearch(number, key);
//       if(index== -1){
//         System.out.println("not found");
//       }else{
//         System.out.println("linear is found :"+index);
//       }
//   }
// }

import java.util.*;
public class array{
  public static int getlargest(int number[]){
    int largest=Integer.MIN_VALUE;//infinity
    int smallest=Integer.MAX_VALUE;
    for(int i=0;i<number.length;i++){
      if(largest<number[i]){
        largest=number[i];
      }
      if(smallest>number[i]){
        smallest=number[i];
      }
    }
    System.out.println("smallest value is:"+smallest);
    return largest;
  }
  public static void main(String[] args) {
      int numbers[]={1,2,6,4,5};
      System.out.println("largest value is:"+getlargest(numbers));
  }
}
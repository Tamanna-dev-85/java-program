// public class pattern {
//     public static void main(String[] args) {
//         for(int i=1;i<=4;i++){
//             for(int j=1;j<=i;j++){
//                 System.err.print("*");
//             }
//             System.err.println();
//         }
//     }
    
// }

// public class pattern{
//      public static void main(String[] args) {
//         int n = 4;
//         for(int i=1;i<=4;i++){
//            for(int j=1;j<=(4-i+1);j++){
//             System.err.print("*");
//            }
//            System.err.println();
//         }
//     }
// }

// public class pattern{
//    public static void main(String[] args) {
//        int n=7;
//        for(int line=1;line<=n;line++){
//          for(int number=1;number<=line;number++){
//             System.err.print(number);
//          }
//          System.err.println();
//        }
//    }
// }

// public class pattern{
//    public static void main(String[] args) {
//        int n=5;
//        char ch ='A';

//        for( int line=1;line<=n;line++){
//          for(int chars=1;chars<=line;chars++){
//             System.out.print(ch);
//             ch++;
//          }
//          System.out.println();
//        }
//    }
// }

// public class pattern{
//     public static void main(String[] args) {
//        int  n =4;
//         for(int i=1;i<=n;i++){
//            for(int j=1;j<=i;j++){
//            System.out.print(j);
//            }
//            System.out.println();
//         }
//     }
// }

// public class pattern {
//     public static void main(String[] args) {
//         int n = 5;

//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= n - i; j++) {
//                 System.out.print(" ");
//             }
//             for (int k = 1; k <= (2 * i - 1); k++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }


// public class pattern {
//     public static void main(String[] args) {
//         int n = 5;

//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= n; j++) {
//                 if (i == 1 || i == n || j == 1 || j == n)
//                     System.out.print("* ");
//                 else
//                     System.out.print("  ");
//             }
//             System.out.println();
//         }
//     }
// }

// public class pattern{
//     public static void main(String[] args) {
//         int n = 5;

//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= i; j++) {
//                 if ((i + j) % 2 == 0)
//                     System.out.print("1 ");
//                 else
//                     System.out.print("0 ");
//             }
//             System.out.println();
//         }
//     }
// }
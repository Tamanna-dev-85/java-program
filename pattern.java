// public class pattern {
//     public static void main(String[] args) {
//         for(int i =1; i<=5; i++){
//           
//           ONE LINE

//             for(int j =1; j<=i; j++){
//                 System.out.print("*");
//             }
//           System.out.println();
//         }
//     }

    
// }

// public class pattern {

//     public static void main(String[] args) {
//         for(int i = 1; i<=4;i++){
//             for(int j = 1; j<=(4-i+1); j++){
//                System.out.print("*");
//             }
//            System.out.println();
//         }
//     }
// }

// public class pattern{
//     public static void main(String[] args) {
//         for(int i = 1; i<=4; i++){
//             for( int number=1; number<=i; number++){
//                 System.out.print(number);
//             }
//             System.out.println();
//         }
//     }
// }

// public class pattern{
//     public static void main(String[] args) {
//         for(int i = 1; i<=10; i++){
//             for( int number=1; number<=i; number++){
//                 System.out.print(number);
//             }
//             System.out.println();
//         }
//     }
// } 

// public class pattern{
//     public static void main(String[] args) {
//         int n = 5;
//         for(int i = 1; i<=n; i++){
//             for( int number=1; number<=(n-i+1); number++){
//                 System.out.print(number);
//             }
//             System.out.println();
//         }
//     }
// }

/*public class pattern{
    public static void main(String[] args) {
        int n = 4;
        char ch = 'A';
        for(int i = 1; i<=n; i++){
            for(int  chars=1; chars<=i; chars++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}*/

// public class pattern{
//     public static void main(String[] args) {

//         int rows = 4;
//         int cols = 5;

//         for (int i = 1; i <= rows; i++) {
//             for (int j = 1; j <= cols; j++) {

//                 if (i == 1 || i == rows || j == 1 || j == cols) {
//                     System.out.print("* ");
//                 } else {
//                     System.out.print("  ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }

/*public class pattern{
    public static void main(String[] args) {

        int n = 4;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}*/

public class pattern{
    public static void main(String[] args) {
        int n = 5;
        for(int i = 1; i<=n;i++){
            for(int number = 1; number<=(n-i+1); number++){
                System.out.print(number);
            }
            System.out.println();
        }
    }
}
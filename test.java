/*  public class test {
    public static boolean ispalindrome(int num){
        int palindrome = num ;
        int reverse =0;

        while (palindrome != 0 ){
            int lastdigit = palindrome%10;
            reverse = reverse*10+ lastdigit;
            palindrome = palindrome/10;
        }
        return reverse ==num;
        
    }
    public static void main(String[] args) {
       System.out.println(ispalindrome(121));
    }
} 
   */
  
public class test{
   public static void starprinting(int n ) {
        int nstar  = 8;
        for(int i =1;i<=n;i++){
            for ( int k=1;k<=n-i;k++){
                System.out.print(" ");
            }

            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void hollowrectangle(int totrows ,int totcolums ){
        for (int i =1;i<=totrows;i++){
            for (int j =1;j<=totcolums;j++){
                if (i==1||i==totrows||j==1||j==totcolums){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
       hollowrectangle(6,7 );
        
    }
}

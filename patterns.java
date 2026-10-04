
//print HOLLOW Rectangle
public class patterns {
    public static void hollowRec(int tolrows,int totcols){
        for(int i=1; i<=tolrows; i++){
            for(int j=1; j<=totcols; j++){
                if(i==1||i==tolrows||j==1||j==totcols){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
public static void main(String[] args) {
    hollowRec(6, 5);
}
    
}

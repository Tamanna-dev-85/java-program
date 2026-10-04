
//print HOLLOW Rectangle
public class patterns {
    public static void hollowRec(int tolrows,int totcols){
        for(int i=1; i<=tolrows; i++){ //outer loop
            for(int j=1; j<=totcols; j++){ //inner loop
                //cell - (i,j)
                if(i==1||i==tolrows||j==1||j==totcols){  //boundry cell
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }


 // Half - Pymarid pattern
 
 public static void HALF_PYMARID(int n){
    for(int i =1 ; i<=n; i++){ //outer loop

        //Spaces
        for(int j=1 ; j<=n-i; j++){ 
          System.out.print(" ");
        }

        //Stars
        for(int j =1 ; j<=i; j++){
          System.out.print("*");
        }
        System.out.println();
 } 
    }

    public static void HALF_PYMARID_numbers(int n){
    for(int i =1 ; i<=n; i++){ //outer loop
         
        //inner-number
        for(int j=1 ; j<=n-i+1; j++){ 
          System.out.print(j);
        }
        System.out.println();
 } 
    }



    public static void main(String[] args) {
    //hollowRec(6, 5);
    //HALF_PYMARID(4);
    HALF_PYMARID_numbers(5);
}
    
}


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

    // floyds tringle
public static void floydstriangle(int n){

    int counter=1;

       //outer
    for(int i=1;i<=n;i++){

        //inner= how many times will counter be printed
        for(int j=1;j<=i;j++){
            System.out.print(counter+" ");
            counter++;
        }
        System.out.println();
    }
}

// zero one triangle

public static void zero_one_triangle(int n){
for(int i= 1; i<=n; i++){
    for(int j=1; j<=i; j++){
        if((i+j)%2==0){
            System.out.print("1");
        } else {
            System.out.print("0");
        }
    }
      System.out.println();
}
}

// BUTTERFLY PATTERN

public static void butterfly(int n){

    //outer loop
    for(int i=1; i<=n; i++){

        //stars
        for( int j=1; j<=i; j++){
            System.out.print("*");
        }

        //spaces
        for( int j=1; j<=2*(n-i); j++){
            System.out.print(" ");
        }

        //stars
        for( int j=1; j<=i; j++){
            System.out.print("*");
        }
        System.out.println();
    }


    for(int i=n; i>=1; i--){

        //stars
        for( int j=1; j<=i; j++){
            System.out.print("*");
        }

        //spaces
        for( int j=1; j<=2*(n-i); j++){
            System.out.print(" ");
        }

        //stars
        for( int j=1; j<=i; j++){
            System.out.print("*");
        }
        System.out.println();
    }
}



//solid rhombus
public static void rhombus(int n){
    for(int i=1;i<=n;i++){
        
        //spaces
        for(int j=1;j<=(n-i);j++){
            System.out.print(" ");
        }

        //stars
        for(int j=1;j<=n;j++){
            System.out.print("*");
        }
        System.out.println();
    }
}


//hollow rectangle

public static void hollow_rectangle(int n){
    for(int i=1;i<=n;i++){

        //spaces
        for(int j=1;j<=(n-i);j++){
        System.out.print(" ");
    }

    //hollow_rectangle_stars

    for(int j=1; j<=n; j++){
        if(i==1||i==n||j==1||j==n){
        System.out.print("*");
    }else{
        System.out.print(" ");
    }
}
    System.out.println();
}

}

public static void diamond(int n){

    //first half
    for(int i=1;i<=n;i++){
        //spaces
        for(int j=1;j<=(n-i);j++){
            System.out.print("  ");
        }

        //stars
        for(int j=1;j<=(2*i)-1;j++){
            System.out.print("*");
        }
        System.out.println();
    }
    //2nd half
    for(int i=n;i>=1;i--){
        //spaces
        for(int j=1;j<=(n-i);j++){
            System.out.print("  ");
        }

        //stars
        for(int j=1;j<=(2*i)-1;j++){
            System.out.print("*");
        }
        System.out.println();
    }

}


public static void main(String[] args) {
    //hollowRec(6, 5);
    //HALF_PYMARID(4);
    //HALF_PYMARID_numbers(5);
    //floydstriangle(5);
    // zero_one_triangle(5);
   //butterfly(4);
  //rhombus(5);
  //hollow_rectangle(5);
  diamond(4);
}
    
}

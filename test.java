  // public class test {
  //    public static void main(String[] args) {
  //        for(int i = 1;i<=4; i++){
  //          System.err.println("hello world");
  //        }
  //        System.err.println("hw printed");
  //    }

  //   }

    public class test{
      public static void main(String[] args) {
          int n = 23456;

          while(n>0){
            int lastdigit = n%10;
            System.out.print(lastdigit+" ");

            n= n/10;
          }
       System.out.println();
          
      }
    }


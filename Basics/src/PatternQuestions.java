public class PatternQuestions {
    public static void main(String[] args) {
        // print 4x5 box using '*'
//        ******
//        ******
//        ******
//        ******

//        int i =1;
//        int j = 1;
//        for (i=1;i<=4;i++){
//            for (j=1;j<=5;j++){
//                System.out.print("*");
//            }
//            System.out.println("*");
//        }




        // Printing hollow rectangle
//        *****
//        *   *
//        *   *
//        *****

//        int i =1;
//        int j = 1;
//        for (i=1;i<=4;i++){
//            for (j=1;j<=5;j++){
//                if (i == 1 || j == 1 || i == 4 || j == 5){
//                    System.out.print("*");
//                }else{
//                    System.out.print(" ");
//                }
//            }
//            System.out.println( );
//        }


        // Printing Half Pyramid

//        *
//        **
//        ***
//        ****

         for (int i=1; i<=4; i++){

             for (int j=1; j<=i; j++){

                 System.out.print("*");
             }
             System.out.println();
         }

    }
}

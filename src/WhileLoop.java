public class WhileLoop {
    public static void main(String[] args) {
        /*
        10'dan 30'a kadar olan sayilardan 4 ile bolunebilenleri
         aralarinda bir bosluk olacak sekilde yanyana yazdirin
        for (int i = 10; i <=30 ; i++) {
            if(i%4==0){
                System.out.print(i+",");
            }
        */

        int a=10;
            while(a<30){
                if(a % 4 ==0){
                    System.out.print(a+",");
                }
                a++;

            }

        }


    }




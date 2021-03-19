import java.util.Scanner;

public class MethodCreation {
    public static void main(String args[]) {
        /*
		 Soru 2 ) Kullaniciya kac sayi toplamak istedigini sorun.
		 Kullanici 2,3 veya 4 degerini girerse,
		 kullanicidan bu sayilari girmesini isteyin
		 ve sayilarin toplamini yazdirin.
		 Kullanici toplamak istedigi sayi adedini 4’den buyuk girerse
		 “Cok sayi girdiniz, ben toplayamam” yazdirin.
		 2'den kucuk bir sayi girerse "En az 2 sayi girmelisiniz"
		 */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kac sayı toplamak istiyorsunuz:");
        int sayı = scanner.nextInt();




        int toplam = 0;
        if (sayı < 2) {
            System.out.println("En az 2 sayi girmelisiniz.");
        } else if (sayı > 4) {
            System.out.println("Cok sayı girdiniz ben toplayamam.");
        } else if (sayı == 2 ) {
            System.out.print("Lütfen bir sayı giriniz:");
            int sayı2 = scanner.nextInt();
            System.out.print("Lütfen bir sayı giriniz:");
            int sayı3 = scanner.nextInt();
            toplam+=sayı2+sayı3;
            System.out.println(toplam);
        }else if(sayı==3){
            System.out.print("Lütfen bir sayı giriniz:");
            int sayı2 = scanner.nextInt();
            System.out.print("Lütfen bir sayı giriniz:");
            int sayı3 = scanner.nextInt();
            System.out.print("Lütfen bir sayı giriniz:");
            int sayı4 = scanner.nextInt();
            toplam+=sayı2+sayı3+sayı4;
            System.out.println(toplam);
        }else if(sayı==4){
            System.out.print("Lütfen bir sayı giriniz:");
            int sayı2 = scanner.nextInt();
            System.out.print("Lütfen bir sayı giriniz:");
            int sayı3 = scanner.nextInt();
            System.out.print("Lütfen bir sayı giriniz:");
            int sayı4 = scanner.nextInt();
            System.out.print("Lütfen bir sayı giriniz:");
            int sayı5 = scanner.nextInt();
            toplam+=sayı2+sayı3+sayı4+sayı5;
            System.out.println(toplam);

        }
    }
}

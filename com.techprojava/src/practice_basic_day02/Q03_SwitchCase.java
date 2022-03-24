package practice_basic_day02;

import java.util.Scanner;

public class Q03_SwitchCase {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int sayi = scan.nextInt();

        int sonuc = (sayi / 10) % 10;

        if (sayi > 99 && sayi < 1000) {
            switch (sonuc) {
                case 0:
                    System.out.println("sifir");
                    break;
                case 1:
                    System.out.println("bir");
                    break;
                case 2:
                    System.out.println("iki");
                    break;
                case 3:
                    System.out.println("uc");
                    break;
                case 4:
                    System.out.println("dort");
                    break;
                case 5:
                    System.out.println("bes");
                    break;
                case 6:
                    System.out.println("alti");
                    break;
                case 7:
                    System.out.println("yedi");
                    break;
                case 8:
                    System.out.println("sekiz");
                    break;
                case 9:
                    System.out.println("dokuz");
                    break;

            }

            scan.close();


        } else System.out.println("yanlis rakam");
    }
}

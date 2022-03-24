package advancedJavaPractice;

import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("yasinizi giriniz ");
        int yas = scan.nextInt();

        if (yas < 18) {

            System.out.println("bagis yapamaz");
            return;
        } else {
            System.out.println("kilonuzu giriniz");
        }
        int kilo = scan.nextInt();

        if (kilo < 50) {
            System.out.println("bagis yapamaz");
        } else if (kilo >= 50) {
            System.out.println("bagis yapabilir");
        }

        if (yas <= 0 || kilo <= 0) {
            System.out.println("gecerli deger giriniz");
        }


    }
}


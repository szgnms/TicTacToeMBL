package practice_basic_day02;

import java.util.Scanner;

public class Q08_StringManipulation02 {
    public static void main(String[] args) {

        Scanner scan1 = new Scanner(System.in);
        System.out.println("Lutfen 1. kelimeyi giriniz");
        String kelime1 = scan1.next();
        Scanner scan2 = new Scanner(System.in);
        System.out.println("Lutfen 2. kelimeyi giriniz");
        String kelime2 = scan2.next();

        String sonuc = kelime1 + kelime2;
        String eksiksonuc = kelime1.substring(1) + kelime2.substring(1);

        eksikbirlestir(eksiksonuc);
        //  birlestir(sonuc);


    }

    private static void eksikbirlestir(String eksiksonuc) {
        System.out.println(eksiksonuc);
    }

    // public static void birlestir(String sonuc) {
    //System.out.println(sonuc);
    //}
}



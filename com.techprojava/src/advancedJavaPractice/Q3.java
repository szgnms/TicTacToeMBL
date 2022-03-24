package advancedJavaPractice;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("boyunuzu giriniz");
        double boy =scan.nextDouble();

        System.out.println("kilonuzu giriniz");
        double kilo= scan.nextDouble();


        double bmi=kilo/((boy/100)*(boy/100));

        if (bmi<=20){
            System.out.println("oldukca zayifsin");
        }else if (20<bmi& bmi<=25){
            System.out.println("normal sinirdasin");
        }else if (25<bmi& bmi<=30){
            System.out.println("sisman kategorindesin");
        }else if (30<bmi){
            System.out.println("obezsim");
        }







    }
}

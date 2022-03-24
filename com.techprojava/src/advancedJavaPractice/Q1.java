package advancedJavaPractice;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("toplam icin 1\ncikarma icin 2\nbolme icin 3\ncarpma icin4");
        int islem = scan.nextInt();
        System.out.println("Lutfen iki tam sayi giriniz");
        double num1=scan.nextDouble();
        double num2=scan.nextDouble();

        if (islem==1){
            System.out.println("toplama islemini sonucu : " +num1+"+"+num2+" =  "+(num1+num2) );
        }else if (islem==2){
            System.out.println("cikarma islemini sonucu : " +num1+"-"+num2+" =  "+(num1-num2) );
        }else if (islem==3){
            System.out.println("bolme islemini sonucu : " +num1+"/"+num2+" =  "+(num1/num2) );
        }else if (islem==4){
            System.out.println("carpma islemini sonucu : " +num1+"x"+num2+" =  "+(num1*num2) );
        }else System.out.println("hatali secim yaptiniz");






    }
}
package practice_basic_day02;

import java.util.Scanner;

public class Q10_StringManipulation {
    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);
        System.out.println("kelime giriniz");
        String kelime=scan.next();

        if (kelime.length()>=3){
            System.out.println(kelime.substring(kelime.length()-2).repeat(3));
        }else {
            System.out.println(kelime);
        }


    }
}

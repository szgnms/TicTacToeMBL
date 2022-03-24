package practice_basic_day02;

import java.util.Locale;
import java.util.Scanner;

public class Q12_StringManipulation {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("kelime giriniz");
        String kelime = scan.next().toLowerCase();


        if (kelime.startsWith("gh")) {
            System.out.println(kelime);
        } else if (kelime.startsWith("g")){
            System.out.println(kelime.charAt(0)+kelime.substring(2) );
        }else if (kelime.charAt(1)=='h'){
            System.out.println(kelime.substring(1));
        }else {
            System.out.println(kelime.substring(2));
        }


    }
}

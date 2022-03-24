package practice_basic_day02;

import java.util.Scanner;

public class Q01_NestedIfStatement {
    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);
        System.out.println("Yasinizi giriniz");
        int age=scan.nextInt();

        if (age >= 18) {
            if (age>=70){
                System.out.println("oy kullanabilir \n yasiniz: " + age + "---3 oy kullanabilirsiniz");
            }else if (age >=50){
                System.out.println("oy kullanabilir \n yasiniz: " + age + "---2 oy kullanabilirsiniz");
            }else {
                System.out.println("oy kullanabilir \n yasiniz: " + age + "---1 oy kullanabilirsiniz");
            }
        }else if (age>0 && age<18){
            System.out.println("yasiniz: " + age + "--- oy kullanamazsiniz");
        } else System.out.println("hatali giris");



        }
    }


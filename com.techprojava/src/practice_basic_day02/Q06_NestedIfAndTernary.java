package practice_basic_day02;

import java.util.Scanner;

public class Q06_NestedIfAndTernary {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("0-9 arasi bir sayi giriniz");
        int sayi=scan.nextInt();

         //String sonuc= (sayi==0)? "sifir":
         //        (sayi==1)? "bir":
         //        (sayi==2)? "iki":
         //        (sayi==3)? "uc":
         //        (sayi==4)? "dort":
         //        (sayi==5)? "bes":
         //        (sayi==6)? "alti":
         //        (sayi==7)? "yedi":
         //        (sayi==8)? "sekiz":
         //        (sayi==9)? "dokuz":"gecersiz";

        //System.out.println("sonuc = " + sonuc);


        if (sayi<=10 && sayi>=0){
            if (sayi==0){
                System.out.println("sifir");
            }else if (sayi==1){
                System.out.println("bir");
            }else if (sayi==2){
                System.out.println("iki");
            }else if (sayi==3){
                System.out.println("uc");
            }else if (sayi==4){
                System.out.println("dort");
            }else if (sayi==5){
                System.out.println("bes");
            }else if (sayi==6){
                System.out.println("alti");
            }else if (sayi==7){
                System.out.println("yedi");
            }else if (sayi==8){
                System.out.println("sekiz");
            }else if (sayi==9){
                System.out.println("dokuz");
            }
        }else System.out.println("gecersiz");





    }
}

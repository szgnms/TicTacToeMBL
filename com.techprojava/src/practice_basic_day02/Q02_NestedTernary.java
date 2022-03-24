package practice_basic_day02;

public class Q02_NestedTernary {
    public static void main(String[] args) {

        char finalNotu = 't';
        String sonuc = "";

        sonuc = (finalNotu == 'A') ? "gayet basarili" :
                (finalNotu == 'B') ? "basarili" :
                        (finalNotu == 'C') ? "ha gayret" : "digerleri";

        System.out.println("sonuc = " + sonuc);


    }
}

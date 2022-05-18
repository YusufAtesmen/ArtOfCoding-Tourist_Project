import OneDayTrip.Hamam;

import java.util.Scanner;

public class Muze {
    static int muzeBilet = 0;
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        welcome();


    }


    private static void welcome() {
        System.out.println("");
        System.out.println("=======================================================");
        System.out.println("****   Lütfen Yapmak Istediğiniz Işlemi Seçiniz   *****");
        System.out.println("=======================================================");
        System.out.println("\n1-Canlı Rehber Eşliğinde-200TL\n2-Dijital Rehber Eşliğinde-100TL\n3-Cıkış");
        switch (scan.nextInt()) {


            case 1:
                muzeBilet += 200;
                Hamam.hesapla(muzeBilet);
                break;
            case 2:

                muzeBilet += 100;
                Hamam.hesapla(muzeBilet);
                break;
            case 3:


                Hamam.hesapla(muzeBilet);

            default:
        }
    }
}

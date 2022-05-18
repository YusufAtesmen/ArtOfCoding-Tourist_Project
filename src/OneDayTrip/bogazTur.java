import OneDayTrip.Hamam;

import java.util.Scanner;

public class bogazTur {
    static int bogazBilet = 0;
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        welcome();

    }

    private static void welcome() {
        System.out.println("");
        System.out.println("=======================================================");
        System.out.println("****   Lütfen Yapmak Istediğiniz Işlemi Seçiniz   *****");
        System.out.println("=======================================================");
        System.out.println("\n1-Boğaz turu-200TL\n2-Fasıl-125TL\n3-Yemek menü(balık)-150TL\n4-Cıkış");
        switch (scan.nextInt()) {


            case 1:
                bogazBilet += 200;
                welcome();
                break;
            case 2:

                bogazBilet += 125;
                welcome();
                break;
            case 3:
                bogazBilet += 150;
                welcome();
                break;
            case 4:
                Hamam.hesapla(bogazBilet);
                break;

        }
    }
}

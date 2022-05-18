package OneDayTrip;

import java.util.Scanner;

public class Hamam {
    static int hamamBilet = 0;
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {


        welcome();
    }

  public static void welcome() {
        System.out.println("");
        System.out.println("=======================================================");
        System.out.println("****   Lütfen Yapmak Istediğiniz Işlemi Seçiniz   *****");
        System.out.println("=======================================================");
        System.out.println("\n1-Türk hamamı-100TL\n2-Sauna-105TL\n3-Masaj-150TL\n4-Kese-70TL\n5-Cıkış");
        switch (scan.nextInt()) {


            case 1:
                hamamBilet += 100;
                welcome();
                break;
            case 2:

                hamamBilet += 105;
                welcome();
                break;
            case 3:
                hamamBilet += 150;
                welcome();
                break;
            case 4:
                hamamBilet += 70;
                welcome();
                break;
            case 5:
                hesapla(hamamBilet);

                break;
        }
    }

    public static void hesapla(int hamamBilet) {
        System.out.println("toplam fatura : " + hamamBilet);


    }
}

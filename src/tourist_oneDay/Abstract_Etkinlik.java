package OneDayTrip;

import java.util.Scanner;

 public abstract class Abstract_Etkinlik {
    static Scanner scan = new Scanner(System.in);
    static int bilet =0;
    public static void welcome(String s, String section, int case1, int case2, int case3) {
        System.out.println("");
        System.out.println("\t\t\t\t"+section);
        System.out.println("=======================================================");
        System.out.println("****   Lütfen Yapmak Istediğiniz Işlemi Seçiniz   *****");
        System.out.println("=======================================================");
        System.out.println(s);
        switch (scan.nextInt()) {


            case 1:
                bilet += case1;
                hesapla(bilet);
                break;
            case 2:

                bilet += case2;
                hesapla(bilet);
                break;
            case 3:
                bilet += case3;
                hesapla(bilet);
                break;
            case 4:

                hesapla(bilet);

            default:
        }
    }
    public static void hesapla(int bilet) {
        System.out.println("toplam fatura : " + bilet);


    }
}

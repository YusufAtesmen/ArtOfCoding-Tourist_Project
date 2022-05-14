package hotel;


import java.util.Arrays;

import static hotel.HotelRunner.scan;

public class HotelRooms {
    static String capsuleTekOda[] = new String[15];
    static String capsuleCiftOda[] = new String[15];
    private int odaNo;
    private String odaTercih;
    private String internet;
    private String lcd;
    private String kuvetBanyoJakuzi;
    private String manzara;
    private String yatakOlcut;
    private String $;

    private double gunlukUcret;


    public HotelRooms() {

    }

    public HotelRooms(int odaNo, String odaTercih, double gunlukUcret) {
        this.odaNo = odaNo;
        this.odaTercih = odaTercih;
        this.gunlukUcret = gunlukUcret;
    }

    public static void chooseRoom(int i) {
        int j, rn;
        System.out.println(Arrays.toString(capsuleTekOda));
        switch (i) {
            case 1:
                for (int k = 0; k < 15; k++) {
                    if (capsuleTekOda[k] == null) {
                        System.out.print(k + 1 + " * ");// uygun degil try kont et
                    }
                }
                System.out.println();
                for (int k = 0; k < 15; k++) {
                    if (capsuleTekOda[k] != null) {
                        System.out.print(k + 1 + " dolu");// uygun degil try kont et
                    }
                }

                System.out.print("\nOda Numaranızı Giriniz: ");
                try {
                    rn = scan.nextInt();
                    rn--;
                    if (capsuleTekOda[rn] != null) {
                        throw new UygunDegil();
                        // MusteriTercihi(i, rn);
                    } else {
                        capsuleTekOda[rn] = "dolu";
                    }
                } catch (UygunDegil e) {
                    e.printStackTrace();
                    return;
                }
                break;
            case 2 : for (int k = 0; k < capsuleCiftOda.length; k++) {
                if (capsuleCiftOda[k] == null) {
                    System.out.print(k + 1 + " * ");// uygun degil try kont et
                }
            }
                System.out.println();
                for (int k = 0; k < capsuleCiftOda.length; k++) {
                    if (capsuleCiftOda[k] != null) {
                        System.out.print(k + 1 + " dolu");// uygun degil try kont et
                    }
                }
                System.out.print("\nOda Numaranızı Giriniz: ");
                try {
                    rn = scan.nextInt();
                    rn--;
                    if (capsuleCiftOda[rn] != null) {
                        throw new UygunDegil();
                        // MusteriTercihi(i, rn);
                    } else {
                        capsuleCiftOda[rn] = "dolu";
                    }
                } catch (UygunDegil e) {
                    e.printStackTrace();
                    return;
                }
                break;

        }
    }

    private static void MusteriTercihi(int i, int rn) {
    }

    // static HotelFeatures tekKişilikOda = new HotelFeatures("tekKişilikOda", "internet", "lcd", "kuvetBanyoJakuzi", "gol", "tekYatak", 250);
    // static HotelRooms ciftKişilikOda = new HotelRooms("ciftKişilikOda", "fibernet", "plazma", "kuvetBanyoJakuzi", "dag", "ciftYatak", 400);
    // static HotelRooms dörtKişilikOda = new HotelRooms("dörtKişilikOda", "internet", "lcd", "kuvetBanyoJakuzi", "manzara", "yatakOlcut", 850);
    // static HotelRooms suitOda = new HotelRooms("suitOda", "internet", "lcd", "kuvetBanyoJakuzi", "manzara", "yatakOlcut", 1000);
    // static HotelRooms aileOdası = new HotelRooms("aileOdası", "internet", "lcd", "kuvetBanyoJakuzi", "manzara", "yatakOlcut", 1500);
    // static HotelRooms kralDairesi = new HotelRooms("kralDairesi", "internet", "lcd", "kuvetBanyoJakuzi", "manzara", "yatakOlcut", 2500);

    // static List<HotelRooms> odaTalepListesi = new ArrayList<>(Arrays.asList(tekKişilikOda,ciftKişilikOda,dörtKişilikOda,suitOda,aileOdası,kralDairesi));

    // static Map<Integer, String > musteriOdaBilgisi = new TreeMap<>();
}

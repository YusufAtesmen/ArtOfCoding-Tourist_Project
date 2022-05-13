package hotel;

import java.util.*;

public class HotelRooms {

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
        int j, sayac = 0;
        HotelRooms capsuleTekOda[] = new HotelRooms[15];
        HotelRooms capsuleCiftOda[] = new HotelRooms[15];
        switch (i) {
            case 1:
                for (int k = 1; k < 16; k++) {
                    if (capsuleTekOda[k] == null) {
                        System.out.println(k + " *");// uygun degil try kont et
                    }
                }
        }
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

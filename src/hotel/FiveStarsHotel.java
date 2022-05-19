package hotel;

import welcome.TryCatch;

import java.text.SimpleDateFormat;
import java.util.*;

import static hotel.CreateRoom.otel;
import static hotel.HotelRunner.scan;

public class FiveStarsHotel {

    static long toplamGun;
    static List<Integer> sifreler = new ArrayList<>(Arrays.asList(0000, 1234, 9876, 6789, 5555));

    public static void odasecimi() {


        System.out.println(" odano  odadurum odaturu  internet   tv   banyo  odakonum   yatak    minibar    ucret");
        for (Integer w : otel.keySet()) {
            System.out.println("------------------------------------------------------------------------------");
            System.out.printf("%-5d %-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s %-1d\n", w, otel.get(w).getOdaDurum(),otel.get(w).getOdaTuru(), otel.get(w).getInternet(),
                    otel.get(w).getTv(), otel.get(w).getKuvetBanyoJakuzi(), otel.get(w).getManzara(),otel.get(w).getYatakOlcut(),
                    otel.get(w).getMinibar(),otel.get(w).getGunlukUcret());
        }
        System.out.println("oda numarasi seciniz");
        int choose = TryCatch.intGirisi();

        if (otel.containsKey(choose)) {
            otel.get(choose).setOdaDurum("dolu");

        }
        for (Integer w : otel.keySet()) {

            System.out.printf("%-5d %-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s %-1d\n", w, otel.get(w).getOdaDurum(),otel.get(w).getOdaTuru(), otel.get(w).getInternet(),
                    otel.get(w).getTv(), otel.get(w).getKuvetBanyoJakuzi(), otel.get(w).getManzara(),otel.get(w).getYatakOlcut(),
                    otel.get(w).getMinibar(),otel.get(w).getGunlukUcret());
        }

        System.out.println("hangi tarihler arasinda kalacaksiniz");
        System.out.println("Lutfen giris yaptiginiz tarihi giriniz: (Ornek: 12-01-2022 12:00:00)");// ay ve gunu ayirmak mi yoksa string almak mi?
        scan.nextLine();
        String girisGunu = scan.nextLine();
        System.out.println("Lutfen cikis yapcaaan tarihi giriniz: (Ornek: 12-04-2022 12:00:00)");
        String cikisGunu = scan.nextLine();
        System.out.println("************************************");

        try {
            SimpleDateFormat simpleDateFormat
                    = new SimpleDateFormat(
                    "dd-MM-yyyy HH:mm:ss");

            Date d1 = simpleDateFormat.parse(girisGunu);
            Date d2 = simpleDateFormat.parse(cikisGunu);

            long zaman_farki = d2.getTime() - d1.getTime();
            long gun_farki = (zaman_farki / (1000 * 60 * 60 * 24)) % 365;//gune cevirdi
            long saat_farki = (zaman_farki / (1000 * 60 * 60)) % 24;//saate cevirdi

            toplamGun = gun_farki;//+saat_farki;

            if (toplamGun > 0) {
                System.out.println(" toplam gun ve saat: " + gun_farki + " gun " + saat_farki + " saat");
                System.out.println("************************************");
            } else {
                throw new Exception();
            }
        } catch (Exception e) {
            System.out.println("tarihi yanlis girdiniz yeniden girin");

        }
        System.out.println();
        System.out.println("sectiginiz "  +otel.get(choose).getOdaTuru()+ "  odasi \n" + girisGunu + "\n" + cikisGunu + "\ntarihleri arasi rezerve edildi");



    }
    static void otelFaturaIslemleri() {
        System.out.println("fatura islemleriniz icin oda no giriniz");
        int odaNo=scan.nextInt();

        System.out.println("otel ucreti");
        System.out.println("kalinan toplam gun  "+toplamGun);
        System.out.println("internet=500 x " +toplamGun+"\n" +
                "otelTv=  500 x "+ toplamGun+"\n" +
                "jakuzi=  500 x "+ toplamGun+"\n" +
                "konum=   500 x "+ toplamGun+"\n" +
                "yatak=   1000 x " +toplamGun+"\n"+
                "minibar= 2000 x " +toplamGun);
        System.out.println("toplam ucret "+toplamGun*otel.get(odaNo).getGunlukUcret());



    }
    public static void odemeIslemleri() {
        System.out.println("kart ile odeme 1 nakit odeme 2");
        // int secim = JOptionPane.showOptionDialog(null, "devam etmek istiymisen", "Siparis", JOptionPane.YES_NO_CANCEL_OPTION, 3, null, null, "secenekler");
        int odemeTuru = scan.nextInt();
        if (odemeTuru == 1) {
            boolean flag = true;
            do {
                System.out.println("kart no son dort hane  giriniz ");
                try {
                    String kartNo = scan.next().replaceAll("\\D","");
                    if (kartNo.length() == 4) {
                        System.out.println("sifre gir");
                        flag=false;
                        try {
                            int sifre = scan.nextInt();
                            if ((sifreler.stream().anyMatch(t -> t.equals(sifre)))) {//sifreyi bankadan cek static sifreler tanimla list te ordan cek lambda match ile
                                System.out.println("sifre kabul edildi odeme tamam yine bekleriz");
                                flag=false;
                            } else throw new InputMismatchException("yanlis sifre");
                        } catch (InputMismatchException e) {
                            System.out.println(e.getMessage());
                        }
                    } else throw new InputMismatchException("son dort hane gircen");
                    flag = true;
                } catch (InputMismatchException e) {
                    System.out.println(e.getMessage());

                }

            }  while (flag);

        }else if(odemeTuru==2){
            System.out.println("nakit odeme icin tesekkurler odaniza cikabilirisni");
        }else odemeIslemleri();
    }

}

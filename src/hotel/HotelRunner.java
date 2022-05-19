package hotel;
import Car.RentalCarRunner;
import tourist_oneDay.TouristRunner;
import welcome.LeptinRunner;
import java.util.Scanner;
import static hotel.CreateRoom.rooms;
import static hotel.FiveStarsHotel.*;

public class HotelRunner extends HotelRooms{
    static long toplamGun;
    static Scanner scan = new Scanner(System.in);
    // static HotelRooms obj = new HotelRooms("kral daiesi");

    public static void hotel() throws InterruptedException {
        rooms();
        switch (LeptinRunner.choose) {

            case 1:
                birYildizliOtel();
                break;
            case 2:
                ikiYildizliOtel();
                break;
            case 3:
                ucYildizliOtel();
                break;
            case 4:
                dortYildizliOtel();
                break;
            case 5:
                besYildizliOtel();
                break;

        }

    }

    private static void besYildizliOtel() throws InterruptedException {
        System.out.println(" PELVINAS HOTELE HOSGELDINIZ \n odalarimiz asagidaki listeden secebilirsiniz");
        System.out.println("1- odasecimi\n" +
                "2- otelFaturaIslemleri\n" +
                "3- odemeIslemleri\n" +
                "4- otelDisHizmetler\n" +
                "5- cikis");
        int islem=scan.nextInt();
        switch(islem){
            case 1:
                odasecimi();
                besYildizliOtel();
                break;
            case 2:
                otelFaturaIslemleri();
                besYildizliOtel();
                break;
            case 3:
                odemeIslemleri();
                besYildizliOtel();
                break;
            case 4:
                otelDisHizmetler();
                besYildizliOtel();
                break;
            case 5:
                cikis();
            default:
                odasecimi();

        }
    }

    private static void cikis() throws InterruptedException {
        Thread.sleep(3000);
        System.out.print("*");
        Thread.sleep(3000);
        System.out.print("**");
        Thread.sleep(3000);
        System.out.print("***\n gule gule ");

    }

    private static void otelDisHizmetler() {
        System.out.println("otel hizmetlerimiz ");
        System.out.println("1- arac kiralama\n" +
                "2- gezi tur vs" );
        int secim=scan.nextInt();
        switch(secim){
            case 1:
                RentalCarRunner.rental();//yusuf beyin mekana ina gidiyor
                break;
            case 2:
                TouristRunner.tourist();//yahya beyin mekana gidiyor
                break;
            default:
                System.out.println("secimi duzgun at");
        }

    }


    private static void dortYildizliOtel() {
    }

    private static void ucYildizliOtel() {
    }

    private static void ikiYildizliOtel() {
    }

    private static void birYildizliOtel() {
        System.out.println("WELLCOME TO CAPSULE HOTEL");
        System.out.println("hosgeldiniz yapmak istediginiz islem nedir\n" +
                //ilk classdan alinan ismi buraya getir ismiyle karsilariz musteriyi
                // "1- rezervasyon tarihleri ilk class dan geitr
                "1- oda gosterimi\n" +
                "2- oda rezervasyon\n" +
                "3- fatura islem \n" +
                "4- odeme islemleri\n" +
                "0- cikis");
        int sec = scan.nextInt();
        switch (sec) {
            case 1:

                break;
            case 2:

                break;
            case 3:
                break;
            case 4:
                break;

            case 0:
                break;
            default:
        }
    }





}

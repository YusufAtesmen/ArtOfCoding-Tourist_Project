package hotel;

import welcome.LeptinRunner;

import java.util.Scanner;

public class HotelRunner {
    static Scanner scan = new Scanner(System.in);

    public static void hotel() {
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

    private static void besYildizliOtel() {
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
        int sec =scan.nextInt();
        switch(sec){
            case 1:
                showRoom();
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

    private static void showRoom() {
        System.out.println("otelimiz sadece oda hizmeti vermektedir musait odalar ve fiyatlari listededir");

        HotelRooms tekKişilikOda = new HotelRooms(1,"tekKişilikOda" ,5);//kac oda var 15
        HotelRooms ciftKişilikOda = new HotelRooms(1,"ciftKişilikOda" ,10);// 15 oda var secilen bir daha secilmesin calis



    }


}

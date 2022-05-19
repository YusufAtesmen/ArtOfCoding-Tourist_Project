package welcome;

import hotel.HotelRunner;

import java.time.LocalTime;


public class LeptinRunner {
    public static int choose;
    public static int bakiye = 100000;
    public static String nameSurName;
    public static String pasportNo;
    public static String girisGunu;
    public static String cikisGunu;
    public static LocalTime tarihSaat = LocalTime.of(10, 0);
    public static void main(String[] args) throws InterruptedException {


        System.out.println("WELCOME TO LEPTIN AGENCY");

        System.out.println("PLEASE ENTER NAME AND SURNAME");

        nameSurName = TryCatch.stringGirisi();

        System.out.println("PLEASE ENTER PASPORT NO");
        pasportNo = TryCatch.rakamlistringGirisi();

        System.out.println("hangi tarihler arasinda kalacaksiniz");
        System.out.print("Lutfen giris yaptiginiz ayi: ");// ay ve gunu ayirmak mi yoksa string almak mi?
        String girisAy = TryCatch.tarih();
        System.out.print("Lutfen giris yaptiginiz gun: ");// ay ve gunu ayirmak mi yoksa string almak mi?
        String girisGun = TryCatch.tarih();
        System.out.print("Lutfen giris yaptiginiz yıl: ");// ay ve gunu ayirmak mi yoksa string almak mi?
        String girisYil = TryCatch.tarih();
        System.out.println("Lutfen giris yaptiginiz saat (12:00:00) ");// ay ve gunu ayirmak mi yoksa string almak mi?
        String girisSaat = TryCatch.rakamlistringGirisi2();
        girisGunu=girisAy+"-"+girisGun+"-"+girisYil+" "+girisSaat;
        System.out.print("Lutfen cikis yaptiginiz ayi: ");// ay ve gunu ayirmak mi yoksa string almak mi?

        String cikisAy = TryCatch.tarih();
        System.out.print("Lutfen cikis yaptiginiz gun: ");// ay ve gunu ayirmak mi yoksa string almak mi?
        String cikisGun = TryCatch.tarih();
        System.out.print("Lutfen cikis yaptiginiz yıl: ");// ay ve gunu ayirmak mi yoksa string almak mi?
        String cikisYil = TryCatch.tarih();
        System.out.println("Lutfen cikis yaptiginiz saat (12:00:00) ");// ay ve gunu ayirmak mi yoksa string almak mi?
        String cikisSaat = TryCatch.rakamlistringGirisi2();
        cikisGunu=cikisAy+"-"+cikisGun+"-"+cikisYil+" "+cikisSaat;

        System.out.println("************************************");

        System.out.println("PLEASE CHOOSE HOTEL FROM\n" +
                "1- HOSTEL      *\n" +
                "2- HOTEL      **\n" +
                "3- HOTEL     ***\n" +
                "4- HOTEL    ****\n" +
                "5- HOTEL   *****");
        choose = TryCatch.intGirisi();
        switch (choose) {
            case 1:
                HotelRunner.hotel();
                break;
            case 2:
                HotelRunner.hotel();
                break;
            case 3:
                HotelRunner.hotel();
                break;
            case 4:
                HotelRunner.hotel();
                break;
            case 5:
                HotelRunner.hotel();
                break;
            default:


        }


    }
}

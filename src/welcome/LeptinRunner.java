package welcome;

import hotel.HotelRooms;
import hotel.HotelRunner;
import Car.RentalCarRunner;

public class LeptinRunner {
    public static int choose;

    public static void main(String[] args) {



        //System.out.println("WELCOME TO LEPTIN AGENCY");

        //System.out.println("PLEASE ENTER NAME AND SURNAME");

        //String nameSurName=TryCatch.stringGirisi();

        //System.out.println("PLEASE ENTER PASPORT NO");
        //String pasportNo=TryCatch.rakamlistringGirisi();

        System.out.println("PLEASE CHOOSE HOTEL FROM LIST\n" +
                "1- HOSTEL      *\n" +
                "2- HOTEL      **\n" +
                "3- HOTEL     ***\n" +
                "4- HOTEL    ****\n" +
                "5- HOTEL   *****");
        choose = TryCatch.intGirisi();
        switch (choose) {
            case 1:
                System.out.println("WELLCOME TO ONESTAR HOSTEL");
                HotelRunner.hotel();
                break;
            case 2:
                System.out.println("WELLCOME TO TWOSTARS HOTEL");
                HotelRunner.hotel();
                break;
            case 3:
                System.out.println("WELLCOME TO THREESTARS HOTEL");
                HotelRunner.hotel();
                break;
            case 4:
                System.out.println("WELLCOME TO FOURSTARS HOTEL");
                HotelRunner.hotel();
                break;
            case 5:
                System.out.println("WELLCOME TO FIVESTARS HOTEL");
                HotelRunner.hotel();
                break;
                default:


        }


    }
}

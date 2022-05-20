package welcome;

import hotel.HotelRunner;
import Car.RentalCarRunner;
import tourist_oneDay.TouristRunner;

public class LeptinRunner {
    public static int choose;
    public static int bakiye=100000;

    public static void main(String[] args) throws InterruptedException {


        //System.out.println("WELCOME TO LEPTIN AGENCY");

        //System.out.println("PLEASE ENTER NAME AND SURNAME");

        //String nameSurName=TryCatch.stringGirisi();

        //System.out.println("PLEASE ENTER PASPORT NO");
        //String pasportNo=TryCatch.rakamlistringGirisi();
        System.out.println("PLEASE ENTER ");

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
               RentalCarRunner.rental();
                break;
            case 3:
                TouristRunner.tourist();
                break;
            case 4:
                TouristRunner.tourist();
                break;
            case 5:
                TouristRunner.tourist();
                break;
                default:


        }


    }
}

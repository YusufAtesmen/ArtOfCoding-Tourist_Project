package OneDayTrip.Restaurant;



public class RestaurantRunner {


    public static void main(String[] args) {

        Yemek ymk = new Yemek();
        Icecek ick = new Icecek();
        lMenu(ymk);
        lMenu(ick);

    }

    public static void lMenu(IMenu menu) {
        menu.listMenu();
    }


}

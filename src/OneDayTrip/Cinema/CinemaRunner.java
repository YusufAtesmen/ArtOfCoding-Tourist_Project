package OneDayTrip.Cinema;

import OneDayTrip.Restaurant.IMenu;

import static OneDayTrip.Restaurant.RestaurantRunner.lMenu;

public class CinemaRunner implements IMenu {
    public static void main(String[] args) {
        CinemaRunner cine = new CinemaRunner();
        lMenu(cine);
    }

    @Override
    public  void listMenu() {
        Room.initializeRooms();
        Movie mv = new Movie();

        TicketReservation.banner();
        TicketReservation.ticket();

    }


}

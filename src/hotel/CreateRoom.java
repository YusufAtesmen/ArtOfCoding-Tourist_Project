package hotel;

import java.util.HashMap;
import java.util.Map;

public class CreateRoom {

    static Map<Integer, HotelRooms> otel1 = new HashMap<>();
    static Map<Integer, HotelRooms> otel2 = new HashMap<>();
    static Map<Integer, HotelRooms> otel3 = new HashMap<>();
    static Map<Integer, HotelRooms> otel4 = new HashMap<>();
    static Map<Integer, HotelRooms> otel = new HashMap<>();
    public static void rooms() {
        //1 yildizli otel
        HotelRooms oda1 = new HotelRooms("bos", "tekkisi", 50);
        HotelRooms oda2 = new HotelRooms("bos", "ciftkisi", 100);
        HotelRooms oda3 = new HotelRooms("bos", "aile", 250);
        otel1.put(1, oda1);
        otel1.put(2, oda2);
        otel1.put(3, oda3);

        // 2 yildizli otel
        HotelRooms oda11 = new HotelRooms("bos", "tekkisi", "lcd",  125);
        HotelRooms oda22 = new HotelRooms("bos", "ciftkisi", "lcd", 250);
        HotelRooms oda33 = new HotelRooms("bos", "aile", "lcd",  500);
        otel2.put(1, oda11);
        otel2.put(2, oda22);
        otel2.put(3, oda33);


        // 3 yildizli otel
        HotelRooms oda111 = new HotelRooms("bos", "tekkisi", "vdsl", "lcd", "tekkisilik", 200);
        HotelRooms oda222 = new HotelRooms("bos", "ciftkisi", "vdsl", "lcd", "ciftkisilik", 400);
        HotelRooms oda333 = new HotelRooms("bos", "aile", "vdsl", "lcd",  "buyukyatak",  800);
        HotelRooms oda444 = new HotelRooms("bos", "suit", "vdsl", "lcd",  "luxyatak", 1200);
        otel3.put(1, oda111);
        otel3.put(2, oda222);
        otel3.put(3, oda333);
        otel3.put(4, oda444);

        // 4 yildizli otel
        HotelRooms oda1111 = new HotelRooms("bos", "tekkisi", "vdsl", "lcd", "jakuzi", "tekkisilik", 350);
        HotelRooms oda2222 = new HotelRooms("bos", "ciftkisi", "vdsl", "lcd", "jakuzi",  "ciftkisilik", 700);
        HotelRooms oda3333 = new HotelRooms("bos", "aile", "vdsl", "lcd", "jakuzi",  "buyukyatak", 1500);
        HotelRooms oda4444 = new HotelRooms("bos", "suit", "superinternet", "devekran", "jakuzi",  "luxyatak", 2000);
        HotelRooms oda5555 = new HotelRooms("bos", "krldairesi", "fiber", "plazma", "jakuzi&spa",  "king yatak", 3500);
        otel4.put(1, oda1111);
        otel4.put(2, oda2222);
        otel4.put(3, oda3333);
        otel4.put(4, oda4444);
        otel4.put(5, oda5555);

        // 5 yildizli otel
        HotelRooms oda11111 = new HotelRooms("bos","tekkisi", "vdsl", "lcd", "jakuzi", "gol manzara", "tekkisilik", "minibar", 750);
        HotelRooms oda22222 = new HotelRooms("bos","ciftkisi", "vdsl", "lcd", "jakuzi", "gol manzara", "tekkisilik", "minibar", 1500);
        HotelRooms oda33333 = new HotelRooms("bos","aile", "vdsl", "lcd", "jakuzi", "gol manzara", "tekkisilik", "minibar", 2500);
        HotelRooms oda44444 = new HotelRooms("bos","suit", "vdsl", "lcd", "jakuzi", "gol manzara", "tekkisilik", "minibar", 3000);
        HotelRooms oda55555 = new HotelRooms("bos","krldairesi", "fiber", "plazma", "jakuzi", "full manzara", "king yatak", "minibar", 5000);
        otel.put(1, oda11111);
        otel.put(2, oda22222);
        otel.put(3, oda33333);
        otel.put(4, oda44444);
        otel.put(5, oda55555);
    }
}

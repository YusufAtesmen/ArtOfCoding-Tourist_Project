package tourist_oneDay;

import Car.TryCatch;
import welcome.LeptinRunner;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;

public class TouristRunner {
    static Map<Integer, TouristPojo> gez = new HashMap<>();

    public static void tourist() {
        switch (LeptinRunner.choose) {
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

    private static void ucYildizliOtel() {

        boolean flag = true;
        LocalTime tarihSaat = LocalTime.of(10, 0);
        System.out.println("Hour : "+tarihSaat);
        while (flag) {


            TouristPojo obj1 = new TouristPojo("Müze", 300, 1);
            TouristPojo obj2 = new TouristPojo("Restaurant", 500, 2);
            TouristPojo obj3 = new TouristPojo("Bogaz Turu", 1000, 4);
            TouristPojo obj4 = new TouristPojo("Hamam", 250, 2);
            TouristPojo obj5 = new TouristPojo("Kültür Etkinliği", 250, 3);
            gez.put(1, obj1);
            gez.put(2, obj2);
            gez.put(3, obj3);
            gez.put(4, obj4);
            gez.put(5, obj5);
            System.out.println("   Activity            Price");
            System.out.println("-----------------------------");
            for (Integer w : gez.keySet()) {
                System.out.printf("%-3d %-20s %-1d \n", w, gez.get(w).getEtkinlik(),gez.get(w).getFiyat());
            }
            System.out.println("\nPlease select a activity from the list ");
            int choose = TryCatch.intGirisi(gez.size());

            if (gez.containsKey(choose)) {
                System.out.println("You chose ");
                System.out.println(gez.get(choose).getEtkinlik());

                if (gez.get(choose).getFiyat() <= LeptinRunner.bakiye) {
                    tarihSaat=  tarihSaat.plusHours(gez.get(choose).getTime()).plusMinutes(0);
                    System.out.println(tarihSaat);
                    LeptinRunner.bakiye = LeptinRunner.bakiye - gez.get(choose).getFiyat();
                    System.out.println(LeptinRunner.bakiye);
                } else {
                    System.out.println("YOU DON'T HAVE ENOUGH MONEY");
                }

            }
            if (tarihSaat.getHour() >= 22) {
                flag = false;
            }
        }
    }

    private static void dortYildizliOtel() {

    }

    private static void besYildizliOtel() {

    }

}


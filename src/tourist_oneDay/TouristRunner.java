package tourist_oneDay;

import Car.TryCatch;
import welcome.LeptinRunner;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;

public class TouristRunner {

    static Map<Integer, TouristPojo> gez3 = new HashMap<>();
    static Map<Integer, TouristPojo> gez4 = new HashMap<>();
    static Map<Integer, TouristPojo> gez5 = new HashMap<>();

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

        System.out.println("Hour : "+LeptinRunner.tarihSaat);
        while (flag) {


            TouristPojo obj1 = new TouristPojo("Müze", 300, 1);
            TouristPojo obj2 = new TouristPojo("Restaurant", 500, 2);
            TouristPojo obj3 = new TouristPojo("Bogaz Turu", 1000, 4);
            TouristPojo obj4 = new TouristPojo("Hamam", 250, 2);
            TouristPojo obj5 = new TouristPojo("Kültür Etkinliği", 250, 3);
            gez3.put(1, obj1);
            gez3.put(2, obj2);
            gez3.put(3, obj3);
            gez3.put(4, obj4);
            gez3.put(5, obj5);
            System.out.println("   Activity            Price");
            System.out.println("-----------------------------");
            if (LeptinRunner.tarihSaat.getHour()>16.59){
                obj1.setEtkinlik("Müze (Close)");
            }
            for (Integer w : gez3.keySet()) {
                System.out.printf("%-3d %-20s %-1d \n", w, gez3.get(w).getEtkinlik(),gez3.get(w).getFiyat());
            }
            System.out.println("\nPlease select a activity from the list ");
            int choose = TryCatch.intGirisi(gez3.size());

            if (gez3.get(choose).getEtkinlik().contains("(Close)")){
                System.out.println("Activity off\nPlease select a activity from the list  ");
                continue;
            }
            if (LeptinRunner.tarihSaat.plusHours(gez3.get(choose).getTime()).plusMinutes(0).getHour() >= 22 ||
                    LeptinRunner.tarihSaat.plusHours(gez3.get(choose).getTime()).plusMinutes(0).getHour()<=09.59) {
                System.out.println("You chose ");
                System.out.println(gez3.get(choose).getEtkinlik());
                LeptinRunner.tarihSaat=  LeptinRunner.tarihSaat.plusHours(gez3.get(choose).getTime()).plusMinutes(0);
                System.out.println(LeptinRunner.tarihSaat);
                LeptinRunner.bakiye = LeptinRunner.bakiye - gez3.get(choose).getFiyat();
                System.out.println(LeptinRunner.bakiye);
                flag = false;
            }

            else if (gez3.containsKey(choose)) {
                System.out.println("You chose ");
                System.out.println(gez3.get(choose).getEtkinlik());

                if (gez3.get(choose).getFiyat() <= LeptinRunner.bakiye) {
                    LeptinRunner.tarihSaat=  LeptinRunner.tarihSaat.plusHours(gez3.get(choose).getTime()).plusMinutes(0);
                    System.out.println(LeptinRunner.tarihSaat);
                    LeptinRunner.bakiye = LeptinRunner.bakiye - gez3.get(choose).getFiyat();
                    System.out.println(LeptinRunner.bakiye);
                } else {
                    System.out.println("YOU DON'T HAVE ENOUGH MONEY");
                }

            }

        }
    }

    private static void dortYildizliOtel() {

        boolean flag = true;

        System.out.println("Hour : "+LeptinRunner.tarihSaat);
        while (flag) {


            TouristPojo obj1 = new TouristPojo("Müze", 450, 1);
            TouristPojo obj2 = new TouristPojo("Restaurant", 750, 2);
            TouristPojo obj3 = new TouristPojo("Bogaz Turu", 1500, 4);
            TouristPojo obj4 = new TouristPojo("Hamam", 400, 2);
            TouristPojo obj5 = new TouristPojo("Kültür Etkinliği", 400, 3);
            TouristPojo obj6 = new TouristPojo("Şehir Turu", 4000, 8);
            gez4.put(1, obj1);
            gez4.put(2, obj2);
            gez4.put(3, obj3);
            gez4.put(4, obj4);
            gez4.put(5, obj5);
            gez4.put(6, obj6);
            System.out.println("   Activity            Price");
            System.out.println("-----------------------------");
            if (LeptinRunner.tarihSaat.getHour()>16.59){
                obj1.setEtkinlik("Müze (Close)");
            }
            if (LeptinRunner.tarihSaat.getHour()>11.59){
                obj6.setEtkinlik("Şehir Turu (Close)");
            }
            for (Integer w : gez4.keySet()) {
                System.out.printf("%-3d %-20s %-1d \n", w, gez4.get(w).getEtkinlik(),gez4.get(w).getFiyat());
            }
            System.out.println("\nPlease select a activity from the list ");
            int choose = TryCatch.intGirisi(gez4.size());

            if (gez4.get(choose).getEtkinlik().contains("(Close)")){
                System.out.println("Activity off\nPlease select a activity from the list  ");
                continue;
            }
            if (LeptinRunner.tarihSaat.plusHours(gez4.get(choose).getTime()).plusMinutes(0).getHour() >= 22 ||
                    LeptinRunner.tarihSaat.plusHours(gez4.get(choose).getTime()).plusMinutes(0).getHour()<=09.59) {
                System.out.println("You chose ");
                System.out.println(gez4.get(choose).getEtkinlik());
                LeptinRunner.tarihSaat=  LeptinRunner.tarihSaat.plusHours(gez4.get(choose).getTime()).plusMinutes(0);
                System.out.println(LeptinRunner.tarihSaat);
                LeptinRunner.bakiye = LeptinRunner.bakiye - gez4.get(choose).getFiyat();
                System.out.println(LeptinRunner.bakiye);
                flag = false;
            }

            else if (gez4.containsKey(choose)) {
                System.out.println("You chose ");
                System.out.println(gez4.get(choose).getEtkinlik());



                if (gez4.get(choose).getFiyat() <= LeptinRunner.bakiye) {
                    LeptinRunner.tarihSaat=  LeptinRunner.tarihSaat.plusHours(gez4.get(choose).getTime()).plusMinutes(0);
                    System.out.println(LeptinRunner.tarihSaat);
                    LeptinRunner.bakiye = LeptinRunner.bakiye - gez4.get(choose).getFiyat();
                    System.out.println(LeptinRunner.bakiye);
                } else {
                    System.out.println("YOU DON'T HAVE ENOUGH MONEY");
                }

            }

        }

    }

    private static void besYildizliOtel() {

        boolean flag = true;

        System.out.println("Hour : "+LeptinRunner.tarihSaat);
        while (flag) {


            TouristPojo obj1 = new TouristPojo("Müze", 600, 1);
            TouristPojo obj2 = new TouristPojo("Restaurant", 1000, 2);
            TouristPojo obj3 = new TouristPojo("Bogaz Turu", 2000, 4);
            TouristPojo obj4 = new TouristPojo("Hamam", 500, 2);
            TouristPojo obj5 = new TouristPojo("Kültür Etkinliği", 500, 3);
            TouristPojo obj6 = new TouristPojo("Şehir Turu", 6000, 8);
            TouristPojo obj7 = new TouristPojo("Sıra Gecesi (Close)", 3000, 3);
            gez5.put(1, obj1);
            gez5.put(2, obj2);
            gez5.put(3, obj3);
            gez5.put(4, obj4);
            gez5.put(5, obj5);
            gez5.put(6, obj6);
            gez5.put(7, obj7);
            System.out.println("   Activity            Price");
            System.out.println("-----------------------------");
            if (LeptinRunner.tarihSaat.getHour()>16.59){
                obj1.setEtkinlik("Müze (Close)");
                obj7.setEtkinlik("Sıra Gecesi");
            }
            if (LeptinRunner.tarihSaat.getHour()>11.59){
                obj6.setEtkinlik("Şehir Turu (Close)");
            }
            for (Integer w : gez5.keySet()) {
                System.out.printf("%-3d %-20s %-1d \n", w, gez5.get(w).getEtkinlik(),gez5.get(w).getFiyat());
            }


            System.out.println("\nPlease select a activity from the list ");
            int choose = TryCatch.intGirisi(gez5.size());

            if (gez5.get(choose).getEtkinlik().contains("(Close)")){
                System.out.println("Activity off\nPlease select a activity from the list  ");
                continue;
            }
            if (LeptinRunner.tarihSaat.getHour() > 21.59 && choose == 7) {
                if (gez5.get(choose).getFiyat() <= LeptinRunner.bakiye) {
                    System.out.println("You chose ");
                    System.out.println(gez5.get(choose).getEtkinlik());
                    LeptinRunner.tarihSaat=  LeptinRunner.tarihSaat.plusHours(gez5.get(choose).getTime()).plusMinutes(0);
                System.out.println(LeptinRunner.tarihSaat);
                LeptinRunner.bakiye = LeptinRunner.bakiye - gez5.get(choose).getFiyat();
                System.out.println(LeptinRunner.bakiye);

                flag = false;

                }else System.out.println("YOU DON'T HAVE ENOUGH MONEY");
            }else if (LeptinRunner.tarihSaat.plusHours(gez5.get(choose).getTime()).plusMinutes(0).getHour() >= 22 ||
                    LeptinRunner.tarihSaat.plusHours(gez5.get(choose).getTime()).plusMinutes(0).getHour()<=09.59){
                System.out.println("You chose ");
                System.out.println(gez5.get(choose).getEtkinlik());
                LeptinRunner.tarihSaat=  LeptinRunner.tarihSaat.plusHours(gez5.get(choose).getTime()).plusMinutes(0);
                System.out.println(LeptinRunner.tarihSaat);
                LeptinRunner.bakiye = LeptinRunner.bakiye - gez5.get(choose).getFiyat();
                System.out.println(LeptinRunner.bakiye);
                flag = false;

            }


            else if (gez5.containsKey(choose)) {
                System.out.println("You chose ");
                System.out.println(gez5.get(choose).getEtkinlik());



                if (gez5.get(choose).getFiyat() <= LeptinRunner.bakiye) {
                    LeptinRunner.tarihSaat=  LeptinRunner.tarihSaat.plusHours(gez5.get(choose).getTime()).plusMinutes(0);
                    System.out.println(LeptinRunner.tarihSaat);
                    LeptinRunner.bakiye = LeptinRunner.bakiye - gez5.get(choose).getFiyat();
                    System.out.println(LeptinRunner.bakiye);

                } else {
                    System.out.println("YOU DON'T HAVE ENOUGH MONEY");
                }

            }

        }

    }

}

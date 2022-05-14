package hotel;

import welcome.LeptinRunner;
import welcome.TryCatch;

import java.util.HashMap;
import java.util.Map;

import static Car.Cars.*;

public class HotelRunner {
    static Map<Integer,HotelPojo> otel=new HashMap<>();

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
            default:
                System.out.println("bos");
        }

    }
    public static void birYildizliOtel(){

    } public static void ikiYildizliOtel(){

    } public static void ucYildizliOtel(){

    } public static void dortYildizliOtel(){

    } public static void besYildizliOtel(){

        HotelPojo obj1=new HotelPojo("Televizyon","İnternet","Jakuzi","Bos",100);
        HotelPojo obj2=new HotelPojo("Televizyon","İnternet","Jakuzi","Bos",150);
        HotelPojo obj3=new HotelPojo("Televizyon","İnternet","Jakuzi","Bos",400);
        HotelPojo obj4=new HotelPojo("Televizyon","İnternet","Jakuzi","Bos",300);
        HotelPojo obj5=new HotelPojo("Televizyon","İnternet","Jakuzi","Bos",200);
       otel.put(1,obj1);
       otel.put(2,obj2);
       otel.put(3,obj3);
       otel.put(4,obj4);
       otel.put(5,obj5);

        for (Integer w : otel.keySet()) {

            System.out.printf("%-8d %-15s %-15s %-15s %-15s %-1d\n",w,otel.get(w).getTv(),otel.get(w).getInternet(),
                    otel.get(w).getJakuzi(),otel.get(w).getOdaBilgi(),otel.get(w).getFiyat());
        }

        int choose= TryCatch.intGirisi();

        if(otel.containsKey(choose)){
            otel.get(choose).setOdaBilgi("dolu");
        }
        for (Integer w : otel.keySet()) {

            System.out.printf("%-8d %-15s %-15s %-15s %-15s %-1d\n",w,otel.get(w).getTv(),otel.get(w).getInternet(),
                    otel.get(w).getJakuzi(),otel.get(w).getOdaBilgi(),otel.get(w).getFiyat());
        }


    }
}

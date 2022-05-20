package hotel;

import java.util.*;



public class HotelOperations  {




    public static void yazdirStr(String a) {//yazdirma action  yapan seed(tohum) create edildi
        System.out.println("otel hzimetlerimiz asagidadir");
        System.out.println("******************************");
       // for (int i = 0; i < otelHizmetleri.size(); i++) {
      //      System.out.printf("%-40s %-5s\n", otelHizmetleri.get(i), ucretHizmet.get(i));
        //}
    }
    public static void otelHizmetleriLambda(List<String> service) {
        System.out.println("*****rezervasyon tamam PELVINAS otele hosgeldin*****");
        service.stream().
                map(t -> t.toUpperCase(Locale.CHINA)).
                forEach(HotelOperations::yazdirStr);//soutc yaz

    }


    public static void extraHotelHizmetTalep(List<String> service) throws InterruptedException {//lambda show
        System.out.println("***** Listeden diledigin hizmeti sec *****");
        service.stream().
                map(t -> t.toUpperCase(Locale.CHINA)).
                forEach(HotelOperations::yazdirStr);//soutc yaz

    }






}

package welcome;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {

    static Scanner scan = new Scanner(System.in);
    static int giris;
    static String kelime;
    static double kontrol;


    public static int intGirisi() {
        try {
            giris = scan.nextInt();
            if(giris>5||giris<=0){
                throw new IllegalArgumentException("PLEASE ENTER FORM LİST");
            }
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
            scan.nextLine();
            intGirisi();
        }
        return giris;
    }
    public static double doubleGirisi() {
        try {
            kontrol = scan.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("sayi gir");
            scan.nextLine();
            doubleGirisi();
        }
        return kontrol;
    }

    public static String stringGirisi() {
        try {
            kelime = scan.nextLine();
            String kontrol = kelime.replaceAll("\\D", "");
           // String kontrol2 = kelime.replaceAll("\\w", "");
            if (kontrol.length() != 0 ){//|| kontrol2.length() != 0) {
                throw new InputMismatchException("PLEASE ENTER LETTER");
            }
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
            stringGirisi();
        }

        return kelime;
    }
    public static String tarih() {
        try {
            kelime = scan.nextLine();
            String kontrol = kelime.replaceAll("\\d", "");
           // String kontrol2 = kelime.replaceAll("\\w", "");
            if (kontrol.length() != 0 ){//|| kontrol2.length() != 0) {
                throw new InputMismatchException("PLEASE ENTER NUMBER");
            }
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
            tarih();
        }

        return kelime;
    }
    public static String rakamlistringGirisi() {
        try {
            kelime = scan.nextLine();
            String kontrol = kelime.replaceAll("\\d", "");
            String kontrol2 = kelime.replaceAll("\\w", "");
            if (kontrol.length() != 1 || kontrol2.length() != 0) {
                throw new InputMismatchException("PLEASE TRY AGAİN");
            }
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
            rakamlistringGirisi();
        }

        return kelime;
    } public static String rakamlistringGirisi2() {
        try {
            kelime = scan.nextLine();
            String kontrol = kelime.replaceAll("\\d", "");

            if (kontrol.length() != 2 ) {
                throw new InputMismatchException("PLEASE TRY AGAİN");
            }
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
            rakamlistringGirisi();
        }

        return kelime;
    }
}
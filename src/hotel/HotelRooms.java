package hotel;


public class HotelRooms {

    private String odaDurum="bos";
    private String odaTuru;
    private String internet;
    private String tv;
    private String kuvetBanyoJakuzi;
    private String manzara;
    private String yatakOlcut;
    private String minibar;
    private int gunlukUcret;

    public HotelRooms() {
    }


    public HotelRooms(String odaDurum, String odaTuru, int gunlukUcret) {//1 yildiz otel
        this.odaDurum = odaDurum;
        this.odaTuru = odaTuru;
        this.gunlukUcret = gunlukUcret;
    }

    public HotelRooms(String odaDurum, String odaTuru, String tv, int gunlukUcret) {//2 yildiz otel
        this.odaDurum = odaDurum;
        this.odaTuru = odaTuru;
        this.tv = tv;
        this.gunlukUcret = gunlukUcret;
    }

    public HotelRooms(String odaDurum, String odaTuru, String internet, String tv, String yatakOlcut, int gunlukUcret) {//3 yildiz
        this.odaDurum = odaDurum;
        this.odaTuru = odaTuru;
        this.internet = internet;
        this.tv = tv;
        this.yatakOlcut = yatakOlcut;
        this.gunlukUcret = gunlukUcret;
    }

    public HotelRooms(String odaDurum, String odaTuru, String internet, String tv, String kuvetBanyoJakuzi, String yatakOlcut, int gunlukUcret) {//4 yildiz
        this.odaDurum = odaDurum;
        this.odaTuru = odaTuru;
        this.internet = internet;
        this.tv = tv;
        this.kuvetBanyoJakuzi = kuvetBanyoJakuzi;
        this.yatakOlcut = yatakOlcut;
        this.gunlukUcret = gunlukUcret;
    }

    public HotelRooms(String odaDurum, String odaTuru, String internet, String tv, String kuvetBanyoJakuzi, String manzara, String yatakOlcut, String minibar, int gunlukUcret) {
        this.odaDurum = odaDurum;
        this.odaTuru = odaTuru;
        this.internet = internet;
        this.tv = tv;
        this.kuvetBanyoJakuzi = kuvetBanyoJakuzi;
        this.manzara = manzara;
        this.yatakOlcut = yatakOlcut;
        this.minibar = minibar;
        this.gunlukUcret = gunlukUcret;
    }

    public String getOdaDurum() {
        return odaDurum;
    }

    public void setOdaDurum(String odaDurum) {
        this.odaDurum = odaDurum;
    }

    public String getOdaTuru() {
        return odaTuru;
    }

    public void setOdaTuru(String odaTuru) {
        this.odaTuru = odaTuru;
    }

    public String getInternet() {
        return internet;
    }

    public void setInternet(String internet) {
        this.internet = internet;
    }

    public String getTv() {
        return tv;
    }

    public void setTv(String tv) {
        this.tv = tv;
    }

    public String getKuvetBanyoJakuzi() {
        return kuvetBanyoJakuzi;
    }

    public void setKuvetBanyoJakuzi(String kuvetBanyoJakuzi) {
        this.kuvetBanyoJakuzi = kuvetBanyoJakuzi;
    }

    public String getManzara() {
        return manzara;
    }

    public void setManzara(String manzara) {
        this.manzara = manzara;
    }

    public String getYatakOlcut() {
        return yatakOlcut;
    }

    public void setYatakOlcut(String yatakOlcut) {
        this.yatakOlcut = yatakOlcut;
    }

    public String getMinibar() {
        return minibar;
    }

    public void setMinibar(String minibar) {
        this.minibar = minibar;
    }

    public int getGunlukUcret() {
        return gunlukUcret;
    }

    public void setGunlukUcret(int gunlukUcret) {
        this.gunlukUcret = gunlukUcret;
    }

    @Override
    public String toString() {
        return "HotelRooms{" +
                "odaTuru='" + odaTuru + '\'' +
                ", internet='" + internet + '\'' +
                ", tv='" + tv + '\'' +
                ", banyo='" + kuvetBanyoJakuzi + '\'' +
                ", manzara='" + manzara + '\'' +
                ", yatakOlcut='" + yatakOlcut + '\'' +
                ", minibar='" + minibar + '\'' +
                ", gunlukUcret=" + gunlukUcret +
                '}';
    }
}














// static HotelFeatures tekKişilikOda = new HotelFeatures("tekKişilikOda", "internet", "lcd", "kuvetBanyoJakuzi", "gol", "tekYatak", 250);
// static HotelRooms ciftKişilikOda = new HotelRooms("ciftKişilikOda", "fibernet", "plazma", "kuvetBanyoJakuzi", "dag", "ciftYatak", 400);
// static HotelRooms dörtKişilikOda = new HotelRooms("dörtKişilikOda", "internet", "lcd", "kuvetBanyoJakuzi", "manzara", "yatakOlcut", 850);
// static HotelRooms suitOda = new HotelRooms("suitOda", "internet", "lcd", "kuvetBanyoJakuzi", "manzara", "yatakOlcut", 1000);
// static HotelRooms aileOdası = new HotelRooms("aileOdası", "internet", "lcd", "kuvetBanyoJakuzi", "manzara", "yatakOlcut", 1500);
// static HotelRooms kralDairesi = new HotelRooms("kralDairesi", "internet", "lcd", "kuvetBanyoJakuzi", "manzara", "yatakOlcut", 2500);

// static List<HotelRooms> odaTalepListesi = new ArrayList<>(Arrays.asList(tekKişilikOda,ciftKişilikOda,dörtKişilikOda,suitOda,aileOdası,kralDairesi));

// static Map<Integer, String > musteriOdaBilgisi = new TreeMap<>();


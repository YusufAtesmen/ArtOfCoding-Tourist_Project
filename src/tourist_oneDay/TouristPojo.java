package tourist_oneDay;

public class TouristPojo {
    private String etkinlik;
    private int fiyat;
    private long time;

    public TouristPojo() {

    }

    public TouristPojo(String etkinlik, int fiyat,long time) {
        this.etkinlik = etkinlik;
        this.fiyat = fiyat;
        this. time=time;
    }

    public String getEtkinlik() {
        return etkinlik;
    }

    public void setEtkinlik(String etkinlik) {
        this.etkinlik = etkinlik;
    }

    public int getFiyat() {
        return fiyat;
    }

    public void setFiyat(int fiyat) {
        this.fiyat = fiyat;
    }

    public long getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }
}

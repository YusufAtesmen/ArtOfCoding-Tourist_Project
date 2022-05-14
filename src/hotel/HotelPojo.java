package hotel;

public class HotelPojo {
    private String tv;
    private String internet;
    private String jakuzi;
    private String odaBilgi;
    private int fiyat;

    public int getFiyat() {
        return fiyat;
    }

    public void setFiyat(int fiyat) {
        this.fiyat = fiyat;
    }

    public HotelPojo(String tv, String internet, String jakuzi, String odaBilgi, int fiyat) {
        this.tv = tv;
        this.internet = internet;
        this.jakuzi = jakuzi;
        this.odaBilgi = odaBilgi;
        this.fiyat = fiyat;
    }

    public String getOdaBilgi() {
        return odaBilgi;
    }

    public void setOdaBilgi(String odaBilgi) {
        this.odaBilgi = odaBilgi;
    }

    public String getTv() {
        return tv;
    }

    public void setTv(String tv) {
        this.tv = tv;
    }

    public String getInternet() {
        return internet;
    }

    public void setInternet(String internet) {
        this.internet = internet;
    }

    public String getJakuzi() {
        return jakuzi;
    }

    public void setJakuzi(String jakuzi) {
        this.jakuzi = jakuzi;
    }

    @Override
    public String toString() {
        return
                "tv='" + tv + '\'' +
                ", internet='" + internet + '\'' +
                ", jakuzi='" + jakuzi + '\''
                ;
    }
}

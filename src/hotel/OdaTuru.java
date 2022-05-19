package hotel;

public class OdaTuru {

    int internet=500;
    int otelTv=  500;
    int jakuzi=  500;
    int konum=   500;
    int yatak=   1000;
    int minibar= 2000;

    public OdaTuru(int internet, int otelTv, int jakuzi, int konum, int yatak, int minibar) {
        this.internet = internet;
        this.otelTv = otelTv;
        this.jakuzi = jakuzi;
        this.konum = konum;
        this.yatak = yatak;
        this.minibar = minibar;
    }

    public int getInternet() {
        return internet;
    }

    public int getOtelTv() {
        return otelTv;
    }

    public int getJakuzi() {
        return jakuzi;
    }

    public int getKonum() {
        return konum;
    }

    public int getYatak() {
        return yatak;
    }

    public int getMinibar() {
        return minibar;
    }
}

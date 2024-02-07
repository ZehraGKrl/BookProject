
class Kitap {

    //TODO: int kitapNumarasi ve yayinYili; String kitapAdi ve yazarAd; double fiyat fieldlarini olusturun.
    // Oluşan her kitap nesnesinin yegane (unique) bir kitap numarası olmalıdır.
    private static int nextKitapId =1;
    private int kitapNumarasi;

    private String kitapAdi;
    private String yazarAd;
    private int yayinYili;
    private double fiyat;


    ///////////////////////////////////////////////////////////////////////

    public Kitap(String kitapAdi, String yazarAd, int yayinYili, double fiyat) {
        this.kitapNumarasi= ++nextKitapId;
        this.kitapAdi = kitapAdi;
        this.yazarAd = yazarAd;
        this.yayinYili = yayinYili;
        this.fiyat = fiyat;
    }

    public int getKitapNumarasi() {
        return kitapNumarasi;
    }

    public String getKitapAdi() {
        return kitapAdi;
    }

    public void setKitapAdi(String kitapAdi) {
        this.kitapAdi = kitapAdi;
    }

    public String getYazarAd() {
        return yazarAd;
    }

    public void setYazarAd(String yazarAd) {
        this.yazarAd = yazarAd;
    }

    public int getYayinYili() {
        return yayinYili;
    }

    public void setYayinYili(int yayinYili) {
        this.yayinYili = yayinYili;
    }

    public double getFiyat() {
        return fiyat;
    }

    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }

    @Override
    public String toString() {
        return "Kitap{" +
                "kitapNumarasi=" + kitapNumarasi +
                ", yayinYili=" + yayinYili +
                ", kitapAdi='" + kitapAdi + '\'' +
                ", yazarAd='" + yazarAd + '\'' +
                ", fiyat=" + fiyat +
                '}';
    }
}

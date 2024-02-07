
class Kitap {

    //TODO: int kitapNumarasi ve yayinYili; String kitapAdi ve yazarAd; double fiyat fieldlarini olusturun.
    // Oluşan her kitap nesnesinin yegane (unique) bir kitap numarası olmalıdır.
    private static int nextKitapId =100;
    private int kitapNumarasi;
    private int yayinYili;
    private String kitapAdi;
    private String yazarAd;
    private double fiyat;


    ///////////////////////////////////////////////////////////////////////

    public Kitap(int yayinYili, String kitapAdi, String yazarAd, double fiyat) {
        this.kitapNumarasi= ++nextKitapId;
        setYayinYili(yayinYili);
        setKitapAdi(kitapAdi);
        setYazarAd(yazarAd);
        setFiyat(fiyat);
    }

    public static int getNextKitapId() {
        return nextKitapId;
    }

    public static void setNextKitapId(int nextKitapId) {
        Kitap.nextKitapId = nextKitapId;
    }

    public int getKitapNumarasi() {
        return kitapNumarasi;
    }

    public void setKitapNumarasi(int kitapNumarasi) {
        this.kitapNumarasi = kitapNumarasi;
    }

    public int getYayinYili() {
        return yayinYili;
    }

    public void setYayinYili(int yayinYili) {
        this.yayinYili = yayinYili;
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

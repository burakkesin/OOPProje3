public class Araba {

    private String kasaTipi;
    private String model;
    private int kullanımKm;
    private int fiyat;
    private int Kapı;

    public Araba(String kasaTipi, String model, int kullanımKm, int fiyat, int kapı){
        this.kasaTipi = kasaTipi;
        this.model = model;
        this.kullanımKm = kullanımKm;
        this.fiyat = fiyat;
        this.Kapı = kapı;
    }

    public void arabayıSür(int surulenKm){
        this.kullanımKm += surulenKm;
        System.out.println("Arabanın yeni km " + this.kullanımKm);
    }
    public int satışFiyatı(int yeniSatısFiyatı){
        return this.fiyat= yeniSatısFiyatı;

    }

    public String getKasaTipi() {
        return kasaTipi;
    }

    public String getModel() {
        return model;
    }

    public int getKullanımKm() {
        return kullanımKm;
    }

    public int getFiyat() {
        return fiyat;
    }

    public int getKapı() {
        return Kapı;
    }
}

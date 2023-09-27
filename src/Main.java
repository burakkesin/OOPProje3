public class Main {
    public static void main(String[] args) {


        Sedan sedanCp = new Sedan("opel", 3000, 500, 2);
        System.out.println("aracımın modeli" + "A"+ sedanCp.getModel() + "A" + sedanCp.getKapı() + "fiyat" + sedanCp.getFiyat() + sedanCp.getKullanımKm());


        sedanCp.arabayıSür(5000);
        sedanCp.satışFiyatı(250);
        System.out.println("aracımın modeli" + "A"+ sedanCp.getModel() + "A" + sedanCp.getKapı() + "fiyat" + sedanCp.getFiyat() + sedanCp.getKullanımKm());

    }


}
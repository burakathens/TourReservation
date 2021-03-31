public class SehirTuru extends TatilTurlari{


    //constructorlar
    public SehirTuru() {

    }
    public SehirTuru(String Adi, String Donemi) {
        super(Adi, Donemi);
    }
    public SehirTuru(String adi,boolean kampanya){
        super.turAdi=adi;
        super.setKampanya(kampanya);
    }

    //fiyat hesaplayan methodumuz
    //normalda TatilTurları altında fiyat hesaplama yazabilirdik fakat
    // listeleme yapmayı dusundugumuz ıcın objeleri olusturmamız gerekecekti
    //bundan dolayı zaten runner sınıfında direk tur olusturup fiyat bilgisni cektik
    // Tatil turları altındaki Hesapla() metodu bosa cıktı onu silmemiz gerekecek

    public float SehirFiyatla(int kisisayisi, String turdonemi, boolean kampanyaVarMi){
        float toplam=0;
        //kampanyalı yaz
        if (kampanyaVarMi && turdonemi.equalsIgnoreCase("yaz")){
            toplam= 0.15f*(float)(kisisayisi*3*1100);
            return toplam;
        }
        //kampanyalı kış
        if (kampanyaVarMi && turdonemi.equalsIgnoreCase("kış")){
            toplam= 0.15f*(float)(kisisayisi*2*1100);
            return toplam;
        }
        //kampanyasız kış
        if(!kampanyaVarMi&&turdonemi.equalsIgnoreCase("kış")){
            toplam= (float)(kisisayisi*2*1100);
            return toplam;
        }
        //kampanyasız yaz
        if(!kampanyaVarMi&&turdonemi.equalsIgnoreCase("yaz")){
            toplam= (float)(kisisayisi*3*1100);
            return toplam;
        }

        return toplam;
    }

    @Override
    public String toString() {
        return "SehirTuru{" +
                "turAdi='" + turAdi + '\'' +
                ", turDonemi='" + turDonemi + '\'' +
                ", turFiyati=" + turFiyati +
                ", kisiSayi=" + kisiSayi +
                '}';
    }
}

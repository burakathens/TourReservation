public class GunlukTur extends TatilTurlari{
    public GunlukTur() {
    }

    public GunlukTur(String Adi, String Donemi) {
        super(Adi, Donemi);
    }
    public GunlukTur(String Adi,boolean kampanya){

    }
    public GunlukTur(String adi,String donemi,boolean kampanya,int kisisayisi){
        super(adi,donemi,kampanya,kisisayisi);
    }
    public float GunFiyatHesapla(int kisisayisi, String turdonemi, boolean kampanyaVarMi){
        float toplam=0;
        //kampanyalı yaz
        if (kampanyaVarMi && turdonemi.equalsIgnoreCase("yaz")){
            toplam= 0.3f*(float)(kisisayisi*3*800);
            return toplam;
        }
        //kampanyalı kış
        if (kampanyaVarMi && turdonemi.equalsIgnoreCase("kış")){
            toplam= 0.3f*(float)(kisisayisi*2*800);
            return toplam;
        }
        //kampanyasız kış
        if(!kampanyaVarMi&&turdonemi.equalsIgnoreCase("kış")){
            toplam= (float)(kisisayisi*2*800);
            return toplam;
        }
        //kampanyasız yaz
        if(!kampanyaVarMi&&turdonemi.equalsIgnoreCase("yaz")){
            toplam= (float)(kisisayisi*3*800);
            return toplam;
        }

        return toplam;
    }

    @Override
    public String toString() {
        return "GunlukTur{" +
                "turAdi='" + turAdi + '\'' +
                ", turDonemi='" + turDonemi + '\'' +
                ", turFiyati=" + turFiyati +
                ", kisiSayi=" + kisiSayi +
                '}';
    }
}

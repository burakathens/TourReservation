public class AdaTuru extends TatilTurlari {



    //constructorlar
    AdaTuru(){
    }
    AdaTuru(String adi){

        super(adi);
    }
    AdaTuru(String adi, String turdonemi){
        super(adi,turdonemi);
    }
    AdaTuru(String adi, String turdonemi,boolean kampanyaVarMi){
        super(adi,turdonemi);
        super.setKampanya(kampanyaVarMi);
    }
    AdaTuru(String adi,boolean kampanyaVarMi){
        super.turAdi=adi;
        super.setKampanya(kampanyaVarMi);

    }




    //methodlar

    public float AdaFiyatHesapla(int kisisayisi, String turdonemi, boolean kampanyaVarMi){
     float toplam=0;
     //kampanyalı yaz
        if (kampanyaVarMi && turdonemi.equalsIgnoreCase("yaz")){
        toplam= 0.3f*(float)(kisisayisi*3*1200);
        return toplam;
     }
        //kampanyalı kış
        if (kampanyaVarMi && turdonemi.equalsIgnoreCase("kış")){
            toplam= 0.3f*(float)(kisisayisi*2*1200);
            return toplam;
        }
        //kampanyasız kış
        if(!kampanyaVarMi&&turdonemi.equalsIgnoreCase("kış")){
            toplam= (float)(kisisayisi*2*1200);
            return toplam;
        }
        //kampanyasız yaz
        if(!kampanyaVarMi&&turdonemi.equalsIgnoreCase("yaz")){
            toplam= (float)(kisisayisi*3*1200);
            return toplam;
        }

        return toplam;
    }

    @Override
    public String toString() {
        return "AdaTuru{" +
                "turAdi='" + turAdi + '\'' +
                ", turDonemi='" + turDonemi + '\'' +
                ", turFiyati=" + turFiyati +
                ", kisiSayi=" + kisiSayi +
                '}';
    }
}

public class TatilTurlari {
    String turAdi;
    String turDonemi;
    int turFiyati;
    private int turKontenjan;
    private boolean kampanya;
    public int kisiSayi;


    //constructor

    TatilTurlari(){

    }
    TatilTurlari(String Adi,String Donemi){
        turDonemi=Donemi;
        turAdi=Adi;


    }

    TatilTurlari(String adi){
        turAdi=adi;

    }
    TatilTurlari(String adi,String donemi,boolean kampanya,int kisisayisi){
        turAdi=adi;
        turDonemi=donemi;
        this.kampanya=kampanya;
        kisiSayi=kisisayisi;

    }

    //getter && setter
    //-----------------------------------
    public int getKontenjan(){

        return turKontenjan;
    }
    public void setKontenjan(int kontenjan){
        this.turKontenjan=kontenjan;
    }

    public String getTurDonemi(){
        return turDonemi;
    }
    public void setTurDonemi(String donem){
        turDonemi=donem;
    }
    public int getTurFiyati(){
        return turFiyati;
    }
    public void setTurFiyati(int fiyat){
        turFiyati=fiyat;
    }

    //overloading yapacağız bakalım
    //ama cast etmemiz gerekti? float turfiyatı tanımlasaydık
    // diğer kodlar karısacaktı neyse şimdilik kalsın
    public void setTurFiyati(float fiyat){
        turFiyati= (int) fiyat;
    }

    public boolean isKampanya() {
        return kampanya;
    }

    public void setKampanya(boolean kampanya) {
        this.kampanya = kampanya;
    }

    //------------------------------------
    //fiyat hesaplama
    //-----------------------------------
    // yaz olursa *3 kış olursa *2, ada turu 1200, sehir 1100, gunluk 800
    //kampanya varsa alt classlarda talimmattaki sekilde indirimler yapılacak

   /* public int HesapYap(int kisisayisi,String turDonemi){
        int toplam=0;

        kisiSayi =kisisayisi;

        if (turAdi.equals("Ada Turu")&&turDonemi.equalsIgnoreCase("yaz")){
            toplam=1200* kisiSayi *3;
        }
        if (turAdi.equals("Sehir Turu")&& turDonemi.equalsIgnoreCase("yaz")){
            toplam=1100* kisiSayi *3;
        }
        if (turAdi.equals("Gunluk")&& turDonemi.equalsIgnoreCase("yaz")){
            toplam=800* kisiSayi *3;
        }
        if (turAdi.equals("Ada Turu")&& turDonemi.equalsIgnoreCase("kış")){
            toplam=1200* kisiSayi*2;
        }
        if (turAdi.equals("Sehir Turu")&& turDonemi.equalsIgnoreCase("kış")){
            toplam=1100* kisiSayi*2;
        }
        if(turAdi.equals("Gunluk")&& turDonemi.equalsIgnoreCase("kış")){
            toplam=800* kisiSayi*2;
        }


            return toplam;
    } */

    public void infoTur(int kisi){
        System.out.println("======================================\n");
        System.out.println("Seçmiş olduğunuz "+kisi
                +" kişilik turun bilgileri\n"
                +"-------------------------------------\n"
                +"Tur Adı    : " +turAdi.toUpperCase()
                +"\nTur Dönemi : "+turDonemi.toUpperCase()
                +"\nTur Fiyatı : "+turFiyati+"\n");
        System.out.println("======================================");

    }

}

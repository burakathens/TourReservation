import java.util.ArrayList;
import java.util.Scanner;

public class Runner {
   public ArrayList turList=new ArrayList();

    public static void main(String[] args) {

        Runner runner= new Runner();
        runner.TurRezervasyonu();
        System.out.println(runner.turList.toString());


    }
    public void TurRezervasyonu(){
        int sec=0;
        int kisi=0;
        int donem=0;
        boolean kp=true;
        int kp1=0;
        String donem1="";

       do {
           Scanner scan=new Scanner(System.in);
           System.out.println("Athens Tura Hosgeldiniz");
           System.out.println("------------------------");
           System.out.println("1- Ada Turu ");
           System.out.println("2- Sehir Turu");
           System.out.println("3- Günü Birlik Tur");
           System.out.println("4- Çıkış Yap");
           System.out.println("------------------------");
           System.out.println("Hangi tura katılmak istiyorsunuz?");
           System.out.print(">>");
           //veri girişi
           sec= scan.nextInt();
           if(sec==4){break;}
           System.out.println("Hangi dönemde katılmak istersiniz?");
           System.out.println("1- Yaz Dönemi ");
           System.out.println("2- Kış Dönemi ");
           System.out.print(">>");
           donem=scan.nextInt();
           if(donem==1){
               donem1="yaz";
           }else if(donem==2) {
               donem1="kış";
           }
           System.out.println("Tura katılacak kişi sayını giriniz:");
           kisi=scan.nextInt();
           System.out.println("Kampanyadan faydalanmak ister misniz?");
           System.out.println("1- Evet");
           System.out.println("2- Hayır");
           System.out.print(">>");
           kp1=scan.nextInt();
           if (kp1==1){
               kp=true;
           }else if(kp1==2){
               kp=false;
           }
           switch (sec){
               case 1:

                   //tur adı tur donemi kisi sayısı kampanyadurumu
                   TurOlustur("Ada Turu",donem1,kisi,kp);
                   break;

               case 2:
                   TurOlustur("Sehir Turu",donem1,kisi,kp);
                   break;
               case 3:
                   TurOlustur("Gunluk",donem1,kisi,kp);
                   break;

               default:
                   System.out.println("hata1: girdiğiniz veriler hatalı diyelim ");
                   break;
           }



       }while (sec!=4);{
            System.out.println("Athens Turu tercih ettiğiniz için teşekkür ederiz! ");
        }


    }

      void TurOlustur(String turAd,String turdonem,int kisisayisi,boolean kampanya){
          TatilTurlari tur=new TatilTurlari(turAd,turdonem);
          AdaTuru adaTuru=new AdaTuru("Ada Turu",kampanya);
          SehirTuru sehirTuru=new SehirTuru("Sehir Turu",kampanya);
          GunlukTur gunlukTur=new GunlukTur("Gunluk Tur",turdonem,kampanya,kisisayisi);
        switch (turAd){

            //adaturunu yukarda olusturmustuk asagıda ise fiyatını ve donemini atadık ve bilgilrini yazdırdık
            case "Ada Turu":
                adaTuru.turDonemi=turdonem;
                adaTuru.kisiSayi=kisisayisi;
                float f=adaTuru.AdaFiyatHesapla(kisisayisi,turdonem,kampanya);
                adaTuru.turFiyati=(int)f;
                System.out.println("-----------------------------");
                adaTuru.infoTur(kisisayisi);
                TuruListeyeEkle(adaTuru);
                break;
            case "Sehir Turu":
                sehirTuru.setTurDonemi(turdonem);
                sehirTuru.kisiSayi=kisisayisi;
               float f2=sehirTuru.SehirFiyatla(kisisayisi,turdonem,kampanya);
               //burada overloading yaptık setTurfiyatı hem int hem float alacak umarım
                sehirTuru.setTurFiyati(f2);
                System.out.println("-----------------------------");
                sehirTuru.infoTur(kisisayisi);
                TuruListeyeEkle(sehirTuru);
                break;
            case "Gunluk":
                float f3=gunlukTur.GunFiyatHesapla(kisisayisi,turdonem,kampanya);
                gunlukTur.turFiyati=(int)f3;
                gunlukTur.infoTur(kisisayisi);
                TuruListeyeEkle(gunlukTur);
                break;
            default:
                System.out.println("ne hatası aldık acaba!");
        }
    }

    //kullanıcı cıkıs yapmadan once sectıgı tum turları listelemek icin
    // overloading islemi yaptık
    void TuruListeyeEkle(AdaTuru tur){
        turList.add(tur);
    }
    void TuruListeyeEkle(SehirTuru tur){
        turList.add(tur);
    }
    void TuruListeyeEkle(GunlukTur tur){
        turList.add(tur);
    }
}

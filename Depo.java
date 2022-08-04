package market_projesi;

import java.util.*;

import static java.lang.Integer.parseInt;
import static market_projesi.Depo.urun_fiyat;

public class Depo {
    static HashMap<String, String> liste = new HashMap<>();
    static String [] urun_fiyat=new String[2];
static double fiyat;
static double miktar;
    static List<Double> sepet = new ArrayList<>();
    //  static Map.Entry<String,String> entry= (Map.Entry<String, String>) liste.entrySet();
    static void alısverislist() {
        liste.put("00", "Domates, 2.10 ");
        liste.put("01", "Patates, 3.20 ");
        liste.put("02", "Biber, 1.50 ");
        liste.put("03", "Soğan, 2.30 ");
        liste.put("04", "Havuç, 3.10 ");
        liste.put("05", "Elma, 1.20 ");
        liste.put("06", "Muz, 1.90 ");
        liste.put("07", "çilek, 6.10 ");
        liste.put("08", "Kavun, 4.30 ");
        liste.put("09", "Üzüm, 2.70 ");
        liste.put("10", "Limon, 0.50 ");
        System.out.println("No Ürün    Fiyat");
        for (Map.Entry<String, String> entry : liste.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            String valueArr[] = value.split(", ");
            System.out.printf("%2s %-7s %-7s \n", key, valueArr[0], valueArr[1]);
        }
    }

    /* Basarili Market alış-veriş programı.
     *
     * 1. Adım: Ürünler ve fiyatları içeren listeleri oluşturunuz.
     * 			No 	   Ürün 		  Fiyat
               ====	 =======	 	=========
                00	 Domates   	 	 2.10 TL
                01	 Patates   	 	 3.20 TL
                02	 Biber     	 	 1.50 TL
                03	 Soğan      	 2.30 TL
                04	 Havuç     	   	 3.10 TL
                05	 Elma      	   	 1.20 TL
                06	 Muz     	 	 1.90 TL
                07	 Çilek 	 		 6.10 TL
                08	 Kavun      	 4.30 TL
                09	 Üzüm      	 	 2.70 TL
                10	 Limon     	 	 1 TL

     * 2. Adım: Kullanıcının ürün nosuna göre listeden ürün seçmesini isteyiniz.
     * 3. Adım: Kaç kg satın almak istediğini sorunuz.
     * 4. Adım: Alınacak bu ürünü sepete ekleyiniz ve Sepeti yazdırınız.
     * 5. Başka bir ürün alıp almak istemediğini sorunuz.
     * 6. Eğer devam etmek istiyorsa yeniden ürün seçme kısmına yönlendiriniz.
     * 7. Eğer bitirmek istiyorsa ödemeyi kontrol edip para ustu hesaplayarak  programı bitirinzi.
     */
    static void urunsec_miktarhesapla() {
        Scanner scan = new Scanner(System.in);
        System.out.println("seçmek istediğiniz ürünün numarasını girin");
        String no = scan.next();
        String []urun_fiyat=(liste.get(no)).split(", ");
        System.out.println(liste.get(no));
        Scanner scan1 = new Scanner(System.in);
        System.out.println("ürünün miktarını yazın(kg)");
        double miktar = scan1.nextDouble();
        double fiyat= Double.parseDouble((urun_fiyat[1]));

        System.out.println(miktar+" kg "+urun_fiyat[0]+" sepetinize eklenmiştiş.");
       sepet.add((fiyat*miktar));
    }
static void odeme(){
    double toplamtutar = 0;
    for (int i=0;i<sepet.size();i++){
        toplamtutar+=sepet.get(i);
    }
    System.out.println("odemeniz gereken miktar " + toplamtutar+" tl'dir. lütfen ödemenizi yapmak için bir tutar girin");
    Scanner scan2=new Scanner(System.in);
    double odeme= scan2.nextDouble();
    double ilaveOdeme = 0;
  while (odeme<toplamtutar){
        System.out.println("ödenen miktar yetersizdir. lütfen para ekleyin");
        ilaveOdeme= scan2.nextDouble();
        odeme+=ilaveOdeme;
    }
    System.out.println((odeme-toplamtutar)+" para üstü verilecektir");
}

           }

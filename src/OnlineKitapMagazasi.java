import java.util.ArrayList;
import java.util.Scanner;

class OnlineKitapMagazasi {
    private ArrayList<Kitap> kitapListesi = new ArrayList<>();
    private Scanner input = new Scanner(System.in);
    private Scanner inputStr = new Scanner(System.in);

    public void kitapEkle() {
        System.out.println("Kitap adı giriniz:");
        String kitap=inputStr.nextLine();

        System.out.println("Yazar adı giriniz:");
        String yazar=inputStr.nextLine();

        System.out.println("Yayın yılını giriniz:");
        int yayinYili=input.nextInt();

        System.out.println("Kitabın fiyatını giriniz:");
        double fiyati=input.nextDouble();

        Kitap k=new Kitap(kitap,yazar,yayinYili,fiyati);
        kitapListesi.add(k);
        System.out.println("Kitap başarıyla eklenmiştir. \n");

    }
    //////////////////////////////////////////////////
    public void kitapSil() {

        System.out.print("Silmek istediğiniz kitabın numarasını girin: ");
        int silinecekKitapNumarasi = input.nextInt();

        // TODO: kitapSil() methodunu doldurunuz
        // Kullanıcıdan unique (yegane) kitap numarasını alarak, kitap listesinden çıkaran metodu yazınız.
        // NOT: Silinecek kitabın listede olup olmadığını kontrol etmeyi unutmayınız.
        // İşlemin sonucunu konsola yazdırınız: "Kitap başarıyla silindi." veya "Belirtilen numarada bir kitap bulunamadı." gibi...

        boolean varMi=false;

        for (Kitap o : kitapListesi) {

            if (silinecekKitapNumarasi == o.getKitapNumarasi()) {
                kitapListesi.remove(o);
                System.out.println("Girilen numaraya sahip kitap silindi.\n");
                System.out.println(kitapListesi);
                varMi=true;
                break;
            }
        }if (!varMi){
            System.out.println("Belirtilen numarada bir kitap bulunamadı.\n");
        }
    }

//////////////////////////////////////////////////



    public void kitapListele() {
        // TODO: kitapListele() methodunu doldurunuz
        // Lİstede bulunan kitapları listeleyen metodu yazınız...
        // Listede kitap yoksa konsola "Henüz kitap eklenmemiş." veya "Listede kitap yok" mesajı yazdırınız.
        if (kitapListesi.isEmpty()){
            System.out.println("Henüz kitap eklenmemiş.");
        } else{
            System.out.println(kitapListesi);

        }
    }
}

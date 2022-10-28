import java.util.Scanner;
public class Ucak {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double fiyat = 0.10;
        int km, yas, yolculukTipi;
        double yasindirimi, normalUcret, indirimliFiyat, gidisDonus, toplamUcret;


        System.out.print("Gilecek Mesafeyi Km Cinsinden Yazınız:");
        km = inp.nextInt();

        System.out.print("Tek Yön İse '1' Gidiş-Dönüş İse '2' yazınız:");
        yolculukTipi = inp.nextInt();

        System.out.print("Yaşınızı Yazınız:");
        yas = inp.nextInt();

        if (yolculukTipi == 1 || yolculukTipi == 2 || km > 0 && yas > 0) {

            //Sadece Gidiş İndirimli Fiyatlar
            if (yolculukTipi == 1) {
                if (yas < 12) {
                    normalUcret = km * fiyat;
                    yasindirimi = normalUcret / 2;
                    toplamUcret = normalUcret - yasindirimi;
                    System.out.println("Ödenilecek Tutar:" + toplamUcret);
                } else if ((yas > 12) && (yas < 24)) {
                    normalUcret = km * fiyat;
                    yasindirimi = normalUcret * 0.10;
                    toplamUcret = normalUcret - yasindirimi;
                    System.out.println("Ödenilecek Tutar:" + toplamUcret);
                } else if ((yas > 65)) {
                    normalUcret = km * fiyat;
                    yasindirimi = normalUcret * 0.30;
                    toplamUcret = normalUcret - yasindirimi;
                    System.out.println("Ödenilecek Tutar:" + toplamUcret);
                } else if ((yas >= 24) && (yas < 65)) {
                    normalUcret = km * fiyat;
                    System.out.println("Ödenilecek Tutar:" + normalUcret);
                } else {
                    System.out.println("Hatalı Veri girdiniz! ");
                }
            }
            //Gidiş Dönüş İndirimli Fiyatlar
            if (yolculukTipi == 2) {
                if (yas < 12) {
                    normalUcret = km * fiyat;
                    yasindirimi = (normalUcret / 2);
                    toplamUcret = normalUcret - (yasindirimi + (normalUcret * 0.2));
                    System.out.println("Ödenilecek Tutar:" + toplamUcret);
                } else if ((yas > 12) && (yas < 24)) {
                    normalUcret = km * fiyat;
                    yasindirimi = normalUcret * 0.10;
                    toplamUcret = normalUcret - (yasindirimi+(normalUcret * 0.2));
                    System.out.println("Ödenilecek Tutar:" + toplamUcret);
                } else if ((yas > 65)) {
                    normalUcret = km * fiyat;
                    yasindirimi = normalUcret * 0.30;
                    toplamUcret = normalUcret - (yasindirimi+(normalUcret * 0.2));
                    System.out.println("Ödenilecek Tutar:" + toplamUcret);
                } else if ((yas >= 24) && (yas < 65)) {
                    normalUcret = (km * fiyat) * 0.8;
                    System.out.println("Ödenilecek Tutar:" + normalUcret);
                } else {
                    System.out.println("Hatalı Veri girdiniz! ");
                }
            }else {
                System.out.println("Hatalı Giriş Yaptınız");
            }




        }
    }
}

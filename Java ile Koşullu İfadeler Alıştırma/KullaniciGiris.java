import java.util.Scanner;
public class KullaniciGiris {
    public static void main(String[] args) {
        String kullanici,sifre,yeniSifre,yenileme = null;

        Scanner inp = new Scanner(System.in);

        System.out.print("Kullanıcı Adınız:");
        kullanici = inp.nextLine();

        System.out.print("Şifreniz:");
        sifre = inp.nextLine();

        if (kullanici.equals("patika")&& sifre.equals("java123")){
            System.out.println("Giriş Yaptınız!");
        }else {
            System.out.print("Bilgileriniz yanlış, şifre yenilemek istermisiniz:  " + " \n( yes / no )");
            yenileme = inp.nextLine();
            if (yenileme.equals("no")) {
                System.out.print("Giriş başarısız");
            } else if (yenileme.equals("yes")) {
                System.out.print("Yeni şifrenizi giriniz :");
                yeniSifre = inp.nextLine();
                if (yeniSifre.equals("java123")) {
                    System.out.print("Şifreniz eski şifre ile aynıdır,lütfen başka bir parola seçiniz");
                } else {
                    System.out.println("Şifreniz oluşturuldu");
                }
            }
        }
        
    }
}

import java.util.Scanner;
public class Calcu {
    public static void main(String[] args) {

        int a,b,sec;

        Scanner input = new Scanner(System.in);
        System.out.println("İlk Sayıyı Giriniz");
        a = input.nextInt();
        System.out.println("İkinci Sayıyı Giriniz");
        b = input.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.println("Seçiminiz:");
        sec = input.nextInt();

        switch (sec){
            case 1:
                System.out.println("Toplam:" + (a + b));
                break;
            case 2:
                System.out.println("Sonuç:"+ (a-b));
                break;
            case 3:
                System.out.println("Sonuç:" + (a*b));
                break;
            case 4:
                switch (b){
                    case 0:
                        System.out.println("Bir Sayı Sıfıra Bölünemez !!");
                        break;
                    default:System.out.println("Sonuç:"+ (a / b));
                }
                break;
            default:
                System.out.println("Yanlış Seçim Yaptınız");
        }


    }
}

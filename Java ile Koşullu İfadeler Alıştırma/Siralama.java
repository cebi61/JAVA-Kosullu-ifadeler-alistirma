import java.util.Scanner;
public class Siralama {
    public static void main(String[] args) {

        int a,b,c;

        Scanner inp = new Scanner(System.in);

        System.out.print("İlk Sayıyı Giriniz:");
        a = inp.nextInt();

        System.out.print("İkinci Sayıyı Giriniz:");
        b = inp.nextInt();

        System.out.print("Üçüncü Sayıyı Giriniz:");
        c = inp.nextInt();

        if ((a > b) && (a > c)){
            if (b > c){
                System.out.println("1.Sayı > 2.Sayı > 3.Sayı");
            }else {
                System.out.println("1.Sayı > 3.Sayı > 2.Sayı");
            }

        }else if (b > a && b > c){
            if (a > c){
                System.out.println("2.Sayı > 1.Sayı > 3.Sayı");
            }else {
                System.out.println("2.Sayı > 3.Sayı > 1.Sayı");
            }
        }
        else if (c > a && c > b){
            if (a > b){
                System.out.println("3.Sayı > 1.Sayı > 3.Sayı");
            }else {
                System.out.println("3.Sayı > 2.Sayı > 1.Sayı");
            }
        }


    }
}

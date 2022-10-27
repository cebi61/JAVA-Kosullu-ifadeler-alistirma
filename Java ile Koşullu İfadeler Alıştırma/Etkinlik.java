import java.util.Scanner;
public class Etkinlik {
    public static void main(String[] args) {

        int sicaklik;

        Scanner inp = new Scanner(System.in);

        System.out.println("Sıcaklığı Giriniz:");
        sicaklik = inp.nextInt();

        if (sicaklik < 5){
            System.out.println("Kayak Yapabilirsiniz!");
        } else if (sicaklik < 15 && sicaklik >= 5) {
            System.out.println("Sinemaya Gidebilirsiniz!");
        } else if (sicaklik < 25 && sicaklik >= 15) {
            System.out.println("Piknik Yapabilirsiniz!");
        } else if (sicaklik >= 25 ) {
            System.out.println("Yüzmeye Gidebilirsiniz");

        }



    }
}

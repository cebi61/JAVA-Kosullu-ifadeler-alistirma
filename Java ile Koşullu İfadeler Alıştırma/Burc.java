import java.util.Scanner;
public class Burc {
    public static void main(String[] args) {

    int gun,ay;
        Scanner inp = new Scanner(System.in);

        System.out.println("1:Ocak - 2:Şubat - 3:Mart - 4:Mayıs - 5:Nisan - 6:Haziran - 7:Temmuz - 8:Ağustos - 9:Eylül - 10:Ekim - 11:Kasım - 12:Aralık");

        System.out.print("Doğduğunuz Ay:");
        ay = inp.nextInt();

        System.out.print("Doğduğunuz Gün:");
        gun = inp.nextInt();

        if ((ay == 1) && (gun <= 31)) {
            if (gun > 22) {
                System.out.println("Kova");
            } else {
                System.out.println("Oğlak");
            }
        }

        if ((ay == 2) && (gun <= 29)) {
            if (gun > 20) {
                System.out.println("Balık");
            } else {
                System.out.println("Kova");
            }
        }

        if ((ay == 3) && (gun <= 31)) {
            if (gun > 20) {
                System.out.println("Koç");
            } else {
                System.out.println("Balık");
            }
        }

        if ((ay == 4) && (gun<= 30)) {
            if (gun > 20) {
                System.out.println("Boğa");
            } else {
                System.out.println("Koç");
            }
        }

        if ((ay == 5) && (gun <= 31)) {
            if (gun > 21) {
                System.out.println("İkizler");
            } else {
                System.out.println("Boğa");
            }
        }

        if ((ay == 6) && (gun <= 30)) {
            if (gun > 22) {
                System.out.println("Yengeç");
            } else {
                System.out.println("İkizler");
            }
        }

        if ((ay == 7) && (gun <= 31)) {
            if (gun > 22) {
                System.out.println("Aslan");
            } else {
                System.out.println("Yengeç");
            }
        }

        if ((ay == 8) && (gun <= 31)) {
            if (gun > 22) {
                System.out.println("Başak");
            } else {
                System.out.println("Aslan");
            }
        }

        if ((ay == 9) && (gun <= 30)) {
            if (gun > 22) {
                System.out.println("Terazi");
            } else {
                System.out.println("Başak");
            }
        }

        if ((ay == 10) && (gun <= 31)) {
            if (gun > 22) {
                System.out.println("Akrep");
            } else {
                System.out.println("Terazi");
            }
        }

        if ((ay == 11) && (gun <= 30)) {
            if (gun > 21) {
                System.out.println("Yay");
            } else {
                System.out.println("Akrep");
            }
        }

        if ((ay == 12) && (gun <= 31)) {
            if (gun > 21) {
                System.out.println("Oğlan");
            } else {
                System.out.println("Yay");
            }
        }







        //Koç Burcu : 21 Mart - 20 Nisan
        //
        //Boğa Burcu : 21 Nisan - 21 Mayıs
        //
        //İkizler Burcu : 22 Mayıs - 22 Haziran
        //
        //Yengeç Burcu : 23 Haziran - 22 Temmuz
        //
        //Aslan Burcu : 23 Temmuz - 22 Ağustos
        //
        //Başak Burcu : 23 Ağustos - 22 Eylül
        //
        //Terazi Burcu : 23 Eylül - 22 Ekim
        //
        //Akrep Burcu : 23 Ekim - 21 Kasım
        //
        //Yay Burcu : 22 Kasım - 21 Aralık
        //
        //Oğlak Burcu : 22 Aralık - 21 Ocak
        //
        //Kova Burcu : 22 Ocak - 19 Şubat
        //
        //Balık Burcu : 20 Şubat - 20 Mart
    }
}

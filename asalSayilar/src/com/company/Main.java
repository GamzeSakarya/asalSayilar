import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int sayi = scan.nextInt();
        scan.close();

        if (sayi <= 1 ){
            System.out.println(sayi +" sayısı asal değildir !");

        }else{
            boolean sonuc = isAsal(sayi, 2);
            if(sonuc) {
                System.out.println(sayi + " sayısı asaldır !");
            }else{
                System.out.println(sayi + " sayısı asal değildir !");
            }
        }
    }
    static boolean isAsal(int sayi , int bolen) {
        if (bolen == sayi){
            return true;

        }
        if (sayi % bolen == 0) {
            return false;

        }
        return isAsal(sayi,bolen + 1);
    }

}

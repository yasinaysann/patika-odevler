import java.util.Scanner;

class GirilenSayiyaKadar4ve5inKatlari {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı Giriniz:");
        int num = scanner.nextInt();
        System.out.print("4'ün Kuvvetleri: ");
        for (int i = 1; i <=num ; i*=4) {
            System.out.print(" "+i);
        }
        System.out.println();
        System.out.print("5'ün Kuvvetleri: ");
        for (int i = 1; i <=num ; i*=5) {
            System.out.print(" "+i);
        }
        scanner.close();
    }    
}

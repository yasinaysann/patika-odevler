import java.util.Scanner;

class EnBuyukEnKucukSayi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min=0, max=0;

        System.out.println("Kac tane sayi gireceksiniz: ");
        int n = scanner.nextInt();

        System.out.println("Kullanıcıdan " + n+ " sayı istenecektir.");

        for(int i=1; i<=n; i++){
            System.out.println(i+"." + "Sayiyi Giriniz: ");
            int sayi = scanner.nextInt();

            if (i==1){
                max=sayi;
                min=sayi;
            }
            if (sayi>max)
                max=sayi;

            if (sayi<min)
                min=sayi;
        }
        System.out.println("girilen " + n + " sayi icinden en buyuk olani: " + max);
        System.out.println("girilen " + n + " sayi icinden en kucuk olani: " + min);
        scanner.close();
    }    
}

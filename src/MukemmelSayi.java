import java.util.Scanner;

class MukemmelSayi {
    public static void main(String[] args) {
        int res = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayiyi Giriniz: " );
        int number = scanner.nextInt();

        for (int i = 1; i < number; i++) {
            if(number % i == 0){
                res += i;
            }
        }
        if (res==number){
            System.out.println(number+" mükemmel sayidir !");
        }
        else System.out.println(number+" mükemmel sayi degildir");
        scanner.close();
    }    
}

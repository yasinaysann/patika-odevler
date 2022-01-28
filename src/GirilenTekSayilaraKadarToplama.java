import java.util.Scanner;

class GirilenTekSayilaraKadarToplama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num=0,total=0;
        do {
            System.out.print("Sayı Giriniz:");
            num= scanner.nextInt();
            if(num%4==0){
                total += num;
            }
        }while (num%2==0);
        System.out.println(total);
        scanner.close();
    }
}

import java.util.Scanner;

class Faktoriyel {
    public static void main(String[] args) {
        System.out.println("Kombinasyonu Hesaplanacak Değerleri Giriniz:");
        Scanner scanner = new Scanner(System.in);
        //C(n,r) = n! / (r! * (n-r)!)

        int n = scanner.nextInt();
        int r = scanner.nextInt();
        int result;

        result = factorial(n) / (factorial(r) * factorial(n-r));
        System.out.println(result);
        scanner.close();
    }

    public static  int factorial(int fac){
        int total = 1;
        for (int i = 1; i <= fac; i++){
            total = total * i;
        }
        return total;
    }

}

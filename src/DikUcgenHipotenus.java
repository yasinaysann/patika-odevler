import java.util.Scanner;

class DikUcgenHipotenus {
    public static void main(String[] args) {
        int kenarA, kenarB, kenarC;
        
        double alan;

        Scanner scanner = new Scanner(System.in);

        System.out.print("1.Kenar Girin: ");
        kenarA = scanner.nextInt();

        System.out.print("2.Kenar Girin: ");
        kenarB = scanner.nextInt();

        System.out.print("3.Kenar Girin: ");
        kenarC = scanner.nextInt();

        int u = (kenarA + kenarB + kenarC) / 2 ;

        alan = Math.sqrt(u *(u - kenarA) * (u - kenarB)*(u-kenarC));
        System.out.println("Alan: " + alan +" m2");

        scanner.close();
    }
}

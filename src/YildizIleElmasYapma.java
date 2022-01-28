import java.util.Scanner;

class YildizIleElmasYapma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number Enter: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i) - 1; k++) {
                System.out.print("*");
            }

            System.out.println();

        }
        for (int m = n; m >= 1; m--) {

            for (int j = 1; j <= (n - m); j++) {
                System.out.print(" ");
            }
            for (int k = (2 * m) - 1; k >= 1; k--) {
                System.out.print("*");
            }

            System.out.println();
        }
        scanner.close();
    }
}

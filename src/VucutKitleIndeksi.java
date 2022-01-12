import java.util.Scanner;

class VucutKitleIndeksi {
    public static void main(String[] args) {
            
        double kilo, boy;
        double vki;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Kiloyu Giriniz: ");
        kilo = scanner.nextDouble();

        System.out.print("Boyunuzu Giriniz(Metre Cinsinden): ");
        boy = scanner.nextDouble();

        vki =  kilo / boy * boy;

        System.out.println("Vucut Kitle Endeksi: " + vki);

        scanner.close();

    }
}

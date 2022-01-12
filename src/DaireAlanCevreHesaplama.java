import java.util.Scanner;

class DaireAlanCevreHesaplama {
    public static void main(String[] args) {
        
        double diliminAlani;
        double r,diliminDerecesi;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Yaricapi giriniz: ");
        r = scanner.nextDouble();

        System.out.println("Acisini giriniz: ");
        diliminDerecesi = scanner.nextDouble();

        diliminAlani = (Math.PI * (r*r) * diliminDerecesi) / 360;

        System.out.println(diliminAlani);

        scanner.close();


        
    }    
}

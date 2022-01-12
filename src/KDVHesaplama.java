import java.util.Scanner;

class KDVHesaplama {
    public static void main(String[] args) {
        double tutar;
        double kdvTutar;
        double kdvDahilTutar;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ucret tutarini giriniz: ");
        tutar = scanner.nextDouble();
        if(tutar < 1000){
            kdvTutar = tutar * 0.18;
            kdvDahilTutar = tutar + kdvTutar; 
            System.out.println("Kdvli fiyat:"+ kdvDahilTutar );
        }else{
            kdvTutar =  tutar * 0.08;
            kdvDahilTutar = tutar + kdvTutar;
            System.out.println("Kdvli fiyat:"+ kdvDahilTutar );
        }

        scanner.close();
    }
}

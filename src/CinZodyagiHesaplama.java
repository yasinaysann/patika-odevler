import java.util.Scanner;

class CinZodyagiHesaplama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int yil;

        System.out.println("Doğum yılınızı giriniz: ");
        yil = scanner.nextInt();

        String zodyak = "";


        if(yil % 12 == 0){
            zodyak = "Maymun";
        }
        if(yil % 12 == 1){
            zodyak = "Horoz";
        }
        if(yil % 12 == 2){
            zodyak = "Köpek";
        }
        if(yil % 12 == 3){
            zodyak = "Domuz";
        }
        if(yil % 12 == 4){
            zodyak = "Fare";
        }
        if(yil % 12 == 5){
            zodyak = "Öküz";
        }
        if(yil % 12 == 6){
            zodyak = "Kaplan";
        }
        if(yil % 12 == 7){
            zodyak = "Tavşan";
        }
        if(yil % 12 == 8){
            zodyak = "Ejderha";
        }
        if(yil % 12 == 9){
            zodyak = "Yılan";
        }
        if(yil % 12 == 10){
            zodyak = "At";
        }
        if(yil % 12 == 11){
            zodyak = "Koyun";
        }

        System.out.println("Zodyak Burcunuz: " + zodyak);
        scanner.close();
    }
}

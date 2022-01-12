import java.util.Scanner;

class Taksimetre {
    public static void main(String[] args) {
        double kmBasina = 2.20;
        double acilisUcreti = 10;
        int minimumTutar = 20;
        int km;
        double total;

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Kac km gidiceksiniz: ");
        km = scanner.nextInt();

        total = acilisUcreti+(km * kmBasina);

        if(total < 20){
            System.out.print(minimumTutar);
        }else{
            System.out.println(total);
        }
        
        scanner.close();

    }
}

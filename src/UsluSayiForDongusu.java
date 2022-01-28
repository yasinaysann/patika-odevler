import java.util.Scanner;

class UsluSayiForDongusu {
    public static void main(String[] args) {
        int sayi;
        int ust;
        Scanner scanner=new Scanner(System.in);

        System.out.print("Sayi : \t");
        sayi=scanner.nextInt();
        System.out.print("Ust : \t");
        ust=scanner.nextInt();

        int  sonuc=1;
        for(int i=0;i<ust;i++){
            sonuc*=sayi;
        }
        System.out.print("Sonuc : \t"+sonuc);

        scanner.close();
    }
}

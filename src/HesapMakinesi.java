import java.util.Scanner;

class HesapMakinesi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1-Toplama \n2-Cikarma\n3-Carpma\n4-Bolme");
        System.out.print("Yapmak Istediiniz islemin numarasini seciniz : ");
        int selectionNumber = scanner.nextInt();

        System.out.print("1.Sayiyi Giriniz: ");
        int number1 = scanner.nextInt();

        System.out.print("2.Sayiyi Giriniz: ");
        int number2 = scanner.nextInt();

        switch (selectionNumber) {
            case 1:
                System.out.println("Girilen Sayilarin Toplami: "+(number1+number2));
                break;
            case 2:
                System.out.println("Girilen Sayilarin Cikarmasi: "+(number1-number2));
                break;
            case 3:
                System.out.println("Girilen Sayilarin Carpimi: "+(number1*number2));
                break;
            case 4:
                System.out.println("Girilen Sayilarin bolumu: "+(number1/number2));
                break;    
            default:
                break;
        }
        scanner.close();
    }
}

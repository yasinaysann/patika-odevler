import java.util.Scanner;

class JavaSicakliginaGoreEtkinlikOnerme {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Lutfen dereceyi giriniz: ");
        int weather = scanner.nextInt();
        switch (condition(weather)) {
            case 1:
                System.out.println("Kayak");
                break;
            case 2:
                System.out.println("Sinema");
                break;
            case 3:
                System.out.println("Piknik");
                break;
            case 4:
                System.out.println("Yuzme");
                break;
            default:
                System.out.println("Gecerli bir derece Giriniz");
                break;
        }
        scanner.close();
    }
    public static int condition(int degree){
        int suggestion= 0;
        if(degree < 5){
            suggestion = 1;
        }else if(degree >= 5 && degree < 15){
            suggestion = 2;
        }else if(degree >= 15 && degree < 25){
            suggestion = 3;
        }else if(degree >= 25){
            suggestion = 4;
        }
        return suggestion;
    }

}

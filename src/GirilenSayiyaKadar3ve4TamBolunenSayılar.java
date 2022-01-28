import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class GirilenSayiyaKadar3ve4TamBolunenSayılar{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Sayiyi Giriniz: ");
        int number = scanner.nextInt();
        int sum = 0;
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            if(i % 3 == 0 && i % 4 == 0){
                numbers.add(i);
            }
        }

        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
        }

        System.out.println(sum / numbers.size());

        scanner.close();
    }
}
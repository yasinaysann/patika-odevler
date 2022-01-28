import java.util.Scanner;

class Harmonik {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Number Enter :");
        int n=scanner.nextInt();
        double result =0;
        for (double i=1;i<=n;i++){
            result +=(1/i);
        }
        System.out.println(result);
        scanner.close();
    }    
}

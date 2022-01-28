import java.util.Scanner;

class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1=0,number2=1,number3,i,n;
        System.out.print("Number Enter:");
        n = scanner.nextInt();
        System.out.print(number1+" "+number2);

        for(i=2;i<n;++i){
                number3=number1+number2;
                System.out.print(" "+number3);
                number1=number2;
                number2=number3;
        }
        System.out.println();
        scanner.close();
    }    
}

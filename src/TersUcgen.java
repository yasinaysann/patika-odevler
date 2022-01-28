import java.util.Scanner;

class TersUcgen {
    public static void main(String[] args) {
        
        Scanner scanner=new Scanner(System.in);
        System.out.print("Basamak Sayisi: ");

        int n=scanner.nextInt();
        System.out.println();

        for (int i =n ; i >0; i-- )
        {
            for (int j=1 ; j <=n-i; j++ )
            {
                System.out.print(" ");
            }
            for (int j=1; j <=  2*i-1; j++ )
            {
                System.out.print("*");
            }
            System.out.println();
        }
        scanner.close();
    }    
}

import java.util.Scanner;

class KullaniciGirisi {
    public static void main(String[] args) {
        String userName, password;
        String user = "deneme";
        String pass = "deneme";
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kullanici Adini Giriniz: ");
        userName = scanner.nextLine();

        System.out.print("Sifrenizi Girniz: ");
        password = scanner.nextLine();

        if(userName.equals(user) && password.equals(pass)){
            System.out.println("Basariyla giris Yaptiniz");
        }else{
            System.out.println("Sifreniz yanlis");
            System.out.print("sifrenizi Sifirlamak Ister misiniz ?(Sifirlamak Istiyorsaniz 1 e basin): ");
            if(scanner.nextLine().equals("1")){
                System.out.print("yeni Sifrenizi Giriniz: ");
                password = scanner.nextLine();
                if(password.equals(pass)){
                    System.out.print("Sifreler ayni olamaz");
                }else{
                    pass = password;
                    System.out.println("Sifre degistirildi");
                }
            }
        }
        scanner.close();
    }
}

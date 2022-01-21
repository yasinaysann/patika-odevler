import java.util.Scanner;

class SinifGecmeDurumu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int matematik, fizik, kimya, turkce, tarih, muzik;


        System.out.println("Matematik notu: ");
        matematik = scanner.nextInt();
        if(matematik < 0 || matematik > 100){
            matematik = 0;
        }

        System.out.println("fizik notu: ");
        fizik = scanner.nextInt();
        if(fizik < 0 || fizik > 100){
            fizik = 0;
        }

        System.out.println("kimya notu: ");
        kimya = scanner.nextInt();
        if(kimya < 0 || kimya > 100){
            fizik = 0;
        }

        System.out.println("turkce notu: ");
        turkce = scanner.nextInt();
        if(turkce < 0 || turkce > 100){
            turkce = 0;
        }

        System.out.println("tarih notu: ");
        tarih = scanner.nextInt();
        if(tarih < 0 || tarih > 100){
            tarih = 0;
        }

        System.out.println("muzik notu: ");
        muzik = scanner.nextInt();
        if(muzik < 0 || muzik > 100){
            muzik = 0;
        }

        int toplam = (matematik + fizik + kimya + turkce + tarih + muzik);
        double sonuc = toplam / 6;

        boolean gectiKaldi = (sonuc >= 55) ? true : false;

        if(gectiKaldi){
            System.out.println("Gecti");
        }else{
            System.out.println("Kaldi");
        }

        scanner.close();
    }  
}

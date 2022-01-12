import java.util.Scanner;

class NotOrtalamasi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int matematik, fizik, kimya, turkce, tarih, muzik;


        System.out.println("Matematik nout: ");
        matematik = scanner.nextInt();

        System.out.println("fizik nout: ");
        fizik = scanner.nextInt();

        System.out.println("kimya nout: ");
        kimya = scanner.nextInt();

        System.out.println("turkce nout: ");
        turkce = scanner.nextInt();

        System.out.println("tarih nout: ");
        tarih = scanner.nextInt();

        System.out.println("muzik nout: ");
        muzik = scanner.nextInt();

        int toplam = (matematik + fizik + kimya + turkce + tarih + muzik);
        double sonuc = toplam / 6;

        boolean gectiKaldi = (sonuc > 60) ? true : false;

        if(gectiKaldi){
            System.out.println("Gecti");
        }else{
            System.out.println("Kaldi");
        }

        scanner.close();
    }  
}

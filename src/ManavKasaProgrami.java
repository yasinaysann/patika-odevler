import java.util.Hashtable;
import java.util.Scanner;
import java.util.Set;

class ManavKasaProgrami {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        double toplamTutar=0.0;
        Hashtable<String, Double> meyveFiyat = new Hashtable<>();
        meyveFiyat.put("Armut", 2.14);
        meyveFiyat.put("Elma", 3.67);
        meyveFiyat.put("Domates", 1.11);
        meyveFiyat.put("Muz", 0.95);
        meyveFiyat.put("Patlican", 5.00);
        meyveFiyat.put("Biber", 10.00);

        //Meyve Fiyatlarini Aliyorum
        Set<String> meyveler = meyveFiyat.keySet();
        //Meyvelerin Kac kilo olacagini diziye atiyorum
        double[] meyveKilosu = new double[meyveler.size()];
        //dizi yerine Liste seklinde de tutabiliriz
        //List<Double> kList = new ArrayList<>();
        
        //Kullanicinin Kac kilo alacagini soruyorum ve diziye atiyorum
        int counter = 0;
        for (String i : meyveler) {
            System.out.print(i + " kac Kilo ? : ");
            meyveKilosu[counter] = scanner.nextDouble();
            //kList.add(scanner.nextDouble());
            counter++;
        }
        // Meyvelerin fiyatini aliyorum ve topluyorum
        int j = 0;
        for (Double fiyat : meyveFiyat.values()) {
            toplamTutar = toplamTutar+(meyveKilosu[j]* fiyat);
            j++;
        }

        System.out.println("Toplam Tutar : " +toplamTutar);
        
        scanner.close();
    }
}

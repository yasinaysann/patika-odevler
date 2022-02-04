package Metotlar;

class UsHesabiRecursive {
    public static void main(String[] args) {
        System.out.println(exponent(5, 3));
    }   
    static int exponent(int base, int upper){
        if(upper < 1) return 1;
        return base * exponent(base, upper-1);
    }

}

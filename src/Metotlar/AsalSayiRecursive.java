package Metotlar;

class AsalSayiRecursive {
    public static void main(String[] args) {
        System.out.println(isPrime(19, 2));
    }   
    
    static boolean isPrime(int number, int divided){
        if(number ==2) return true;
        else if(divided <= number-1){
            if(number%divided ==0){
                return false;
            }else{
                isPrime(number, divided+1);
                return true;
            }
        }
        return false;
    }
}

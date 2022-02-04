package Metotlar;

class PolindromeNumber {
    public static void main(String[] args) {
        PolindromeNumber polindromeNumber = new PolindromeNumber();
        int n = 454;
        boolean is = polindromeNumber.isPalindrome(n);
        
        if(is) System.out.println("palindrome number "); 
        else System.out.println("not palindrome");   
        
    }
    boolean isPalindrome(int n){
        int temp, r, sum = 0;
        
        temp = n;

        while(n>0){
            r = n%10;
            sum = (sum * 10)+ r;
            n = n/ 10;
        }
        if(temp == sum) return true;
        else return false;

    }
}

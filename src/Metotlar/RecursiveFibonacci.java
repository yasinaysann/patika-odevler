package Metotlar;

 class RecursiveFibonacci {
    public static void main(String[] args) {
      
        fibonacci(5);
    }

    static int fibonacci(int n){
        if(n<=1) return n;

        return fibonacci(n-1) + fibonacci(n-2);
    }
}

package Metotlar;

class DeseneGoreMetotOlusturma {
    public static void main(String[] args) {
        azalt(25, 25);
    }
    static void azalt(int n,int kopya){
        System.out.print(n+" ");
        if(n==0 || n<0){
            arttir(n+5,kopya);
        }
        else{
            azalt(n-5,kopya);
        }
    }

    static void arttir(int n,int kopya){
         System.out.print(n+" ");
        if(n==kopya){
            return ;
        }
        else{
           
            arttir(n+5,kopya);
        }
    }
}

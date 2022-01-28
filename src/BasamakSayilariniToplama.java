
class BasamakSayilariniToplama {
    public static void main(String[] args) {
        int numbers = 1643;
        int sum = 0;
        String string = String.valueOf(numbers);
        char[] number = string.toCharArray();

        for (int i = 0; i < number.length; i++) {
            sum += Character.getNumericValue(number[i]);
        }

        System.out.println(sum);
    }    
}

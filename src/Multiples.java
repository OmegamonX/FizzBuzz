public class Multiples {
    public static void main(String[] args) {
        int result = 0;
        for (int i = 1; i < 1001; i++){
            if (i % 3 == 0 || i % 5 == 0){
                result ++;
            }
        }
        System.out.println(result);
    }
}

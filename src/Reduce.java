public class Reduce {
    public static void main(String[] args) {
        int num = 100;
        int result = 0;
        while (num > 0){
            if (num % 2 == 0){
                num = num / 2;
            }else{
                num--;
            }
            result++;
        }
        System.out.println(result);
    }
}

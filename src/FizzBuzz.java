/**
 * Solve the FizzBuzz challenge.
 */
class FizzBuzz {

    public static void main(String[] args) {

        int num = 1;
        while (num < 100) {

            num = doFizzBuzz(num);
        }
    }

    public void callMain(){
        main(null);
    }

    public static int doFizzBuzz(int num) {
        // Find out which numbers divide i.
        boolean divisibleBy3 = num % 3 == 0;
        boolean divisibleBy5 = num % 5 == 0;

        // Print our appropriate result.
        if (divisibleBy3 && divisibleBy5) {

            System.out.println("Fizz Buzz");

        } else if (divisibleBy3) {

            System.out.println("Fizz");

        } else if (divisibleBy5) {

            System.out.println("Buzz");

        } else {

            System.out.println(num);

        }

        num++;
        return num;
    }
}

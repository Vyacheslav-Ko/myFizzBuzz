public class FizzBuzz{

    public static void main(String[] args) {
        System.out.println("1"); //in that case - this is the easiest way to solve
        System.out.println("2");
        for (int i = 3; i <= 1000; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            }
            else if (i % 3 == 0) {
                System.out.println("Fizz");
            }
            else if (i % 5 == 0) {
                System.out.println("Buzz");
            }
            else {
                System.out.println(i);
            }
        }
    }
}

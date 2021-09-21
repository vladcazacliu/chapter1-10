public class Factorials_100 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {

            long factorial = 1;
            for (int j = i; j > 1; j--)
                factorial *= j;

            System.out.printf("%d! = %d%n", i, factorial);
        }
    }
}

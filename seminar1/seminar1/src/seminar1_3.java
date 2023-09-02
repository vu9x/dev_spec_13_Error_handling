public class seminar1_3 {
    public static void main(String[] args) {
        try {
            int numerator = 10;
            int denominator = 0;

            if (denominator == 0) {
                throw new ArithmeticException("Division by zero");
            }

            int result = numerator / denominator;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
            System.out.println(e);
            e.printStackTrace();
        }
    }
}

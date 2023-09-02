public class hw1 {
    public class Answer {
        public static void arrayOutOfBoundsException() {
            // Напишите свое решение ниже
            int[] arr = {1,2,3,4};
            for(int i = 0; i < arr.length+10; i++){
                System.out.println(arr[i]);
            }

        }

        public static void divisionByZero() {
            // Напишите свое решение ниже
            int result = 5 / 0;
            System.out.println(result);

        }

        public static void numberFormatException() {
            // Напишите свое решение ниже
            int result = (int) "aaareaa";
        }
    }

    public class Printer {
        public void main(String[] args) {
            Answer ans = new Answer();
            try {
                ans.arrayOutOfBoundsException();
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Выход за пределы массива");
            }

            try {
                ans.divisionByZero();
            } catch (ArithmeticException e) {
                System.out.println("Деление на ноль");
            }

            try {
                ans.numberFormatException();
            } catch (NumberFormatException e) {
                System.out.println("Ошибка преобразования строки в число");
            }
        }
    }

}

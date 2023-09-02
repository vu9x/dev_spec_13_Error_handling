public class seminar1_2 {
    public static void main(String[] args) {
        int[] num1 = {4,8,16,32,64,128, 256, 512};
        int[] num2 = {2,0,4,4,0,8};

        for(int i = 0; i < num1.length; i++){
            try {
                System.out.println(num1[i] + " / " + num2[i] + " = " + num1[i] / num2[i]);
            } catch (ArithmeticException exeption){
                System.out.println("Попытка деления на ноль");
            } catch (ArrayIndexOutOfBoundsException exeption) {
                System.out.println("Index is out of bound.");
            }
//            catch (Throwable throwable) {
//                System.out.println("Throable.");
//            }
            // родительский Throwable - ветка\дите Exception и Error
//            catch (Exception exeption) {
//                System.out.println("Exception");
//            }
        }

        try {
            for (int i = 0; i < num1.length; i++) {
                try {
                    System.out.println(num1[i] + " / " + num2[i] + " = " + num1[i] / num2[i]);
                } catch (ArithmeticException exception) {
                    System.out.println("Trying to divide by zero.");
                }
            }
        } catch (IndexOutOfBoundsException exception) {
            System.out.println("Index is out if bounds.");
        }
    }
}

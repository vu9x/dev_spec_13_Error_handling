public class seminar1 {
        public static void main(String[] args) {  int nums[] = new int[4];

            try {
                System.out.println("message1");
                nums[8] = 10;
                System.out.println("message2");
            } catch (Exception exception) {
                System.out.println("SuperMessage");
            }
            System.out.println("message5");
        }
}

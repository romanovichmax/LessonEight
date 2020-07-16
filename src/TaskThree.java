public class TaskThree {

    public static void main(String[] args) {
        int a = args.length;
        System.out.println(a);

        try {
            int b = 10 / a;
//        int b = 10 / 1;
            int[] c = {1};
            System.out.println(c[1]);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Out of bound");
        }
    }
}
// First exception is about division by zero
// Second exception is about that we can`t call value that is out bound
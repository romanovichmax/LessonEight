public class TaskFive {
    public static void main(String[] args) {
        try {
            iCanThrowException(null);
        } catch (NullPointerException e) {
            System.err.println("Null pointer exception");
        }
    }

    public static void iCanThrowException(Integer a) {
        int i = a * 10;
    }
}
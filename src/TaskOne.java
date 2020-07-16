public class TaskOne {
    public static void main(String[] args) {
        try {
            System.out.println(zeroCheck(0));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String zeroCheck(int a) throws Exception {
        if (a > 0)
            return "Number > 0";
        else if (a < 0)
            return "Number < 0";
        else
            throw new Exception("Value is equal to 0");
    }
}

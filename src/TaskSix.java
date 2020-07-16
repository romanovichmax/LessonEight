import java.util.InputMismatchException;
import java.util.Scanner;

public class TaskSix {
    static String result = "";

    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        try {
            Scanner in = new Scanner(System.in);
            System.out.println("Input number: ");
            result = result + in.nextInt() + ", ";
        } catch (InputMismatchException e) {
            System.out.println("You entered the incorrect value");
            System.out.println("Previous numbers: " + result);
        } finally {
            readData();
        }
    }
}

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Controller controller = new Controller();
        controller.run(new Scanner(System.in));
    }
}

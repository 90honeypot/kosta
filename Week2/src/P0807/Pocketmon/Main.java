package P0807.Pocketmon;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Game g = new Game();
        g.select(new Scanner(System.in));
        g.run(new Scanner(System.in));
    }
}

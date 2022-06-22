import java.util.Scanner;

public class Scan {
    public static void main(String[] args) {

        Scanner scanner = new Scanner("It matters not how strait the gate,\n" +
                "How charged with punishments the scroll,\n" +
                "I am the master of my fate,\n" +
                "I am the captain of my soul");
        String s = scanner.nextLine();
        System.out.println(s);
        scanner.close();
    }
}
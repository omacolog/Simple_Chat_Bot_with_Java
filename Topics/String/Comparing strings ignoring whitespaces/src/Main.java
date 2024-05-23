import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String text1 = scanner.nextLine().trim().replace(" ", "");
        String text2 = scanner.nextLine().trim().replace(" ", "");

        System.out.println(text1.equals(text2));
    }
}
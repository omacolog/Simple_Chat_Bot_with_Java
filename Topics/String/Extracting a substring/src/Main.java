import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String text = scanner.nextLine();
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        System.out.println(text.substring(number1, number2+1));

    }
}
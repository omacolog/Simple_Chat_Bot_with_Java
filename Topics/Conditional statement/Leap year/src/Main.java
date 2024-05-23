import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int year = scanner.nextInt();

        boolean divide4 = year % 4 == 0;
        boolean divide100 = year % 100 != 0;
        boolean divide400 = year % 400 == 0;

        boolean leap = (divide4 && divide100) || divide400;

        System.out.println(leap ? "Leap": "Regular");
    }
}
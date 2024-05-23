import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        int result = 1;
        for(; number1<number2; number1++){
            result *= number1;
        }
        System.out.println(result);
    }
}
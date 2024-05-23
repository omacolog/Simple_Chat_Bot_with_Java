import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int divider = scanner.nextInt();

        int result = 0;

        for(; number1<=number2; number1 ++){
            if(number1%divider == 0) result++;
        }

        System.out.println(result);
    }
}
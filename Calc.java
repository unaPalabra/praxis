import java.util.Scanner;

public class Calc {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("_К А Л Ь К У Л Я Т О Р_");

        int num_1 = getNum();

        while (true) {
            char operation = getOperation();

            if (operation == 'c') {
                num_1 = getNum();
                continue;
            } else if (operation == 's') {
                break;
            }

            int num_2 = getNum();
            int result = calc(num_1, num_2, operation);

            System.out.printf("Результат: %d %s %d = %d\n", num_1, operation, num_2, result);

            num_1 = result;
        }
    }

    public static int getNum() {
        System.out.println("Введите число:");
        int num = 0;
        num = scan.nextInt();
        return num;
    }

    public static char getOperation() {
        System.out.println("Выберите операцию: ( + - * / ), c - очистка, s - выход");
        char operation;
        operation = scan.next().charAt(0);
        return operation;
    }

    public static int calc(int num_1, int num_2, char operation) {
        int result = 0;

        switch (operation) {
            case '+':
                result = num_1 + num_2;
                break;
            case '-':
                result = num_1 - num_2;
                break;
            case '*':
                result = num_1 * num_2;
                break;
            case '/':
                result = num_1 / num_2;
                break;
            default:
        }
        return result;
    }
}
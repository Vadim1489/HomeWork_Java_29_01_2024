import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Программа возводит число в квадрат: ");
        System.out.println("Пользователь введите число: ");
        int number = scanner.nextInt();
        int resultOffSquare = square(number);
        System.out.println("Квадрат числа: " + resultOffSquare);

        System.out.println("Программа делит число: ");
        System.out.println("Пользователь введите первое число: ");
        double number1 = scanner.nextDouble();
        System.out.println("Пользователь введите второе число: ");
        double number2 = scanner.nextDouble();
        double resultOffDivision = division(number1,number2);
        System.out.println("Результат деления: " + resultOffDivision);

        System.out.println("Программа  суммирует два числа: ");
        System.out.println("Пользователь введите первое число: ");
        int number3 = scanner.nextInt();
        System.out.println("Пользователь введите второе число: ");
        int number4 = scanner.nextInt();
        int resultOffAddition = addition(number3,number4);
        System.out.println("Результат суммы: " + resultOffAddition);

        System.out.println("Программа вычитает число: ");
        System.out.println("Пользователь введите первое число: ");
        int number5 = scanner.nextInt();
        System.out.println("Пользователь введите второе число: ");
        int number6 = scanner.nextInt();
        int resultOffSubtraction = subtraction(number5, number6);
        System.out.println("Результат вычетания: " + resultOffSubtraction);

        System.out.println("Программа умножает числа: ");
        System.out.println("Пользователь введите первое число: ");
        int number7 = scanner.nextInt();
        System.out.println("Пользователь введите второе число: ");
        int number8 = scanner.nextInt();
        int resultOffMultiplication = multiplication(number7,number8);
        System.out.println("Результат умножения: " + resultOffMultiplication);

        System.out.println("Программа делит число по модулю: ");
        System.out.println("Пользователь введите первое число: ");
        int number9 = scanner.nextInt();
        System.out.println("Пользователь введите второе число: ");
        int number10 = scanner.nextInt();
        int resultOffModuleDivision = moduleDivision(number9 , number10);
        System.out.println("Результат деления на модуль: " + resultOffModuleDivision);
    }
    public static int moduleDivision(int number9 , int number10) {
        int moduleDivision = number9 % number10;
        int moduleDivisionResult = moduleDivision;
        return moduleDivisionResult;
    }
    public static int multiplication(int number7, int number8) {
        int multiplication = number7 * number8;
        int multiplicationResult = multiplication;
        return multiplicationResult;
    }

    public static int subtraction(int number5 , int number6) {
        int subtraction = number5 - number6;
        int subtractionResult = subtraction;
        return subtractionResult;
    }
    public static int addition(int number3 , int number4) {
        int addition = number3 + number4;
        int additionResult = addition;
        return additionResult;
    }

    public static double division(double number1 , double number2 ) {
        double division = number1 / number2;
        double divisionResult = division;
        return divisionResult;
    }

    public static int square(int number) {
        int sguareResult = number * number;
        return sguareResult;
    }

}

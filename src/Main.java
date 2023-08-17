import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        try {
            System.out.println("10/0 = " + 10 / 0);
        } catch (ArithmeticException ae) {
            System.out.println("Произошла ошибка. Делить на ноль нельзя.");
        }

        try {
            System.out.println("10/10 = " + 10 / 10);
        } catch (ArithmeticException ae2) {
            System.out.println("Произошла ошибка. Делить на ноль нельзя.");
        }

        User user = new User();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Ведите ваше имя:");
            String name = scanner.next();
            try {
                user.setName(name);
                System.out.println("УСПЕШНО. Ваше имя: " + user.getName());
            } catch (IllegalNameException e) {
                System.out.println(e.getMessage());
            }
            System.out.println("Введите ваш возраст:");
            Integer age = scanner.nextInt();
            try {
                user.setAge(age);
                System.out.println("УСПЕШНО. Ваш возраст: " + user.getAge());
            } catch (IllegalAgeException ie) {
                System.out.println(ie.getMessage());
            }
        }
    }
}
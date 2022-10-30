import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку: ");
        String str = scanner.nextLine();
        if (str.isEmpty() | str.isBlank()) throw new RuntimeException("Пустые строки вводить нельзя!");
        scanner.close();
    }
}
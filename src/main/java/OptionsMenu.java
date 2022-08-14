import java.util.Scanner;

public class OptionsMenu {

    static Scanner scanner = new Scanner(System.in);
    static int command;

    public static void showOptionsMenu() {

        do {

            System.out.println("\nСделай свой выбор и нажми enter\n" +
                    "1: Показать текущие настройки\n" +
                    "2: Изменить настройки\n" +
                    "3: Назад в главное меню");

            command = scanner.nextInt();

            switch (command) {

                case 1 -> {
                    System.out.println("\nТекущие настройки: " +
                            "\nряды: " + Main.rows +
                            "\nколонки: " + Main.columns +
                            "\nвраги: " + Main.amountOfEnemies +
                            "\nтранзисторы: " + Main.transistorsNeeded +
                            "\nходы: " + Main.moves
                    );
                }

                case 2 -> {
                    System.out.println("Введите новое значение для рядов: ");
                    Main.rows = scanner.nextInt();
                    System.out.println("Введите новое значение для колонок: ");
                    Main.columns = scanner.nextInt();
                    System.out.println("Введите новое значение для врагов: ");
                    Main.amountOfEnemies = scanner.nextInt();
                    System.out.println("Введите новое значение для транзисторов: ");
                    Main.transistorsNeeded = scanner.nextInt();
                    System.out.println("Введите новое значение для ходов: ");
                    Main.moves = scanner.nextInt();
                }

                default -> System.out.println("Неправильная команда, введи корректное число");

            }
        }

        while (command != 3);
    }
}

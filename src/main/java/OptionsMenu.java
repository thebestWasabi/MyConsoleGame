import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OptionsMenu {

    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    static int command;

    public static void showOptionsMenu() throws IOException {

        do {

            System.out.println("\nСделай свой выбор и нажми enter\n" +
                    "1: Показать текущие настройки\n" +
                    "2: Изменить настройки\n" +
                    "3: Назад в главное меню");

            command = Integer.parseInt(reader.readLine());

            switch (command) {

                case 1 -> {
                    System.out.println("\nТекущие настройки: " +
                            "\nряды: " + Main.rows +
                            "\nколонки: " + Main.columns +
                            "\nвраги: " + Main.amountOfEnemies +
                            "\nтранзисторы: " + Main.transistorsNeeded +
                            "\nходы: " + Main.moves +
                            "\nflowers: " + Main.getAmountOfFlowers
                    );
                }

                case 2 -> {
                    System.out.println("Введите новое значение для рядов: ");
                    Main.rows = Integer.parseInt(reader.readLine());
                    System.out.println("Введите новое значение для колонок: ");
                    Main.columns = Integer.parseInt(reader.readLine());
                    System.out.println("Введите новое значение для врагов: ");
                    Main.amountOfEnemies = Integer.parseInt(reader.readLine());
                    System.out.println("Введите новое значение для транзисторов: ");
                    Main.transistorsNeeded = Integer.parseInt(reader.readLine());
                    System.out.println("Введите новое значение для ходов: ");
                    Main.moves = Integer.parseInt(reader.readLine());
                    System.out.println("Введите новое значение для цветков: ");
                    Main.getAmountOfFlowers = Integer.parseInt(reader.readLine());
                }

                default -> System.out.println("Неправильная команда, введи корректное число");

            }
        }
        while (command != 3);
    }
}

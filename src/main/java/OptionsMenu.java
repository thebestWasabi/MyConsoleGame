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
                            "\nряды: " + MainMenu.rows +
                            "\nколонки: " + MainMenu.columns +
                            "\nвраги: " + MainMenu.amountOfEnemies +
                            "\nтранзисторы: " + MainMenu.transistorsNeeded +
                            "\nходы: " + MainMenu.moves +
                            "\nflowers: " + MainMenu.getAmountOfFlowers
                    );
                }

                case 2 -> {
                    System.out.println("Введите новое значение для рядов: ");
                    MainMenu.rows = Integer.parseInt(reader.readLine());
                    System.out.println("Введите новое значение для колонок: ");
                    MainMenu.columns = Integer.parseInt(reader.readLine());
                    System.out.println("Введите новое значение для врагов: ");
                    MainMenu.amountOfEnemies = Integer.parseInt(reader.readLine());
                    System.out.println("Введите новое значение для транзисторов: ");
                    MainMenu.transistorsNeeded = Integer.parseInt(reader.readLine());
                    System.out.println("Введите новое значение для ходов: ");
                    MainMenu.moves = Integer.parseInt(reader.readLine());
                    System.out.println("Введите новое значение для цветков: ");
                    MainMenu.getAmountOfFlowers = Integer.parseInt(reader.readLine());
                }
                default -> System.out.println("Неправильная команда, введи корректное число");
            }
        }
        while (command != 3);
    }
}

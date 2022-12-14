import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainMenu {

    public static int rows = 3;
    public static int columns = 4;
    public static int amountOfEnemies = 10;
    public static int transistorsNeeded = 100;
    public static int moves = 40;
    public static int getAmountOfFlowers = 10;

    public static void main(String[] args) {
        try {
            starter();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void starter() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String command;

        do {
            System.out.println("Добро пожаловать в мою игру (version 1.0a)\n\nСделайте свой выбор и нажмите enter:");
            System.out.println("1: Начать новую игру");
            System.out.println("2: Настройки");
            System.out.println("3: Об авторе");
            System.out.println("4: Выход");

            command = reader.readLine();

            switch (command) {
                case "1" -> startNewGame();
                case "2" -> OptionsMenu.showOptionsMenu();
                case "3" -> showCredits();
                case "4" -> System.out.println("Exit");
                default -> System.out.println("Неправильная команда, пожалуйста попробуйте еще раз");
            }

        } while (!command.equals("4"));
    }

    private static void startNewGame() {
        Game game = new Game(rows, columns, amountOfEnemies, transistorsNeeded, moves, getAmountOfFlowers);
        game.fillFieldWithEmptyObjects();
        game.startGame();
    }

    private static void openOptionsMenu() {

    }

    private static void showCredits() {
        System.out.println("\nCreated by Maxim Khamzin\n" +
                "version 1.0a, last modified on 10.08.2022\n" +
                "contact me at openpw@yandex.com\n");
    }
}

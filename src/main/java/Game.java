import java.util.ArrayList;

public class Game {

    private int rows;
    private int columns;
    private int amountOfEnemies;
    private int transistorsNeeded;
    private int turnsLeft;
    private int transistorsGathered;
    private Field field;
    private boolean isGameFinished = false;
    private int amountOfFlowers;
    private ArrayList<Flowers> flowersArrayList = new ArrayList<>();

    public Game(int rows, int columns, int amountOfEnemies, int transistorsNeeded, int turnsLeft, int amountOfFlowers) {
        this.rows = rows;
        this.columns = columns;
        this.amountOfEnemies = amountOfEnemies;
        this.amountOfFlowers = amountOfFlowers;
        this.transistorsNeeded = transistorsNeeded;
        this.turnsLeft = turnsLeft;
        field = new Field(rows, columns);
    }

    public void fillFieldWithEmptyObjects() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                field.setFieldable(i, j, new Empty());
            }
        }
    }

    public void startGame() {
        possessPlayer();
        possessEnemies();
        possessFlowers();

        while (!isGameFinished) {
            showField();
            playerTurn();
            computerTurn();
            checkIsGameNotFinished();
        }
    }

    private void possessPlayer() {

    }

    private void possessEnemies() {

    }

    private void possessFlowers() {

    }

    private void showField() {
        System.out.println("\n\nTurns left: " + turnsLeft
                + ", transistors gathered: " + transistorsGathered
                + "/" + transistorsNeeded);
        field.showField();
    }

    private void playerTurn() {

    }

    private void computerTurn() {

    }

    private void checkIsGameNotFinished() {
        if (turnsLeft == 0) {
            System.out.println("No more turns left, you lose!");
            isGameFinished = true;

        } else if (transistorsGathered >= 100) {
            System.out.println("You have gathered the required " + "number of transistors, you won!");
            isGameFinished = true;
        }
    }
}

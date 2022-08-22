public class Game {

    private int sizeX;
    private int sizeY;
    private int amountOfEnemies;
    private int transistorsNeeded;
    private int movesLeft;
    private int flowersGathered;
    private Field field;
    private boolean isGameFinished = false;
    private int amountOfFlowers;

    public Game(int sizeX, int sizeY, int amountOfEnemies, int transistorsNeeded, int movesLeft, int amountOfFlowers) {
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        this.amountOfEnemies = amountOfEnemies;
        this.amountOfFlowers = amountOfFlowers;
        this.transistorsNeeded = transistorsNeeded;
        this.movesLeft = movesLeft;
        field = new Field(sizeX, sizeY);
    }

    public void fillFieldWithEmptyObjects() {

        for (int i = 0; i < sizeX; i++) {
            for (int j = 0; j < sizeY; j++) {
                field.setFieldable(i, j, new Empty());
            }
        }
    }

    public void startGame() {

        possesPlayer();
        possesEnemies();
        possesFlowers();

        while (!isGameFinished) {

            showField();
            playerTurn();
            computerTurn();
            checkIsGameNotFinished();
        }
    }

    private void possesPlayer() {

    }

    private void possesEnemies() {

    }

    private void possesFlowers() {

    }

    private void showField() {

    }

    private void playerTurn() {

    }

    private void computerTurn() {

    }

    private void checkIsGameNotFinished() {

    }
}

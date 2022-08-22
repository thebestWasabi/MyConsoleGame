public class Flowers implements Fieldable {

    private int transistors;

    public Flowers(int transistors) {
        this.transistors = transistors;
    }

    public int getTransistors() {
        return transistors;
    }

    @Override
    public String getSymbol() {
        return String.valueOf(transistors);
    }
}

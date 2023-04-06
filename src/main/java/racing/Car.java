package racing;

public class Car {
    private int position = 1;

    public void goForward() {
        position++;
    }

    public int getPosition() {
        return position;
    }

    public String getPositionalString() {
        return "-".repeat(position);
    }
}

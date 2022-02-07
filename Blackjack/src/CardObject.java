public class CardObject {
    private String name;
    private int value;

    public CardObject(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return  name + " " + value;
    }
}

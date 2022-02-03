public class CardObject {
    private String name;
    private int value;

    public CardObject(String name, int value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public String toString() {
        return "CardObject{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }
}

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<UserData> list = new ArrayList<UserData>();
        ReadFromFile rFF = new ReadFromFile();
        Menu menu = new Menu();
        rFF.readFromFile(list);
        menu.initmenu(list);
    }
}

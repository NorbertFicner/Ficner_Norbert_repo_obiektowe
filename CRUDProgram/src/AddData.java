import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class AddData {
    Scanner sc;
    private String email, name, surname, dateOfBirth;

    public void addData(ArrayList<UserData> list) {
        sc = new Scanner(System.in);
        System.out.println("Podaj email:");
        email = sc.nextLine();
        System.out.println("Podaj date urodzenia:");
        dateOfBirth = sc.nextLine();
        System.out.println("Podaj imie:");
        name = sc.nextLine();
        System.out.println("Podaj nazwisko:");
        surname = sc.nextLine();

        list.add(new UserData(email, dateOfBirth, name, surname));
        System.out.println("Wpis został dodany");
        System.out.print("\n");
    }
}
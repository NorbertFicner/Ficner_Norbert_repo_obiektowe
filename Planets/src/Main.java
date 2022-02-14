import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PlantesImp hasLive;
        Scanner sc = new Scanner(System.in);
        System.out.println("Wybierz planete, żeby sprawdzic czy jest na niej życie\n" +
                "1 - Ziemia\n" +
                "2 - Merkury\n" +
                "3 - Saturn\n");
        String choose = sc.nextLine();
        switch (choose){
            case "1":
                hasLive = new Earth();
                System.out.println("Na ziemi jest życie : "+ hasLive.hasLive());
                break;
            case "2":
                hasLive = new Mercury();
                System.out.println("Na merkurym jest życie : "+hasLive.hasLive());
                break;
            case "3":
                hasLive = new Saturn();
                System.out.println("Na saturnie jest życie : "+hasLive.hasLive());
                break;
            default:
                System.out.println("Nie ma takiej opcji");
                break;
        }
    }
}

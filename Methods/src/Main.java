import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        BigDecimal a;
        BigDecimal b;
        BigDecimal c;
        BigDecimal h;
        BigDecimal r;
        BigDecimal p;

        AreaOfTheTriangle aott = new AreaOfTheTriangle();
        BigDecimal result = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Wybierz opcje, którą obliczysz trójkąt");
        System.out.println("1 - 1/2 a * h \n" +
                "2 - abc/4r \n" +
                "3 - rp \n" +
                "4 - 2R * sina * sinb * siny\n" +
                "5 - sqrt(p(p-a)(p-b)(p-c))\n");
        String choose = sc.nextLine();
        switch (choose){
            case "1":
                System.out.println("Podaj a: ");
                a = new BigDecimal(sc.nextLine());
                System.out.println("Podaj h: ");
                h = new BigDecimal(sc.nextLine());

                result = aott.calculateAreaOfTriangle(a,h ,choose);
                break;
            case "2":
                System.out.println("Podaj a: ");
                a = new BigDecimal(sc.nextLine());
                System.out.println("Podaj b: ");
                b = new BigDecimal(sc.nextLine());
                System.out.println("Podaj c: ");
                c = new BigDecimal(sc.nextLine());
                System.out.println("Podaj r: ");
                r = new BigDecimal(sc.nextLine());

                result = aott.calculateAreaOfTriangle(a,b,c,r);
                break;

            case "3":
                System.out.println("Podaj r: ");
                r = new BigDecimal(sc.nextLine());
                System.out.println("Podaj p: ");
                p = new BigDecimal(sc.nextLine());

                result = aott.calculateAreaOfTriangle(r,p,choose);
                break;

            case "4":

                break;

            case "5":
                System.out.println("Podaj a: ");
                a = new BigDecimal(sc.nextLine());
                System.out.println("Podaj b: ");
                b = new BigDecimal(sc.nextLine());
                System.out.println("Podaj c: ");
                c = new BigDecimal(sc.nextLine());

                result = aott.calculateAreaOfTriangle(a,b,c);

                break;


            default:
                System.out.println("Nie ma takiej opcji");
                break;
        }
        System.out.println("Wynik wynosi "+result);


    }
}

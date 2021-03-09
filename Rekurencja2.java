class Rekurencja2 {
    public static void  main(String[]args){
        //int liczba = sumaKolejnychLiczb(3);
        //System.out.println("Wynik: " + liczba);
       // long silnia = obliczanieSilni(25);
        //System.out.println("Silnia: \n" + silnia);
       // System.out.println("Maksymlane wartości zmiennych");
      //  System.out.println("Long : ");
      //  System.out.println("" + Long.MAX_VALUE);
      //  System.out.println("Integer : ");
      //  System.out.println("" + Integer.MAX_VALUE);
        String wyraz = wyswitalneiWyrazu("Anna");
        System.out.println(wyraz);

    }

    private static int sumaKolejnychLiczb(int liczba){
        if(liczba >0) {
            System.out.println(liczba);
            return liczba + sumaKolejnychLiczb(liczba - 1);
            // Wprowadzamy liczbe 3
            // return 3 + (return 2 + (return + 1 =0)))
        }
        System.out.println("Koniec rekurencji liczba = " + liczba);
        return 0;
    }

    private static long obliczanieSilni(int liczba) {
        // Slinia 7! = 7*6*5*4*3*2*1
        if (liczba > 1){
            return liczba * obliczanieSilni(liczba-1);
        }

        return  1;
    }

    private static String wyswitalneiWyrazu (String wyraz){
    if(wyraz.length() > 0 ){
        //System.out.println(wyraz.substring(0,wyraz.length()-1));
        return wyraz + "\n" + wyswitalneiWyrazu(wyraz.substring(0,wyraz.length()-1));
    }
    return "";


    }
}



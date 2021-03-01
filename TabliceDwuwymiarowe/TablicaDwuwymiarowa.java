public class TablicaDwuwymiarowa {
    public static void main(String[]args){
        int[] tab = new int[5];
        tab[0] = 40;
        //tab[1] = "Jeden";
        // wyskoczy error W int nie moze byc string
        for(int i=0;i<tab.length;i++){
            System.out.println(tab[i]);

            tab2dFirst();
        }
    }

    private static void tab2dFirst(){
        System.out.println("===Deklaracja i dlugosc tablicy===");
        int[][] tab2d =  new int[5][2];
        tab2d[0][0] = 20;
        tab2d[0][1] = 50;
        tab2d[2][1] = -200;
        tab2d[4][0] = 444;
        System.out.println(tab2d.length); // dlugosc tablicy dwuwymiarowej?? Nie
        System.out.println(tab2d.length*tab2d[0].length); // ile elementow ma tablica w ogóle
        System.out.println("==Wyswietlanie tablicy dwuwymiarowej===");
        for (int i =0; i<tab2d.length; i++){
            for(int j =0; j<tab2d[i].length;j++){
                System.out.println(tab2d[i][j]);
            }
            System.out.println("Koniec petli w petli ze zmienna j");
        }
        System.out.println("Koniec petli w petli ze zmienna i");
    }

}
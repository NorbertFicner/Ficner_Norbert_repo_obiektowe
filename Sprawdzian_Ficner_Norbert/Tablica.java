
import java.util.Random;

class Tablica {
    public int tab1[];
    public int tab2[];

    public Tablica(int dlugosctalblicy){
        tab1 = new int[dlugosctalblicy];
        tab2 = new int[dlugosctalblicy];

        WypelnijTablice();
    }

    private void WypelnijTablice(){
        Random r = new Random();
        for (int i = 0; i<tab1.length;i++){
            tab1[i] = r.nextInt(21) -10  ;

        }
        for (int i = 0; i<tab2.length;i++){
            tab2[i] = r.nextInt(21) -10 ;

        }
    }

    public int[] pobierzTablice1(){
        return tab1;
    }
    public int[] pobierzTablice2(){
        return tab2;
    }

}

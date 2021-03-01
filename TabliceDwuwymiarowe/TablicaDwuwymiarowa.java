public class TablicaDwuwymiarowa {
    public static void main(String[]args){
        int[] tab = new int[5];
        tab[0] = 40;
        //tab[1] = "Jeden";
        // wyskoczy error W int nie moze byc string
        for(int i=0;i<tab.length;i++){
            System.out.println(tab[i]);
        }
        int[][] tab2d =  new int[5][2];
    }
}

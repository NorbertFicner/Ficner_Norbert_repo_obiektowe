public class Zadanie02032021 {
    public static void main(String[]args){
        Tablicadwuwymiarowa();

    }
    private static void Tablicadwuwymiarowa(){
        int[][] tab2 = new int[2][2];
        tab2[0][0] = 1;
        tab2[0][1] = 2;
        tab2[1][0] = 3;
        tab2[1][1] = 4;
        
		

        for(int i=0;i<tab2.length;i++){
            for(int j=0;j<tab2.length;j++){
                System.out.println(tab2[i][j]);
            }
        }
    }
}

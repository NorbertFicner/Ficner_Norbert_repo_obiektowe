class NazwiskoImie {
    public static void main(String[]args){
       Sprawdzian spr = new Sprawdzian();
        spr.nazwaprzedmiotu = "PROGRAMOWANIE OBIEKTOWE";
        spr.data = "2021-04-07";
        spr.ocena = 5;
        System.out.println(spr.data + " " + spr.ocena + " " + spr.nazwaprzedmiotu);

        Dane dane = new Dane("Norbert","Ficner","03-11-2004");
        System.out.println(dane.toString());

        Tablica tablica = new Tablica(10);
        int tab1[] = tablica.pobierzTablice1();
        int tab2[] = tablica.pobierzTablice2();
        /*
        for (int i = 0;i< tab1.length;i++){
            System.out.println(tab1[i]);
        }
        for (int i = 0;i< tab1.length;i++){
            System.out.println(tab2[i]);
        }

         */
        String znak = "";
        for (int i =0; i<tab1.length;i++){
            if(tab1[i] == tab2[i]){
                znak = " = ";
            }
            else if(tab1[i] < tab2[i]){
                znak = " < ";
            }
            else if(tab1[i] == tab2[i]){
                znak = " > ";
            }
            System.out.println(tab1[i] + znak +  tab2[i]);

        }
    }



}

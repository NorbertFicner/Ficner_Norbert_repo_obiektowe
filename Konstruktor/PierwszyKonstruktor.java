
class PierwszyKonstruktor {
    public static void main(String[]args){
        /*
        MojeBmi mb = new MojeBmi();
        mb.wzrost = 160;
        mb.waga = 80;
        */
        //Zmiana atrybutów obiektu poprzez konstruktor
        MojeBmi mb = new MojeBmi(190 , 86);
        System.out.println("Pola w obiekcie " + mb.wzrost+ " " + mb.waga);
        double wynik = mb.mojeBmi();
        System.out.println("BMI = " +wynik );

       ImieNazwisko imna = new ImieNazwisko("Norbert","Ficner");
        //System.out.println("Pola w obiekcie  " + imna.imie+ " " + imna.nazwisko);


    }
}

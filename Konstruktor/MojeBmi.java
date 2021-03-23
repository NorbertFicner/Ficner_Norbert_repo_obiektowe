
class MojeBmi {

    public int wzrost = 0;
    public int waga = 0;

    //KONKSTRUKTOR
    public MojeBmi(int wzrost, int waga){
       // System.out.println("W konstruktorze " + wzrost+ " " + waga);
        this.wzrost = wzrost; //this -o odwołuje sie do atrybutów obiektu
        this.waga = waga;


    }
    //Metoda zwracajaca BMI jako liczbe zmiennoprzecinkowa
    public double mojeBmi(){
        return waga/((double)wzrost/100*(double)wzrost/100);

    }
}

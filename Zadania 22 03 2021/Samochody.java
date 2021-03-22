
class Samochody {
    public String marka = "";
    public String model = "";
    public String rodzaj_silnika = "";
    public int pojemnosc = 0;
    public int moc = 0;
    public int mo_obrotowy = 0;

    @Override
    public String toString(){
        return  System.out.println("Samochód \n"
                + "Marka :  " + marka + "\n"
                + "Model :  " + model + "\n"
                + "Rodzaj silnika :  " + rodzaj_silnika + "\n"
                + "Moc :  " + moc + "\n"
                + "Moment obrotowy :  " + mo_obrotowy + "\n"
                + "Pojemnosc :  " + pojemnosc + "\n");

    }
}

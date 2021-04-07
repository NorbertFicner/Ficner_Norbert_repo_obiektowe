class Dane {
    private String imie = "";
    private String nazwisko = "";
    private String dataurodzenia = "";

    public Dane(String imie,String nazwisko,String dataurodzenia){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.dataurodzenia = dataurodzenia;
    }

    @Override
    public String toString(){
        return imie + " " + nazwisko + " urodzony " + dataurodzenia;
    }
}

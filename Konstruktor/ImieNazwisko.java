class ImieNazwisko {
    private String imie = "";
    private String nazwisko = "";

    public ImieNazwisko(String imie, String nazwisko){
        this.imie = imie;
        this.nazwisko = nazwisko;
        //System.out.println("Imie : " + imie + "\n" + "Nazwisko: " + nazwisko);
    }

    //Metoda wyswietlajaca powitanie
    //Witaj Adam Stelmaszyk - imie i nazwisko wprowadzone w konstruktorze
    public void Powitanie(){
        System.out.println("Witaj" + imie + " " + nazwisko);
    }

}

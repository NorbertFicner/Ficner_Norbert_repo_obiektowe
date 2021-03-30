 class Kolo {
    private double liczba_pi = 3.1415;
    private double promien = 0;

    public Kolo(double promien){
        this.promien = promien;

    }

    public double PoleKola(){
        return liczba_pi * (promien * promien);
    }
    public double ObwodKola(){
        return 2 * liczba_pi * promien;
    }

}

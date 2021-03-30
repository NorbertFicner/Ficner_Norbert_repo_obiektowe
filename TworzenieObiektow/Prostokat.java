class Prostokat {
    private double a = 0;
    private double b = 0;

    public Prostokat(double a, double b){
        this.a = a;
        this.b = b;
    }

    public double Polepro(){
        return a * b;
    }
    public double Obwpro(){
        return 2 * a + 2 * b;
    }
}

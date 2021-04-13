import static java.lang.Math.*;

class Triangle {
    //Pole trojkata wysokosc i podstawa
    public Triangle(int wysokosc, int podstawa){
        System.out.println(wysokosc * podstawa/2);
    }
    //Pole trojkata boki a , b , c i promien okregow
    public Triangle(int a, int b,  int c, int r){
        System.out.println(a * b * c / 4 * r);
    }
    //Pole trojkata Obwod trojakta i promien okregow
    public Triangle(double r, double p){
        System.out.println(r * p);
    }
    //Pole trojkata Obwod i dlugosci bokow
    public Triangle(double p ,int a ,int b, int c){
        System.out.println(sqrt(p * (p-a) * (p-b) * (p-c)));
    }
    //Trojakt rownoboczny pole dlugosc boku
    public Triangle(double a){
        System.out.println(pow(a,2) * sqrt(3) / 4);
    }



}

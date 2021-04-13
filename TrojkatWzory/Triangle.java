import static java.lang.Math.*;

class Triangle {

    public Triangle(int wysokosc, int podstawa){
        System.out.println(wysokosc * podstawa/2);
    }
    public Triangle(int a, int b,  int c, int r){
        System.out.println(a * b * c / 4 * r);
    }
    public Triangle(double r, double p){
        System.out.println(r * p);
    }
    public Triangle(double p ,int a ,int b, int c){
        System.out.println(sqrt(p * (p-a) * (p-b) * (p-c)));
    }



}

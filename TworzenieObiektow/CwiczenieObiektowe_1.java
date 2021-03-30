
class CwiczenieObiektowe_1 {
    public static void main(String[]args){
        System.out.println("Zad1");
        MojeDane md = new MojeDane("Norbert","Ficner","2PTN");
        System.out.println("Zad2");
        Logowanie log = new Logowanie("akronim", "532adw");
        System.out.println(log.toString());
        System.out.println("Zad3");

        Kolo ko1 = new Kolo(4);
        double wynikpol1 = ko1.PoleKola();
        double wynikobw1 = ko1.ObwodKola();
        System.out.println("Pole 1: " + wynikpol1 + " Obwod 1: " + wynikobw1);

        Kolo ko2 = new Kolo(20);
        double wynikpol2 = ko2.PoleKola();
        double wynikobw2 = ko2.ObwodKola();
        System.out.println("Pole 2: " + wynikpol2 + " Obwod 2: " + wynikobw2);
        System.out.println("Zad4");

        Kwadrat kw = new Kwadrat(10);
        double wynikpolkw = kw.PoleKw();
        double wynikobwkw = kw.Obwkw();
        System.out.println("Pole kwadratu: " + wynikpolkw +" Obwód kwadratu: " + wynikobwkw);

        Prostokat pro = new Prostokat(10, 15);
        double wynikpolpro = pro.Polepro();
        double wynikobwpro = pro.Obwpro();
        System.out.println("Pole kwadratu: " + wynikpolpro +" Obwód kwadratu: " + wynikobwpro);

    }

}

class PolaPrywatnePubliczne {
    // Definiowanie zmiennych obiektow globalnie
    static DaneOsobowe dos;
    public static void main(String[]args){
        // Stworzenie Obiektu
        dos = new DaneOsobowe(); // od tego momentu moge uzywa nazwy :  dos
        System.out.println(dos.wzrost);
    }
}

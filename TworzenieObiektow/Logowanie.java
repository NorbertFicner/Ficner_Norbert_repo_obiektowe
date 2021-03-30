class Logowanie {
    private String login ="";
    private String haslo ="";

    public Logowanie(String login, String haslo){
        this.login = login;
        this.haslo = haslo;
    }
    @Override
    public String toString(){
        return "Login: " + login +" "+ "Haslo: " + haslo;
    }
}

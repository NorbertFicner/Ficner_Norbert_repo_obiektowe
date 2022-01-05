public class UserData {
    private String email,dateOfBirth,name,surname;

    public UserData(String email, String dateOfBirth, String name, String surname) {
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return email+";"+dateOfBirth+";"+name+";"+surname;
    }
}

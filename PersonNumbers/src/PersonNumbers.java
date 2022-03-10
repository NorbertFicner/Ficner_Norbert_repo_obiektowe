import java.math.BigDecimal;

public class PersonNumbers {
    private BigDecimal age;
    private BigDecimal height;
    private BigDecimal weight;


    public void setNumber(BigDecimal number,String choose) {
        if (choose.equals("1")) height = number;
        else if (choose.equals("2")) weight = number;
        else age = number;

    }

    public String getAge() {
        if(age != null) return age.toString();
        else return  "Nie podano";
    }

    public String getHeight() {
        if(height != null) return height.toString();
        else return  "Nie podano";
    }

    public String getWeight() {
        if(weight != null) return weight.toString();
        else return  "Nie podano";
    }
}

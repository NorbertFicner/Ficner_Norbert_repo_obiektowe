import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class AreaOfTheTriangle {
    public BigDecimal calculateAreaOfTriangle(BigDecimal a, BigDecimal b,String choose) {
        if(choose.equals("1")) return a.divide(BigDecimal.valueOf(2)).multiply(b).setScale(2,RoundingMode.HALF_UP);
        else return a.multiply(b).setScale(2,RoundingMode.HALF_UP);
    }
    public BigDecimal calculateAreaOfTriangle(BigDecimal a,BigDecimal b,BigDecimal c, BigDecimal d){
        return a.add(b.add(c)).divide(d.multiply(BigDecimal.valueOf(4))).setScale(2,RoundingMode.HALF_UP);
    }
    public BigDecimal calculateAreaOfTriangle(BigDecimal a,BigDecimal b,BigDecimal c){
        BigDecimal p = (a.add(b).add(c)).divide(BigDecimal.valueOf(2));
        return (p.multiply(p.subtract(a).multiply(p.subtract(b)).multiply(p.subtract(c)))).sqrt(new MathContext(10)).setScale(2,RoundingMode.HALF_UP);
    }


}

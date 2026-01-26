package dam.optativa;

public class DiscountCalculator {
    public static double calcDiscount(Double money, boolean isStudiant) {
        if (money < 0){return 0;} //Is zero
        if (isStudiant) {return (money - (money * 0.20));} //Is Studient 
        else {return (money - (money * 0.05));} //Is not studient
    }
}
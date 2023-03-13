package unit09.inheritance.day38.another;

public class FastMail extends Mail{
    public FastMail(double weight) {
        super(weight);
    }


    @Override
    public double calculateShipping() {

        return super.calculateShipping() + 5;
    }
}

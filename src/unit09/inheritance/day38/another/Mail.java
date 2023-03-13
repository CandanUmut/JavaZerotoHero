package unit09.inheritance.day38.another;

public class Mail {
    private double weight;

    public Mail(double weight) {
        this.weight = weight;
    }

    public double calculateShipping(){
        return weight * 0.15;

    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

}

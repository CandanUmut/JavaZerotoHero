package unit02.objects.day08;

public class Num {
    private double num;

    public Num(double num) {
        this.num = num;
    }
    public double doubleNumber(){
        double doublenum = num *2;
        return doublenum;

    }
    public double halfNumber() {
        return num/2;
    }
    public double tripleNumber() {
        return num * 3 ;

    }
    public double tenTimeNumber(){
        return num *10;

    }

    }

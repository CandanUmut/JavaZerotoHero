package unit02.objects.day07;

import unit02.objects.day08.Num;

public class NumMain {
    public static void main(String[] args) {
        Num num1 = new Num(100);

        double doubnum1 =num1.doubleNumber();
        System.out.println(doubnum1);

        double halfnum = num1.halfNumber();
        System.out.println(halfnum);

        double tripnum = num1.tripleNumber();
        System.out.println(tripnum);

        double tennum = num1.tenTimeNumber();
        System.out.println(tennum);
        System.out.println(num1.doubleNumber());

        System.out.println(num1.tenTimeNumber());

        System.out.println(num1.halfNumber()+ num1.tenTimeNumber());

    }
}

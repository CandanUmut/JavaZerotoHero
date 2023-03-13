package unit11.collections.day43.sortinglistComperable;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SaleNumberMain {
    public static void main(String[] args) {
        List<SaleNumbers>saleNumbers= new ArrayList<>();
        saleNumbers.add(new SaleNumbers(50,1234.123));
        saleNumbers.add(new SaleNumbers(60,1990.123));
        saleNumbers.add(new SaleNumbers(30,600.123));
        saleNumbers.add(new SaleNumbers(90,3500.3));

        //sort by number of items

        System.out.println("Sorted by revenue");

        saleNumbers.sort(Comparator.comparing(SaleNumbers::getTotalRevenue));
        System.out.println(saleNumbers);

        System.out.println("Sorted by sold items");




       //sort by number of sold items
        saleNumbers.sort(Comparator.comparing(SaleNumbers::getNumberOfSoldItems));
        System.out.println(saleNumbers);


    }
}

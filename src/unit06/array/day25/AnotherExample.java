package unit06.array.day25;

public class AnotherExample {
    public static void main(String[] args) {
        String[] names = {"umutsa", "candansa", "hata","error"};

        for (String a : names) {
            if (a.length() >= 5) {
                System.out.println(a);
            }

        }
    }
}

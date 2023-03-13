package unit02.objects.day09;

public class Cancatenation {
    public static void main(String[] args) {
        String firstname = "John";
        String lastname = "Doe";
        String fullname = firstname +" " +lastname;
        System.out.println(fullname);

        String address = "Boston";
        address += ", MA";
        System.out.println(address);
        System.out.println("Name: "+fullname+" lives in "+ address);

    }
}

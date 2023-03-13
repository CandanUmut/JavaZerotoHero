package unit06.array.day24;

public class PersonalMain {
    public static void main(String[] args) {
        String[] myFriends = {"Umut", "Ahmet", "Mehmet"};
        Personal personal1 = new Personal(myFriends, "John Doe");

        String[] studentGrades = personal1.getFriends();
        System.out.println(studentGrades[2]);
    }
}

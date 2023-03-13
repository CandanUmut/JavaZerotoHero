package unit09.inheritance.day34.AthleteInheritance;

public class AthleteMain {
    public static void main(String[] args) {
        Athlete athlete = new Athlete();
        System.out.println(athlete.getName());

        Swimmer swimmer= new Swimmer();
        System.out.println(swimmer.getName());
        swimmer.practice();
        swimmer.dive();

    }
}

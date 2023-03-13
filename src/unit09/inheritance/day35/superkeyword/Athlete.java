package unit09.inheritance.day35.superkeyword;

public class Athlete {

        private String name, team;

        public Athlete(String name, String team) {
            this.name = name;
            this.team = team;
        }

        public void practice() {
            System.out.println("The player is practicing.");
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getTeam() {
            return team;
        }

        public void setTeam(String team) {
            this.team = team;
        }
    }

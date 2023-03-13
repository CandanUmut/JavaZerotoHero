package unit07.arraylist.day30.linearSearch;

public class Car {
        private String make;

        public Car(String make) {
            this.make = make;
        }

        public String getMake() {
            return make;
        }

        public void setMake(String make) {
            this.make = make;
        }

        @Override
        public String toString() {
            return "Car{" +
                    "make='" + make + '\'' +
                    '}';
        }
    }


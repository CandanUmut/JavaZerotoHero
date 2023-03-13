package unit07.arraylist.day29.Questions;

import java.util.ArrayList;

public class CountTheCitiesA {



        public static void main(String[] args) {
            // Create an ArrayList of cities
            ArrayList<String> cities = new ArrayList<String>();
            cities.add("Ankara");
            cities.add("Athena");
            cities.add("New York");
            cities.add("Istanbul");

            numberOfACities(cities);


        }
        public static int numberOfACities(ArrayList<String> cities){
            // Initialize a counter for cities that start with the letter "A"
            int count = 0;

            // Iterate through the list of cities and increment the counter for each city that starts with "A"
            for (String city : cities) {
                if (city.startsWith("A")) {
                    count++;
                }
            }

            // Print the final count
            System.out.println("Number of cities that start with 'A': " + count);
            return count;
        }
    }



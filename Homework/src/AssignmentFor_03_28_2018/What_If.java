package AssignmentFor_03_28_2018;

public class What_If {


    public static void main(String[] args){

        // declaring the variable people, cats, and dogs as integer types
        int people,cats, dogs;
        // assigning the variables people,cats, and dogs values of 45,25,and 78
        people = 45;
        cats = 25;
        dogs = 78;
        /**
         * 1. Comment above each if statement, saying what you think the purpose of that code is ?
         *
         * Answer: The purpose of the code is to check the population size of people compare to that of dogs/cats
         */

        if(people > cats){
            System.out.println("Too many cats! The world is doomed!");
        }
        else if(cats < people){
            System.out.println("Too few cats! The world is saved for another day!");


        }
        else{
            System.out.println();
        }
        if(people<dogs){
            System.out.println("The world is drooled on!");
        }
        else if(people >dogs) {
            System.out.println("The world is dry!");
        }

        else{
            System.out.println();
        }
    }
}

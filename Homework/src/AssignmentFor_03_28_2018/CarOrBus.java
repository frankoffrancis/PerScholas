package AssignmentFor_03_28_2018;

public class CarOrBus {
    /**
     * 1. What do you think else if and else are doing? Answer in a comment.
     *
     *  The else if is checking to see if the  boolean expression  is true or false.
     *  if it's true then the code statement will run. if it is false then either the next else if will check to see if
     *  its own expression is true or false , or the else statement will run.
     *
     *  2. Remove the else from one of your else if statements. What differences does that make? Why?
     *
     *  when one of my else if statement was removed. It made it so that if cars weren't greater than people.
     *  the code will say " we can't decide".
     *
     *  The reason why is that if the if boolean expression is false then it defaults to else
     *
     */
    public static void main(String[] args){

        // declaring the variables people,cars, and buses as an integer type while assigning them a value

        int people =78,cars=45,buses = 56;

        // checking to see if we should or shouldn't take cars
        if(cars > people){
            System.out.println("We should take the cars");
        }
        else if(cars < people){
            System.out.println("We should not take the cars.");
        }
        else {
            System.out.println("We can't decide.");
        }

        // checking to see if buses are too much or not

        if(buses > cars){
            System.out.println("That's too many buses.");
        }
        else if(buses <cars){
            System.out.println("Maybe we should take the buses.");
        }
        else {
            System.out.println("We still can't decide.");
        }

        if(people > buses){
            System.out.println("Alright, let's just take the buses");
        }

        else {
            System.out.println("Let's just take the cars.");


        }
    }
}

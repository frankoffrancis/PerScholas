package AssignmentFor_03_28_2018;
import java.util.Scanner;
public class Space_Weight {

    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        double weight; String planet;
        double wPlanet;
        System.out.println("Please enter your weight.");
        weight = userInput.nextDouble();
        System.out.println("Please enter one of the following planets that you want to visit. \nVenus, Mars, Jupiter, Saturn, Uranus, Neptune");
        userInput.nextLine();
        planet= userInput.nextLine();


        if(planet.equalsIgnoreCase("Venus")){

            wPlanet = weight *.78;
            System.out.println("Your weight on planet "+planet+ " is "+wPlanet +" pounds");
        }
       else if(planet.equalsIgnoreCase("Mars")){

            wPlanet = weight *.39;
            System.out.println("Your weight on planet "+planet+ " is "+wPlanet +" pounds");
        }
        else if(planet.equalsIgnoreCase("Jupiter")){

            wPlanet = weight *2.65;
            System.out.println("Your weight on planet "+planet+ " is "+wPlanet +" pounds");
        }
        else if(planet.equalsIgnoreCase("Saturn")){

            wPlanet = weight *1.17;
            System.out.println("Your weight on planet "+planet+ " is "+wPlanet +" pounds");
        }
        else if(planet.equalsIgnoreCase("Uranus")){

            wPlanet = weight *1.05;
            System.out.println("Your weight on planet "+planet+ " is "+wPlanet +" pounds");
        }
        else if(planet.equalsIgnoreCase("Neptune")){

            wPlanet = weight *1.23;
            System.out.println("Your weight on planet "+planet+ " is "+wPlanet +" pounds");
        }


    }


}

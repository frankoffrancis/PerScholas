package Assignment_for_04_03_2018;
import java.util.Scanner;
public class Running_Now_We_are_Talk {

    public static void main(String[] args){
        int numStudents;
        Scanner uInput = new Scanner(System.in);
        System.out.println("How many number of students do you have");
        numStudents = uInput.nextInt();
        uInput.nextLine();
        Students[] numStud = new Students [numStudents] ;
        for(int i = 0 ;i<numStud.length; i++) {
            numStud[i] = new Students();
        }

        double avgGPA=0;
        for(int i =0; i<numStud.length; i++){
            numStud[i].setName(uInput);
            numStud[i].setGPA(uInput);
            numStud[i].setGrade(uInput);
            avgGPA = numStud[i].getGPA()+avgGPA;
            numStud[i].returnAnswer();

        }
        System.out.println("The average GPA of the student is "+ avgGPA/3);
    }
}

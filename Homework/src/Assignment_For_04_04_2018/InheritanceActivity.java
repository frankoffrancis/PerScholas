package Assignment_For_04_04_2018;

public class InheritanceActivity {

    public static void main(String[] args){
        Employee manager = new Manager(126534,"Peter","Chennai India",237844,65000 );
        Employee trainee =  new Trainee(29846, "Jack","Mumbai India",442085,45000);
       //Problem 1
        manager.calculateSalary();
        trainee.calculateSalary();
        // Problem 2
        manager.calculateTransportAllowance();
        trainee.calculateTransportAllowance();
    }
}

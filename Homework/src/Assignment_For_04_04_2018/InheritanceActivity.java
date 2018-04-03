package Assignment_For_04_04_2018;

public class InheritanceActivity {

    public static void main(String[] args){
        Employee manager = new Manager(126534,"Peter","Chennai India",237844,65000 );
        Employee trainee =  new Trainee(29846, "Jack","Mumbai India",442085,45000);
       //Problem 1
       System.out.println("Peter has a salary of $"+  manager.calculateSalary());
        System.out.println("Jack has a salary of $"+trainee.calculateSalary());
        // Problem 2
        System.out.println("Peter has a transport allowance of "+manager.calculateTransportAllowance());
        System.out.println("Jack has a transport allowance of "+trainee.calculateTransportAllowance());

    }
}

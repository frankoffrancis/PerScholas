package Assignment_For_04_04_2018;

public class Trainee extends Employee{

    public Trainee(long id, String name, String address, long phone, double salary) {
        super(id, name, address, phone);
        basicSalary = salary;
    }

}
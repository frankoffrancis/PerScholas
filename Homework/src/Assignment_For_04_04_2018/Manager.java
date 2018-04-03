package Assignment_For_04_04_2018;

public class Manager extends Employee {
    public Manager(long id, String name, String address, long phone, double salary ){
        super( id,  name,  address, phone);
        basicSalary = salary;
    }//@OverRide
    public double calculateTransportAllowance() {
        double transportAllowance;
        transportAllowance = .15 * basicSalary;


        return transportAllowance;
    }
}

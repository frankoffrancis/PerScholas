package Assignment_For_04_04_2018;

public class Manager extends Employee {
    public Manager(long id, String name, String address, long phone, double salary ){
       super( id,  name,  address, phone);
        basicSalary = salary;
    }//@OverRide
        public void calculateTransportAllowance() {
            double transportAllowance;
            transportAllowance = .15 * basicSalary;
            System.out.println("Employee "+employeeName + " has a transportation allowance of "+transportAllowance);


    }
}

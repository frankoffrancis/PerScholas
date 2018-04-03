package Assignment_For_04_04_2018;

public class Employee {
    protected long employeeId;
    protected String employeeName;
    protected String employeeAddress;
    protected long employeePhone;
    protected double basicSalary;
    protected double specialAllowance = 250.8;
    protected double hra = 1000.5;


    public Employee(){

    }
    public Employee(long id, String name, String address, long phone){

        employeeId=id;
        employeeName =name;
        employeeAddress = address;
        employeePhone =phone;
    }

    public double calculateSalary(){
        double salary;
        salary = basicSalary+(basicSalary*(specialAllowance/100))+(basicSalary*(hra/100));
        return salary;
    }
    public double calculateTransportAllowance(){
        double transportAllowance;
        transportAllowance = .1 *basicSalary;

        return transportAllowance;
    }
}

package baitap;

public class Employee extends StaffMember {
    protected String socialSecurityNumber;
    protected double payRate;

    public Employee(String name, String address, String phone, String ssn, double rate) {
        super(name, address, phone);
        socialSecurityNumber = ssn;
        payRate = rate;
    }

    @Override
    public String toString() {
        return String.format("%s\nSSN: %s\nPay Rate: %.2f", super.toString(), socialSecurityNumber, payRate);
    }

    @Override
    public double pay() {
        return payRate;
    }
}

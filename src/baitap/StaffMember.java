package baitap;

public abstract class StaffMember {
    protected String name;
    protected String address;
    protected String phone;

    public StaffMember(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    
    public String toString() {
        return String.format("Name: %s\nAddress: %s\nPhone: %s", name, address, phone);
    }

    public abstract double pay();
}
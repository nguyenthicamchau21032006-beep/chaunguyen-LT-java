package baitap;

import java.util.ArrayList;

public class Staff {
    private ArrayList<StaffMember> staffList;

    public Staff() {
        staffList = new ArrayList<>();
    }

    public void addMember(StaffMember member) {
        staffList.add(member);
    }

    public void payday() {
        for (StaffMember member : staffList) {
            System.out.println(member);
            System.out.println("Paid: " + member.pay());
            System.out.println("");
        }
    }
}
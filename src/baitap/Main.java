package baitap;

public class Main {
    public static void main(String[] args) {
        Staff staff = new Staff();

        staff.addMember(new Volunteer("Linh", "Ha Noi", "0123..."));
        
        Executive boss = new Executive("Kim Bao", "HCM", "0988...", "SSN-001", 10000);
        boss.awardBonus(2000);
        staff.addMember(boss);

        Hourly worker = new Hourly("Dev Thue", "Da Nang", "0905...", "SSN-002", 50);
        worker.addHours(40);
        staff.addMember(worker);

        staff.payday();
    }
}
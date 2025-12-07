public class UjiCustomer {
    public static void main(String[] args) {

        // Tampilkan judul
        System.out.println("=== DATA CUSTOMER BELANJAKU ===");

        // Object Customer biasa
        Customer budi = new Customer("Budi Santoso", "CST-001", 500000);

        System.out.println("Status: Customer Biasa");
        budi.tampilkanInfo();

        System.out.println();

        // Object Member
        Member siti = new Member("Siti Aminah", "MBR-110", 1250000, 240, "Gold");

        System.out.println("Status: Member");
        siti.tampilkanInfo();
    }
}

class Member extends Customer {
    // Atribut tambahan khusus Member
    private int poinReward;
    private String level;

    // Constructor menggunakan super
    Member(String nama, String idCustomer, int totalBelanja, int poinReward, String level) {
        super(nama, idCustomer, totalBelanja); // panggil constructor Customer
        this.poinReward = poinReward;
        this.level = level;
    }

    // Override method tampilkanInfo()
    @Override
    void tampilkanInfo() {
        super.tampilkanInfo(); // tampilkan info Customer dulu
        System.out.println("Poin Reward: " + poinReward + " | Level: " + level);
    }
}

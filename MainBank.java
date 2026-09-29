public class MainBank {
    public static void main(String[] args) {
        System.out.println("=== Sistem Perbankan ===\n");

        Bank bankKita = new Bank();

        bankKita.addCustomer("Andi", "Susanto");
        bankKita.addCustomer("Budi", "Pratama");
        
        Customer nasabah1 = bankKita.getCustomer(0);
        Customer nasabah2 = bankKita.getCustomer(1);

        nasabah1.setAccount(new Account());
        nasabah2.setAccount(new Account());

        System.out.println("Saldo Awal " + nasabah1.getFirstName() + ": Rp " + nasabah1.getAccount().getBalance());
        System.out.println("Saldo Awal " + nasabah2.getFirstName() + ": Rp " + nasabah2.getAccount().getBalance());
        
        System.out.println("\n--- Melakukan Transaksi ---");

        //Simulasi Top Up (Deposit)
        System.out.println(">> Andi melakukan Deposit Rp 500.000");
        nasabah1.getAccount().deposit(500000);
        
        System.out.println(">> Budi melakukan Deposit Rp 1.000.000");
        nasabah2.getAccount().deposit(1000000);

        //Simulasi Penarikan (Withdraw)
        System.out.println(">> Andi menarik uang Rp 150.000");
        boolean tarikAndi = nasabah1.getAccount().withdraw(150000);
        System.out.println("Status Penarikan Andi: " + (tarikAndi ? "Berhasil" : "Gagal"));

        System.out.println(">> Budi mencoba menarik uang Rp 1.500.000");
        boolean tarikBudi = nasabah2.getAccount().withdraw(1500000);
        System.out.println("Status Penarikan Budi: " + (tarikBudi ? "Berhasil" : "Gagal - Saldo Kurang"));

        //Laporan Saldo Akhir
        System.out.println("\n=== Laporan Saldo Akhir ===");
        System.out.println("Nasabah: " + nasabah1.getFirstName() + " " + nasabah1.getLastName());
        System.out.println(" - Saldo: Rp " + nasabah1.getAccount().getBalance());

        System.out.println("\nNasabah: " + nasabah2.getFirstName() + " " + nasabah2.getLastName());
        System.out.println(" - Saldo: Rp " + nasabah2.getAccount().getBalance());
    }
}
public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        // Tambah beberapa item
        inventory.tambahItem("Pulpen", 50);
        inventory.tambahItem("Pensil", 30);
        inventory.tambahItem("Buku Catatan", 20);

        // Tampilkan semua item
        inventory.tampilkanItem();

        // Hapus satu item
        inventory.hapusItem("Pulpen");

        // Tampilkan kembali item yang ada setelah penghapusan
        inventory.tampilkanItem();
    }
}
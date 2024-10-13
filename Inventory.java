import java.util.HashMap;
import java.util.Map;

public class Inventory implements Storable {
    private Map<String, Integer> itemMap = new HashMap<>();
    private int totalItem = 0;

    @Override
    public void tambahItem(String item, int jumlah) {
        if (itemMap.containsKey(item)) {
            itemMap.put(item, itemMap.get(item) + jumlah);
        } else {
            itemMap.put(item, jumlah);
        }
        totalItem += jumlah;
        System.out.println(jumlah + " " + item + " ditambahkan ke inventaris.");
    }

    @Override
    public void hapusItem(String item) {
        if (itemMap.containsKey(item)) {
            int jumlah = itemMap.remove(item);
            totalItem -= jumlah;
            System.out.println(item + " dihapus dari inventaris.");
        } else {
            System.out.println(item + " tidak ditemukan di inventaris.");
        }
    }

    @Override
    public void tampilkanItem() {
        System.out.println("Inventaris Alat Tulis Kantor:");
        for (Map.Entry<String, Integer> entry : itemMap.entrySet()) {
            System.out.println("- " + entry.getKey() + ": " + entry.getValue());
        }
        System.out.println("Total item: " + totalItem);
    }
}
import java.util.ArrayDeque;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
        // 1. Contoh ArrayList 
        ArrayList<String> daftar = new ArrayList<>();
        daftar.add("Andi");
        daftar.add("Budi");
        
        System.out.println("Isi ArrayList: " + daftar);
        System.out.println("Ambil index 0: " + daftar.get(0)); // Ambil elemen index ke-0
        
        
        // 2. Contoh ArrayDeque
        ArrayDeque<String> antrean = new ArrayDeque<>();
        antrean.addLast("Orang 1"); // Masuk belakang
        antrean.addFirst("VIP");    // Masuk depan
        
        System.out.println("\nIsi ArrayDeque: " + antrean);
        System.out.println("Dikeluarkan dari depan: " + antrean.pollFirst()); // Ambil & hapus elemen depan
        System.out.println("Sisa antrean: " + antrean);
    }
}

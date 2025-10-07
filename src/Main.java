public class Main {
    public static void main(String[] args){
        // Membuat array of object bertipe Kendaraan
        Kendaraan[] daftarKendaraan = new Kendaraan[3];
        // Mengisi array dengan objek turunan Kendaraan
        daftarKendaraan[0] = new Mobil("Toyota", "Avanza");
        daftarKendaraan[1] = new Motor("Yamaha", "Nmax");
        daftarKendaraan[2] = new Bus("Mercedes", "Bus Besar");
        // Menampilkan daftar kendaraan
        System.out.println("=== Daftar Kendaraan ===");
        for(Kendaraan k : daftarKendaraan){
            k.infoKendaraan();
            System.out.println("Jumlah penumpang: " + k.banyakPenumpang());
            System.out.println("-----------------------");
        }
    }
}
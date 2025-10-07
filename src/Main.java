public class Main {
    public static void main(String[] args){
        Kendaraan[] daftarKendaraan = new Kendaraan[3];
        daftarKendaraan[0] = new Mobil("Toyota", "Avanza");
        daftarKendaraan[1] = new Motor("Yamaha", "Nmax");
        daftarKendaraan[2] = new Bus("Mercedes", "Bus Besar");

        System.out.println("=== Daftar Kendaraan ===");
        for(Kendaraan k : daftarKendaraan){
            k.infoKendaraan();
            System.out.println("Jumlah penumpang: " + k.banyakPenumpang());
            System.out.println("-----------------------");
        }
    }
}
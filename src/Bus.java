// Class Bus sebagai turunan dari Kendaraan
public class Bus extends Kendaraan {
    // Constructor memanggil constructor superclass
    public Bus(String merk, String model){
        super(merk, model);
    }
    // Override method untuk jumlah penumpang bus
    public int banyakPenumpang(){
        return 40;
    }
    // Menampilkan info kendaraan (khusus bus)
    public void infoBus(){
        infoKendaraan();
    } 
}

// Class Mobil sebagai turunan dari Kendaraan
public class Mobil extends Kendaraan {
    // Constructor memanggil constructor superclass
    public Mobil(String merk, String model){
        super(merk, model);
    }
    // Override method untuk jumlah penumpang mobil
    public int banyakPenumpang(){
        return 4;
    }
    // Menampilkan info kendaraan (khusus mobil)
    public void infoMobil(){   
        infoKendaraan();
    }
}

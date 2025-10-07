// Class Motor sebagai turunan dari Kendaraan
class Motor extends Kendaraan{
    // Constructor memanggil constructor superclass
    public Motor(String merk, String model){
        super(merk, model);
    }
    // Override method untuk jumlah penumpang motor
    public int banyakPenumpang(){
        return 2;
    }
    // Menampilkan info kendaraan (khusus motor)
    public void infoMotor(){
        infoKendaraan();
    }
}

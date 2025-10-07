// Abstract class sebagai induk dari semua jenis kendaraan
abstract class Kendaraan implements banyakPenumpang {
    protected String merk;
    protected String model;

    public Kendaraan(String merk, String model){
        this.merk = merk;
        this.model = model;
    }
    // Method untuk menampilkan informasi kendaraan
    public void infoKendaraan(){
        System.out.println("Merk: " + merk + ",model: "+ model);
    }
    // Method abstrak untuk menentukan jumlah penumpang
    public abstract int banyakPenumpang();
}

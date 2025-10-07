public class Mobil extends Kendaraan {

    public Mobil(String merk, String model){
        super(merk, model);
    }
    public int banyakPenumpang(){
        return 4;
    }
    public void infoMobil(){   
        infoKendaraan();
    }
}

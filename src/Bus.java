public class Bus extends Kendaraan {
    public Bus(String merk, String model){
        super(merk, model);
    }
    public int banyakPenumpang(){
        return 40;
    }
    public void infoBus(){
        infoKendaraan();
    } 
}

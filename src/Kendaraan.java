abstract class Kendaraan implements banyakPenumpang {
    protected String merk;
    protected String model;

    public Kendaraan(String merk, String model){
        this.merk = merk;
        this.model = model;
    }
    public void infoKendaraan(){
        System.out.println("Merk: " + merk + ",model: "+ model);
    }
    public abstract int banyakPenumpang();
}

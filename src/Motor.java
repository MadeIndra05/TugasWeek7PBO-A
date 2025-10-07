class Motor extends Kendaraan{
    public Motor(String merk, String model){
        super(merk, model);
    }
    public int banyakPenumpang(){
        return 2;
    }
    public void infoMotor(){
        infoKendaraan();
    }
}

package model;

public class Menu {
    public Menu(String nama, int harga, float disc) {
        this.nama = nama;
        this.harga = harga;
        this.disc = disc;
    }

    @Override
    public String toString(){
        if(disc == 0){
            return nama + " " + harga;
        }else {
            return nama + " " + (harga-(harga*disc) +" "+ "(original price : " + harga+")" +"Discount: " + (disc*100) + "%"  );
        }
    }

    private String nama;
    private int harga;
    private float disc;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public float getDisc() {
        return disc;
    }

    public void setDisc(float disc) {
        this.disc = disc;
    }
}

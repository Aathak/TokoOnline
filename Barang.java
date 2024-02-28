package tokokelontongonline;

import java.util.ArrayList;

public class Barang {
    private ArrayList<String> NamaBarang = new ArrayList<String>();
    private ArrayList<Integer> Stok = new ArrayList<Integer>();
    private ArrayList<Integer> Harga = new ArrayList<Integer>();
    
    public Barang(){
        this.NamaBarang.add("Kejuw");
        this.Stok.add(15);
        this.Harga.add(100000);
        
        this.NamaBarang.add("Permen Tangan");
        this.Stok.add(30);
        this.Harga.add(1000);
        
        this.NamaBarang.add("Kripik-kripikan");
        this.Stok.add(20);
        this.Harga.add(15000);
    }
    
     public int GetJmlBarang(){
         return this.NamaBarang.size();
     }
     
     public void SetNamaBarang(String NamaBarang){
         this.NamaBarang.add(NamaBarang);
     }
     
     public String GetNamaBarang(int idBarang){
         return this.NamaBarang.get(idBarang);
     }
     
     public void SetStok(int Stok){
         this.Stok.add(Stok);
     }
     
     public int GetStok(int idBarang){
         return this.Stok.get(idBarang);
     }
     
     public void EditStok(int idBarang, int Stok){
         this.Stok.set(idBarang, Stok);
     }
     
     public void SetHarga(int Harga){
         this.Harga.add(Harga);
     }
     
     public int GetHarga(int idBarang){
         return this.Harga.get(idBarang);
     }
}

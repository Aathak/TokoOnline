package tokokelontongonline;
import java.util.ArrayList;

public class Karyawan implements User {
    private ArrayList<String> NamaKaryawan = new ArrayList<String>();
    private ArrayList<String> Alamat = new ArrayList<String>();
    private ArrayList<String> Telepon = new ArrayList<String>();
    private ArrayList<Integer> Jabatan = new ArrayList<Integer>();

    public Karyawan(){
        this.NamaKaryawan.add("admin");
        this.Alamat.add("Kedung Kandang");
        this.Telepon.add("2143658709");
        this.Jabatan.add(0);
    }
    
    public void SetJabatan(int Jabatan){
        this.Jabatan.add(Jabatan);
    }
    public int GetJabatan(int id){
        return this.Jabatan.get(id);
    }
    
    public int GetJmlKaryawan(){
        return this.NamaKaryawan.size();
    }
    
    @Override
    public void SetNama(String NamaKaryawan){
        this.NamaKaryawan.add(NamaKaryawan);
    }
    
    @Override
    public void SetAlamat(String Alamat){
        this.Alamat.add(Alamat);
    }
    
    @Override
    public void SetTelepon(String Telepon){
        this.Telepon.add(Telepon);
    }
    
    @Override
    public String GetNama(int idKaryawan){
        return this.NamaKaryawan.get(idKaryawan);
    }
    
    @Override
    public String GetAlamat(int idKaryawan){
        return this.Alamat.get(idKaryawan);
    }
    
    @Override
    public String GetTelepon(int idKaryawan){
        return this.Telepon.get(idKaryawan);
    }
}

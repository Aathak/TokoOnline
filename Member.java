package tokokelontongonline;
import java.util.ArrayList;

public class Member implements User{
    
    private ArrayList<String> NamaMember = new ArrayList<String>();
    private ArrayList<String> Alamat = new ArrayList<String>();
    private ArrayList<String> Telepon = new ArrayList<String>();
    private ArrayList<Integer> Saldo = new ArrayList<Integer>();
    
    public Member(){
       this.NamaMember.add("Kiran");
       this.Alamat.add("Pakis");
       this.Telepon.add("0123456789");
       this.Saldo.add(100000);
       
       this.NamaMember.add("Nafisya");
       this.Alamat.add("Sulfat");
       this.Telepon.add("9876543210");
       this.Saldo.add(200000);
    }
    
    public void SetSaldo(int saldo){
        this.Saldo.add(saldo);
    }
    
    public int GetSaldo(int idMember){
        return this.Saldo.get(idMember);
    }
    
    public void EditSaldo(int idMember, int saldo){
        this.Saldo.set(idMember, saldo);
    }
    
    public int GetJmlMember(){
        return this.Saldo.size();
    }
    
    @Override
    public void SetNama(String NamaMember){
        this.NamaMember.add(NamaMember);
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
    public String GetNama(int idMember){
        return this.NamaMember.get(idMember);
    }
    
    @Override
    public String GetAlamat(int idMember){
        return this.Alamat.get(idMember);
    }
    
    @Override
    public String GetTelepon(int idMember){
        return this.Telepon.get(idMember);
    }
}

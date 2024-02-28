package tokokelontongonline;

public interface User {
    void SetNama(String nama);
    void SetAlamat(String alamat);
    void SetTelepon(String telepon);
    
    String GetNama(int id);
    String GetAlamat(int id);
    String GetTelepon(int id);
}

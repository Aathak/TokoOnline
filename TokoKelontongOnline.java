package tokokelontongonline;

public class TokoKelontongOnline {

    
    public static void main(String[] args) {
        Member member;
        member = new Member(){};
        Barang barang = new Barang();
        Transaksi transaksi = new Transaksi();
        Laporan laporan = new Laporan();
        
        transaksi.ProsesTransaksi(member, transaksi, barang);
        
        laporan.Laporan(barang);
        laporan.Laporan(member);
        laporan.laporan(transaksi, barang);
    }
    
}

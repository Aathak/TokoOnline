package tokokelontongonline;

public class Laporan {
    public void Laporan(Barang barang){
        int x = barang.GetJmlBarang();
        
        System.out.println();
        System.out.println("Tabel Baarang");
        System.out.println();
        System.out.println("Nama Barang \tStok \tHarga");
        for (int i = 0; i < x; i++){
        System.out.println("");
        }
    }
    
    public void Laporan(Member member){
        int x = member.GetJmlMember();
        
        System.out.println();
        System.out.println("Tabel Member");
        System.out.println();
        System.out.println("Nama \tAlamat \tTelepon \tSaldo");
        for(int i = 0; i < x; i++){
            System.out.println(member.GetNama(i)+"\t"+member.GetAlamat(i)+"\t"+
                    member.GetTelepon(i)+"\t"+member.GetSaldo(i));
        }
    }
    
    public void laporan(Transaksi transaksi, Barang barang){
        int x = transaksi.GetJmlTransaksi();
        
        System.out.println();
        System.out.println("Laporan Transaksii");
        System.out.println();
        System.out.println("Nama Barang \tQty \tHarga \tJumlah");
        
        int total = 0;
        for (int i = 0; i < x; i++){
            int Jumlah = transaksi.GetBanyaknya(i)*barang.GetHarga(transaksi.GetIdBarang(i));
            total+=Jumlah;
            
            System.out.println(barang.GetNamaBarang(transaksi.GetIdBarang(i)) + "\t" + 
                    transaksi.GetBanyaknya(i) + "\t" + barang.GetHarga(transaksi.GetIdBarang(i)) + "\t" + Jumlah);
        }
        System.out.println("Total Omset = " + total);
    }
}

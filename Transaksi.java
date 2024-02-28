package tokokelontongonline;
import java.util.Scanner;
import java.util.ArrayList;

public class Transaksi {
    private ArrayList<Integer> idMember = new ArrayList<Integer>();
    private ArrayList<Integer> idBarang = new ArrayList<Integer>();
    private ArrayList<Integer> Banyak = new ArrayList<Integer>();
    
    public Transaksi(){
        this.idMember.add(0);
        this.idBarang.add(0);
        this.Banyak.add(2);
        
        this.idMember.add(0);
        this.idBarang.add(1);
        this.Banyak.add(3);
        
        this.idMember.add(0);
        this.idBarang.add(0);
        this.Banyak.add(2);
        
        this.idMember.add(1);
        this.idBarang.add(0);
        this.Banyak.add(1);
        
        this.idMember.add(1);
        this.idBarang.add(2);
        this.Banyak.add(2);
    }
    
    public void ProsesTransaksi(Member member, Transaksi transaksi, Barang barang){
       Scanner Kelontong = new Scanner(System.in);
        System.out.println("Silahkan Belanja :D");
        System.out.println("Masukkan ID Member");
        int idMember = Kelontong.nextInt();
        System.out.println("Selamat datang " + member.GetNama(idMember));
        ArrayList <Integer> idBarang = new ArrayList<Integer>();
        ArrayList <Integer> Banyak = new ArrayList<Integer>();
        int i = 0;
        int temp = 0;
        
        do{
            System.out.println("Masukkan kode barang :");
            temp=Kelontong.nextInt();
                if (temp!=99){
                    idBarang.add(temp);
                    System.out.print(barang.GetNamaBarang(idBarang.get(i)) + "sebanyak : ");
                    Banyak.add(Kelontong.nextInt());
                    i++;
                }
            }while (temp!=99); 
            System.out.println("Transaksi belanja "+ member.GetNama(idMember) + "sebagai berikut : " );
            System.out.println("Nama Barang \tQty \tHarga \tJumlah \t");

             int total=0;
             int x = idBarang.size();
             for (int j = 0; j < x; j++){
                  int Jumlah = Banyak.get(j) * barang.GetHarga(idBarang.get(j));
                  total+=Jumlah;
                  System.out.println(barang.GetNamaBarang(idBarang.get(j))+"\t"+
                  idBarang.get(j)+"\t"+ barang.GetHarga(idBarang.get(j)) + "\t"+ Jumlah);
                  transaksi.SetTransaksi(barang, idMember, idBarang.get(j), Banyak.get(j));
            }
        
//        do{
//            System.out.println("Masukkan Kode Barang : ");
//            temp = Kelontong.nextInt();
//            if (temp!=99){
//                idBarang.add(temp);
//                System.out.print(Barang.GetNamaBarang(idBarang.get(i)) + "sebanyak : ");
//                Banyak.add(Kelontong.nextInt());
//                i++;
//            }
//        } while (temp!=99);
//        
//        System.out.println("Transaksi belanja " + member.GetNama(idMember) + "sebagai berikut");
//        System.out.println("Nama Barang \tQty \tHarga \tJumlah \t");
//        
//        int total = 0;
//        int x = idBarang.size();
//        for (int j = 0; j < x; j++){
//            int Jumlah = Banyak.get(j) * Barang.GetHarga(idBarang.get(j)));
//            total+=Jumlah;
//            System.out.println(Barang.GetNamaBarang(j) + "\t" 
//            + idBarang.get(j)+"\t"+
//            Barang.GetHarga(idBarang.get(j))+"\t"+
//            Jumlah);
//            transaksi.SetTransaksi(Barang, idMember, idBarang.get(j),Banyak.get(j));
//        }
        
        System.out.println("Total Belanja : " +total);
        member.EditSaldo(idMember, member.GetSaldo(-total));                
        
    }
    
    public void SetTransaksi (Barang barang, int idMember, int idBarang, int banyaknya){
        this.idMember.add(idMember);
        this.idBarang.add(idBarang);
        this.Banyak.add(banyaknya);
        barang.EditStok(idBarang, barang.GetStok(idBarang)- banyaknya);
    }
    
    public int GetIdBarang(int id){
        return this.idBarang.get(id);
    }
    
    public int GetBanyaknya(int id){
        return this.Banyak.get(id);
    }
    
    public int GetIdMember(int id){
        return this.idMember.get(id);
    }
    
    public int GetJmlTransaksi(){
        return this.idMember.size();
    }
}


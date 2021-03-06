package mainapotek;

import java.util.Scanner;

public class DataApotek {
    private String nama, Alamat;
    Apotek [] obat = new Apotek [6];
    private int no=0,DH=0;
    Scanner input = new Scanner(System.in);
    
    public DataApotek(){
    }
    
    public void DataApotek(String nama, String Alamat){
        this.nama= nama;
        this.Alamat= Alamat;
    }
    
    public void daftar(){
        int pilih;
        do {
            System.out.println("----------------------------------------------");
            System.out.println("|   No    Kode    Nama Obat         Harga    |");
            System.out.println("|   1.    KO123   Obat Gatal        Rp. 5000 |");
            System.out.println("|   2.    KO990   Obat Sakit Kepala Rp. 3500 |");
            System.out.println("|   3.    KO784   Obat Sakit Gigi   Rp. 3000 |");
            System.out.println("|   4.    KO226   Obat Demam        RP. 2800 |");
            System.out.println("|   5.    KO888   Obat Batuk        Rp. 4900 |");
            System.out.println("|   6.    KO992   Obat Flu          Rp. 2500 |");
            System.out.println("----------------------------------------------");
            System.out.println("|   0.    Keluar                             |");
            System.out.print("Masukkan pilihan anda : ");
            pilih = input.nextInt();
            switch (pilih){
                case 1: no++;
                        obat[no] = new Apotek("KO123", "Obat Gatal", 5000);
                        DH += 5000;
                        break;
                case 2: no++;
                        obat[no] = new Apotek("KO990", "Obat Sakit Kepala", 3500);
                        DH += 3500;
                        break;
                case 3: no++;
                        obat[no] = new Apotek("KO784", "Obat Sakit Gigi", 3000);
                        DH += 3000;
                        break;
                case 4: no++;
                        obat[no] = new Apotek("KO226", "Obat Demam", 2800);
                        DH += 2800;
                        break;
                case 5: no++;
                        obat[no] = new Apotek("KO888", "Obat Batuk", 4900);
                        DH += 4900;
                        break;
                case 6: no++;
                        obat[no] = new Apotek("KO992", "Obat Flu", 2500);
                        DH += 2500;
                        break;
                case 0: break;
                default: System.out.println("Pilihan tidak ada! Pastikan memilih sesuai menu");               
            }
        } while (pilih!=0);       
    }
    
    public void output(){
        System.out.println("----------------------------------------------");
        System.out.println("Sistem Informasi Penjualan Apotek");
        System.out.println("Nama        : "+nama);
        System.out.println("Alamat      : "+Alamat);
        System.out.println("---------------------------------------------------------------------");
        System.out.println(" NO\tkode\t\t\tNAMA OBAT\t\tHARGA");
        System.out.println("---------------------------------------------------------------------");
        for (int i = 0; i < no; i++) {
            System.out.print(" "+(i+1)+"    ");
            obat[i+1].display();
        }
        System.out.println("---------------------------------------------------------------------");
        System.out.println("\t\t\t\t\t\t    Jumlah : Rp."+DH);
        System.out.println("---------------------------------------------------------------------");
    }
}

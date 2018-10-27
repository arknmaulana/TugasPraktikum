/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspraktikum;

/**
 *
 * @author HP ZBOOK 15
 */
import java.util.Scanner;
public class AplikasiPenjualan {
        public static void main(String[] args) {

    int pilihanAwal, pilihbuku, pilihalat, totalharga, hargabuku = 0, hargaalat = 0, jumlahbuku = 0, jumlahalat = 0, bayar, diskon = 0,
        hujan, sholat, bobo, bukugambar, bukutulis, bolpen, pensil, penggaris, spidol, penghapus,
        kodebarang1 = 0, kodebarang2, 
        Hhujan = 55000, Hsholat = 34000, Hbobo = 47000, Hbukugambar = 15000, Hbukutulis = 24000, Hbolpen = 6000, Hpensil = 10000, Hpenggaris = 12000, 
            Hspidol = 4000, Hpenghapus = 7000, hargane = 0, harganya = 0;
            
    String namabarang1 = null, namabarang2 = null, hujan1 = ("Novel Hujan"), sholat1 = ("Buku Tuntunan Sholat Lengkap"), bobo1 = ("Majalah Bobo"), 
           bukugambar1 = ("Buku Gambar"), bukutulis1 = ("Buku Tulis"), bolpen1 = ("Bolpen"), pensil1 = ("Pensil"), penggaris1 = ("Penggaris"), spidol1 = ("Spidol"), 
           penghapus1 = ("Penghapus");
    
    Scanner inputan = new Scanner(System.in);
    
    System.out.println("    Aplikasi Penjualan   ");
    System.out.println("  Toko Buku Penting Laku ");
    System.out.println("\n");
    System.out.println("Mau beli apa?");
    System.out.println("1. Buku");
    System.out.println("2. Peralatan tulis");
    System.out.print("Pilihan = ");
    
    pilihanAwal = inputan.nextInt();
    
    switch (pilihanAwal){
        case 1: 
            System.out.println("\nBuku apa yang ingin anda beli?");
            System.out.println("1. Novel 'Hujan'");
            System.out.println("2. Buku Tuntunan Sholat lengkap");
            System.out.println("3. Majalah Bobo");
            System.out.println("4. Buku Gambar");
            System.out.println("5. Buku tulis");
            System.out.print("Pilih = ");
            
            pilihbuku = inputan.nextInt();
            
            switch (pilihbuku){
                case 1: 
                    System.out.println("\n'Hujan'");
                    hargane = Hhujan;
                    namabarang1 = hujan1;
                    hujan = 0001;
                    kodebarang1 = hujan;
                    System.out.println("Harga : Rp 55.000");
                    System.out.println("\nMau beli berapa? = ");
                    jumlahbuku = inputan.nextInt();
                    hargabuku = Hhujan*jumlahbuku; break;
                    
                    
                case 2:
                    System.out.println("\nTuntukan Sholat lengkap");
                    hargane = Hsholat;
                    namabarang1 = sholat1;
                    sholat = 0002;
                    kodebarang1 = sholat;
                    System.out.println("Harga : Rp 34.000");
                    System.out.print("\nMau beli berapa? = ");
                    jumlahbuku = inputan.nextInt();
                    hargabuku = 34000*jumlahbuku; break;
                case 3:
                    System.out.println("\nMajalah Bobo");
                    hargane = Hbobo;
                    namabarang1 = bobo1;
                    bobo = 0003;
                    kodebarang1 = bobo;
                    System.out.println("Harga : Rp 47.000");
                    System.out.print("\nMau beli berapa? = ");
                    jumlahbuku = inputan.nextInt();
                    hargabuku = 47000*jumlahbuku; break;
                case 4:
                    System.out.println("\nBuku Gambar");
                    hargane = Hbukugambar;
                    namabarang1 = bukugambar1;
                    bukugambar = 0004;
                    kodebarang1 = bukugambar;
                    System.out.println("Harga : Rp 15.000");
                    System.out.print("\nMau beli berapa? = ");
                    jumlahbuku = inputan.nextInt();
                    hargabuku = 15000*jumlahbuku;break;
                case 5:
                    System.out.println("\nBuku Tulis");
                    hargane = Hbukutulis;
                    namabarang1 = bukutulis1;
                    bukutulis = 0005;
                    kodebarang1 = bukutulis;
                    System.out.println("Harga : Rp 24.000");
                    System.out.print("\nMau beli berapa? = ");
                    jumlahbuku = inputan.nextInt();
                    hargabuku = 24000*jumlahbuku; break;
        }
            case 2:
                System.out.println("\nIngin beli peralatan tulis apa?");
            System.out.println("1. Bolpen");
            System.out.println("2. Pensil");
            System.out.println("3. Penggaris");
            System.out.println("4. Penghapus");
            System.out.println("5. Spidol");
            System.out.print("Pilih = ");
            
            pilihalat = inputan.nextInt();
            
            switch (pilihalat){
                case 1: 
                    System.out.println("\nBolpen");
                    harganya = Hbolpen;
                    namabarang2 = bolpen1;
                    bolpen = 0006;
                    kodebarang2 = bolpen;
                    System.out.println("Harga : Rp 6.000");
                    System.out.print("\nMau beli berapa? = ");
                    jumlahalat = inputan.nextInt();
                    hargaalat = 6000*jumlahalat; break;
                case 2:
                    System.out.println("\nPensil");
                    harganya = Hbolpen;
                    namabarang2 = pensil1;
                    pensil = 0007;
                    kodebarang2 = pensil;
                    System.out.println("Harga : Rp 10.000");
                    System.out.print("\nMau beli berapa? = ");
                    jumlahalat = inputan.nextInt();
                    hargaalat = 10000*jumlahalat; break;
                case 3:
                    System.out.println("\nPenggaris");
                    harganya = Hpenggaris;
                    namabarang2 = penggaris1;
                    penggaris = 0010;
                    kodebarang2 = penggaris;
                    System.out.println("Harga : Rp 12.000");
                    System.out.print("\nMau beli berapa? = ");
                    jumlahalat = inputan.nextInt();
                    hargaalat = 12000*jumlahalat; break;
                case 4:
                    System.out.println("\nPenghapus");
                    harganya = Hpenghapus;
                    namabarang2 = penghapus1;
                    penghapus = 0011;
                    kodebarang2 = penghapus;
                    System.out.println("Harga : Rp 4.000");
                    System.out.print("\nMau beli berapa? = ");
                    jumlahalat = inputan.nextInt();
                    hargaalat = 4000*jumlahalat;break;
                case 5:
                    System.out.println("\nSpidol");
                    harganya = Hspidol;
                    namabarang2 = spidol1;
                    spidol = 0012;
                    kodebarang2 = spidol;
                    System.out.println("Harga : Rp 7.000");
                    System.out.print("\nMau beli berapa? = ");
                    jumlahalat = inputan.nextInt();
                    hargaalat = 7000*jumlahalat; break;
    }
}
        totalharga = hargabuku + hargaalat;
    if(totalharga > 100000)
        diskon = totalharga*10/100;
    else if(totalharga > 200000)
        diskon = totalharga*20/100;
    else if(totalharga > 500000)
        diskon = totalharga*50/100;
    else if(totalharga < 100000)
        diskon = 0;
    bayar = totalharga - diskon;
    
    System.out.println("---------------------------------------");
    System.out.println("              Nota Pembelian           ");
    System.out.println("     Nama Kasir : Maulana Hilmi Arkan  ");
    System.out.println("Kode barang = " + kodebarang1);
    System.out.println(namabarang1);
    System.out.println(hargane + " * " + jumlahbuku + " = " + hargabuku );
    System.out.println("\nKode barang = " + kodebarang1);
    System.out.println(namabarang2);
    System.out.println(harganya + " * " + jumlahalat + " = " + hargaalat);
    System.out.println("\nTotal harga = " + bayar);
    System.out.println("\nTerima kasih! Semoga harimu menyenangkan!");
    System.out.println("---------Toko Buku Penting Laku--------");
    
}
}

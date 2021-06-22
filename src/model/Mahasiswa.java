package model;

public class Mahasiswa {
    //ini atribut atau bisa di bilang field tabel
    public String namaMahasiswa;
    public int npm;
    public String kelas;
    public String prodi;
    public int jumlahSks;
    public double ipk;
    public int telepon;
    public String alamat;


    //kalau yang ini namanya method
    public void tampilkanIdentitas(){
        System.out.println("Nama = " + namaMahasiswa);
        System.out.println("NPM = " + npm);
        System.out.println("Telepon = " + telepon);
        System.out.println("Alamat = " + alamat);

    }
    public void tampilkanProdi(){
        System.out.println("Kelas = " + kelas);
        System.out.println("Prodi = " + prodi);

    }
    public void tampilkanSks(){
        System.out.println("Jumlah SKS = " + jumlahSks);

    }
    public void tampilkanIpk(){
        System.out.println("IPK = " + ipk);

    }
}

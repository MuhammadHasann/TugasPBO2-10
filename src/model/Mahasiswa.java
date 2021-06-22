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
    public boolean tampilkanIdentitas(){
        System.out.println("Nama = " + namaMahasiswa);
        System.out.println("NPM = " + npm);
        System.out.println("Telepon = " + telepon);
        System.out.println("Alamat = " + alamat);

        return false;
    }
    public boolean tampilkanProdi(){
        System.out.println("Kelas = " + kelas);
        System.out.println("Prodi = " + prodi);

        return false;
    }
    public boolean tampilkanSks(){
        System.out.println("Jumlah SKS = " + jumlahSks);

        return false;
    }
    public boolean tampilkanIpk(){
        System.out.println("IPK = " + ipk);

        return false;
    }
}

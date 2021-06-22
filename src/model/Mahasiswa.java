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

    public Mahasiswa() {
        System.out.println("ini dari constructor Mahasiswa");
    }

    //ini contructor pertama
    public Mahasiswa(String namaMahasiswa) {
        this.namaMahasiswa = namaMahasiswa;
    }

    //ini contructor kedua
    public Mahasiswa(int jumlahSks) {
        this.jumlahSks = jumlahSks;
    }

    //ini contructor ketiga
    public Mahasiswa(int telepon, String alamat) {
        this.telepon = telepon;
        this.alamat = alamat;
    }

    public String getNamaMahasiswa() {
        return namaMahasiswa;
    }

    public void setNamaMahasiswa(String namaMahasiswa) {
        this.namaMahasiswa = namaMahasiswa;
    }

    public int getNpm() {
        return npm;
    }

    public void setNpm(int npm) {
        this.npm = npm;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public String getProdi() {
        return prodi;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public int getJumlahSks() {
        return jumlahSks;
    }

    public void setJumlahSks(int jumlahSks) {
        this.jumlahSks = jumlahSks;
    }

    public double getIpk() {
        return ipk;
    }

    public void setIpk(double ipk) {
        this.ipk = ipk;
    }

    public int getTelepon() {
        return telepon;
    }

    public void setTelepon(int telepon) {
        this.telepon = telepon;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
}

package model;

public class MahasiswaTransfer extends Mahasiswa {
    //ini atribut atau bisa di bilang field tabel
    public String kampusSebelumnya;
    public String prodiSebelumnya;
    public double ipkSebelumnya;


    //kalau yang ini namanya method
    public boolean tampilkanHistory(){
        System.out.println("Nama = " + namaMahasiswa);
        System.out.println("Kampus Sebelumnya = " + kampusSebelumnya);
        System.out.println("Nama Sebelumnya = " + prodiSebelumnya);

        return false;
    }
    public boolean tampilkanIpkSebelumnya(){
        System.out.println("IPK Sebelumnya = " + ipkSebelumnya);

        return false;
    }
}

package model;

public class MahasiswaTransfer extends Mahasiswa {
    //ini atribut atau bisa di bilang field tabel
    public String kampusSebelumnya;
    public String prodiSebelumnya;
    public double ipkSebelumnya;

    //kalau yang ini namanya method
    public void tampilkanHistory(){
        System.out.println("Kampus Sebelumnya = " + kampusSebelumnya);
        System.out.println("Nama Sebelumnya = " + prodiSebelumnya);

    }
    public void tampilkanIpkSebelumnya(){
        System.out.println("IPK Sebelumnya = " + ipkSebelumnya);

    }
}

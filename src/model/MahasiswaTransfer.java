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

    public String getKampusSebelumnya() {
        return kampusSebelumnya;
    }

    public void setKampusSebelumnya(String kampusSebelumnya) {
        this.kampusSebelumnya = kampusSebelumnya;
    }

    public String getProdiSebelumnya() {
        return prodiSebelumnya;
    }

    public void setProdiSebelumnya(String prodiSebelumnya) {
        this.prodiSebelumnya = prodiSebelumnya;
    }

    public double getIpkSebelumnya() {
        return ipkSebelumnya;
    }

    public void setIpkSebelumnya(double ipkSebelumnya) {
        this.ipkSebelumnya = ipkSebelumnya;
    }

    //override ini artinya menumpuk
    @Override
    public String getKelas() {
        return super.getKelas();
    }

    @Override
    public String getProdi() {
        return super.getProdi();
    }
}

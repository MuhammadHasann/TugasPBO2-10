import model.Mahasiswa ;
import model.MahasiswaTransfer ;


public class Aksi {
    public static void main(String[] args) {
        //di sini untuk mengisi field dari class mahasiswa
        Mahasiswa m = new Mahasiswa();
        m.namaMahasiswa = "fulan";
        m.npm = 19630338;
        m.kelas = "F reguler malam";
        m.prodi = "Teknik Informatika";
        m.jumlahSks = 36;
        m.ipk = 3.56;
        m.telepon = 812544654;
        m.alamat = "Dalam pagar";

        //di sini untuk mengisi field dari class mahasiswatrasnfer
        MahasiswaTransfer mt = new MahasiswaTransfer();
        mt.namaMahasiswa = "fulan";
        mt.kampusSebelumnya = "STIMIK";
        mt.prodiSebelumnya = "Sistem Informasi";
        mt.ipkSebelumnya = 3.58;

        //ini untuk memanggil data yang ada di setiap class
        //untuk di tampilkan di running codenya
        System.out.println(m.tampilkanIdentitas());
        System.out.println(m.tampilkanProdi());
        System.out.println(m.tampilkanSks());
        System.out.println(m.tampilkanIpk());
        System.out.println(mt.tampilkanHistory());
        System.out.println(mt.tampilkanIpkSebelumnya());


        Mahasiswa mc = new Mahasiswa("Ihda");
        mc.npm = 13635698;
        System.out.println("Nama Mahasiswa = " + mc.namaMahasiswa);
        System.out.println("NPM = " + mc.npm);

        Mahasiswa ms = new Mahasiswa(46);
        ms.ipk = 4.00;
        System.out.println("SKS = " + ms.jumlahSks);
        System.out.println("IPK = " + ms.ipk);

        Mahasiswa mta = new Mahasiswa(8564247 , "Martapura");
        System.out.println("Telepon = " + mta.telepon);
        System.out.println("Alamat = " + mta.alamat);

    }
}
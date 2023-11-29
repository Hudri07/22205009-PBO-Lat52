package pkg22205009.pbo.lat52;

/**
 * Nama         : Asmalik Hudri
 * Prodi        : Teknik Informatika
 * Semester     : 3
 * Matakuliah   : Pemrograman Berorientasi Objek (PBO)
 */

// kelas dasar yang merepresentasikan makhluk manusia
class Manusia {
    
    protected String nama;  //Variabel untuk menyimpan nama
    protected int umur;     //Variabel untuk menyimpan umur
    
    // Getter untuk mendapatkan nilai nama
    public String getNama(){
        return nama;
    }
    
    // Setter untuk mengatur nilai nama
    public void setNama(String nama){
        this.nama = nama;
    }
    
    // Getter untuk mendapatkan nilai umur
    public int getUmur(){
        return umur;
    }
    
    // Setter untuk mengatur nilai umur
    public void setUmur (int umur){
        this.umur =  umur;
    }
    
    // Metode untuk menampilkan identitas manusia
    public void siapaKamu(){
        System.out.println("Saya Manusia");
    }
}

// Kelas Dosen merupakan turunan dari kelas Manusia, menambahkan properti NIP dan matakuliah
class Dosen extends Manusia{
    private String nip;
    private String mataKuliah;
    
    // Getter untuk mendapatkan nilai NIP
    public String getNip(){
        return nip;
    }
    
    // Setter untuk mengatur nilai NIP
    public void setNip(String nip){
        this.nip = nip;
    }
    
    // Getter untuk mendapatkan nilai mataKuliah
    public String getMataKuliah(){
        return mataKuliah;
    }
    
    // Setter untuk mengatur nilai mataKuliah
    public void setMataKuliah(String mataKuliah){
        this.mataKuliah = mataKuliah;
    }
    
    // Metode untuk menampilkan informasi mengajar dosen
    public void mengajarApa(){
        System.out.println("Saya Rizki Adam Kurniawan umur 27 tahun sedang"
                + " mengajar matakuliah PBO");
    }
    
    // Metode yang menggantikan metode siapaKamu() dari kelas Manusia
    @Override
    public void siapaKamu(){
        System.out.println("Saya Dosen");
    }
}
// Kelas Mahasiswa merupakan turunan dari kelas Manusia, menambahkan properti nim dan kelas
class Mahasiswa extends Manusia{
    private String nim;
    private String kelas;
    
    // Getter untuk mendapatkan nilai nim
    public String getNim(){
        return nim;
    }
    
    // Setter untuk mengatur nilai nim
    public void setNim(String nim){
        this.nim = nim;
    }
    
    // Getter untuk mendapatkan nilai kelas
    public String getKelas(){
        return kelas;
    }
    
    // Setter untuk mengatur nilai kelas
    public void setKelas(String kelas){
        this.kelas = kelas;
    }
    
    // Metode untuk menampilkan informasi kelas mahasiswa
    public void kelasApa(){
        System.out.println("Saya Nindi umur 17 tahun sedang belajar di kelas PBO2");
    }
    
    // Metode yang menggantikan metode siapaKamu() dari kelas Manusia
    @Override
    public void siapaKamu(){
        System.out.println("Saya Mahasiswa");
    }
    
}

// kelas utama yang berisi method main untuk menjalankan program
public class PBOLat52{
    
    public static void main(String[] args) {
        // Membuat objek Dosen
        Dosen d = new Dosen();
        System.out.println("NIP DOSEN : 41227829930");
        d.siapaKamu();
        d.mengajarApa();
        
        // // Membuat objek Mahasiswa
        Mahasiswa m = new Mahasiswa();
        System.out.println("\nNIM MAHASISWA : 10110269");
        m.siapaKamu();
        m.kelasApa();
    }
    
}

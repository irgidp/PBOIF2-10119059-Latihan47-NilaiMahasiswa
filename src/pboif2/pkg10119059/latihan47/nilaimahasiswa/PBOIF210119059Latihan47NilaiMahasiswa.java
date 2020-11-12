/* 
* @author
 * NAMA        : Irgi Dwiputra
 * KELAS       : IF-2
 * NIM         : 10119059
 * Deskripsi   : Program ini berisi menampilkan Nilai Mahasiswa
 */
package pboif2.pkg10119059.latihan47.nilaimahasiswa;
/**
 *
 * @author Corazon
 */
public class PBOIF210119059Latihan47NilaiMahasiswa {

    public static void main(String[] args) {
        Nilai nilai = new Nilai();
        
        nilai.setQuis(90);
        System.out.println("Quis = " +nilai.getQuis());
        nilai.setUts(80);
        System.out.println("UTS = " +nilai.getUts());
        nilai.setUas(90);
        System.out.println("UAS = " +nilai.getUas());
        
        System.out.println("");
        System.out.println("Nilai Akhir = " +nilai.nilaiAkhir());
        System.out.println("Indeks      = " +nilai.index());
        System.out.print("Keterangan  = " );
        nilai.aturanKeterangan(nilai.index());
    }
    
}

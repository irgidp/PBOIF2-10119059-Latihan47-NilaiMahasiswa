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
public class Nilai {
    private double quis;
    private double uts;
    private double uas;
    
    public double getQuis(){
        return quis;
    }
    
    public void setQuis(double quis){
        this.quis = quis;
    }
    
    public double getUts(){
        return uts;
    }
    
    public void setUts(double uts){
        this.uts = uts;
    }
    
    public double getUas(){
        return uas;
    }
    
    public void setUas(double uas){
        this.uas = uas;
    }
    
    public double nilaiAkhir(){
        return (getQuis()*0.2) + (getUts()*0.3) + (getUas()*0.5);
    }
    
    
    public char index(){
    char indeks;
    if ((nilaiAkhir()>=80)) {
        indeks = 'A';
    } else if ((nilaiAkhir()>=68) && (nilaiAkhir()<80)){
        indeks = 'B';
    } else if ((nilaiAkhir()>=56) && (nilaiAkhir()<68)){
        indeks = 'C';
    } else if ((nilaiAkhir()>=45) && (nilaiAkhir()<56)){
        indeks = 'D';
    } else {
        indeks = 'E';
    }
    return indeks;
        }
    
    
    public void aturanKeterangan(char indeks){
        switch(indeks){
            case 'A':
                System.out.println("Sangat Baik");
                break;
            case 'B':
                System.out.println("Baik");
                break;
            case 'C':
                System.out.println("Sangat Baik");
                break;
            case 'D':
                System.out.println("Kurang");
                break;
            default:
                System.out.println("Sangat Kurang");
                break;
        }
    }
}

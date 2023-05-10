
package PL1;

/**
 *
 * @author farra
 */
//1. Membuat sebuah class dengan nama Mobil
class Mobil {
//2. Memberi variabel dan tipe data dari class tersebut
    String Tipe, merek, NoPolisi;
    int BiayaParkir, JangkaParkir;
//3. Lalu membuat konstruktor tanpa parameter dan satu parameter   
    Mobil(){
    }    
    Mobil(int BiayaParkir){       
    }
//4. Selanjutnya membuat method agar class dapat melakukan aksi dan dapat di panggil di class selanjutnya. Seperti membuat nama 
//   programnya, info mobil, dan total biaya yang harus dibayarkan 
    String tampil(){
        return "Menentukan Biaya Parkir Mobil";
    }
    void infoMobil(String Tipe,String merek, String NoPolisi, int BiayaParkir, int JangkaParkir){
        System.out.println("Tipe Mobil \t: " + Tipe + "\nMerek Mobil \t: " + merek + 
                "\nNomor Polisi \t: " + NoPolisi + "\nLama Parkir \t: " + JangkaParkir + "Jam" +
                "\nBiaya parkir \t: " + BiayaParkir + "Rp");
    }
    int Bayar(int BiayaParkir, int JangkaParkir){
        int total = (BiayaParkir*JangkaParkir);
        return total;
    }   
}  
        
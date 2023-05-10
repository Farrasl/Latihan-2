
package PL1;

/**
 *
 * @author farra
 */
//5. Membuat class baru agar dapat memanggil konstruktor dan method yang sudah dideklarasikan sebelumnya
class CobaMobil {
    public static void main(String[] args) {
//6. Panggil class sebelumnya dengan cara : nama class sebelumnya variabel = new nama class sebelumnya{);
        Mobil cth = new Mobil();
//7. Terakhir panggil semua method yang sudah di buat di class sebelumnya dan inputkan sesuai dengan parameter yang diinginkan          
        System.out.println(cth.tampil());        
        cth.infoMobil("SUV", "Honda HRV", "BM 1234 TIF", 5000, 2);
        int total = cth.Bayar(5000, 2);
        System.out.println("Total \t\t: " + total + "Rp");
    }
}

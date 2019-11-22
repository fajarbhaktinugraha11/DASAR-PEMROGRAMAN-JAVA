/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kambing;

/**
 * @author 
 * Nama : fajar bhakti nugraha 
 * KELAS : TI-1C
 * NIM : A2.1900062
 */
public class kambing {

    public void tambahKambing(){
        //Deklarasi variable lokal
        int jumlahKambing = 0;
        
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah kambing setelah ditambah: " + jumlahKambing);
    
    }
    public static void main(String[] args) {
        kambing kambingJantan = new kambing();
        kambingJantan.tambahKambing();
        
    }
}

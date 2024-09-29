public class Main {
    public static void main(String[] args) {

        PesawatTempur pesawat = new PesawatTempur("Merah");
        pesawat.infoPesawat();
        pesawat.nyalakanMesin();
        pesawat.terbang();
        pesawat.tambahKecepatan(200);
        pesawat.kurangiKecepatan(100);
        pesawat.belok("Barat");
        pesawat.infoPesawat();
        pesawat.kurangiKecepatan(50);
        pesawat.turun();
        pesawat.infoPesawat();
    }    
}


/**
 * @author
 * Nim  : 10116430
 * Nama : Wisnu Bayu Aji
 * Kelas: IF-2
 */
public class App {
    public static void main(String[] args) throws Exception {
        int detik, menit, jam, hari, bulan, tahun;
        GregorianCalendar date = new GregorianCalendar();
        String namabulan[] = { "Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September",
                "Oktober", "November", "Desember" };
        detik = date.get(Calendar.SECOND);
        menit = date.get(Calendar.MINUTE);
        jam = date.get(Calendar.HOUR_OF_DAY);
        hari = date.get(Calendar.DAY_OF_MONTH);
        bulan = date.get(Calendar.MONTH);
        tahun = date.get(Calendar.YEAR);
        System.out.println("Hari ini adalah hari : " + hari + " " + namabulan[bulan] + " " + tahun + " " 
            + jam + ":" + menit + ":" + detik);
    }
}
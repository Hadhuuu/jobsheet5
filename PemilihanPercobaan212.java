import java.util.Scanner;

public class PemilihanPercobaan212 {

    public static void main(String[] args) {
        Scanner input12 = new Scanner(System.in);
        System.out.print("Nilai uas     : ");
        float uas = input12.nextFloat();
        System.out.print("Nilai uts     : ");
        float uts = input12.nextFloat();
        System.out.print("Nilai kuis    : ");
        float kuis = input12.nextFloat();
        System.out.print("Nilai tugas   : ");
        float tugas = input12.nextFloat();

        float total = (uas*0.4F) + (uts*0.3F) + (kuis*0.1F) + (tugas*0.2F);
        String message = total < 65 ? "Remidi" : "Tidak remidi";
        //System.out.println("Nilai akhir =" + total + " sehingga" + message);

        if (total>80) {
            System.out.print("Nilai Akhir =" + total + " Sehingga mendapatkan A dan" + message);
        } 
        else if (total>73) {
            System.out.print("Nilai Akhir =" + total + " ehingga mendapatkan B+ dan " + message);
        } else if (total>65) {
            System.out.print("Nilai Akhir =" + total + " Sehingga mendapatkan B dan " + message);
        } else if (total>60) {
            System.out.print("Nilai Akhir =" + total + " Sehingga mendapatkan C+ dan " + message);
        } else if (total>50) {
            System.out.print("Nilai Akhir =" + total + " Sehingga mendapatkan C dan " + message);
        } else if (total>39) {
            System.out.print("Nilai Akhir =" + total + " Sehingga mendapatkan D dan " + message);
        } else {
            System.out.print("Nilai Akhir =" + total + " Sehingga mendapatkan E dan " + message);
        } 
    }
}
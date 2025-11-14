import java.util.Scanner;

public class nilaiKelompok {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i = 1;
        int nilai;
        float totalNilai, rataNilai;
        float rt = 0; 
        int kt = 0;   

        while (i <= 3) {
            System.out.println("Kelompok " + i);
            totalNilai = 0;

            for (int j = 1; j <= 5; j++) {
                System.out.print("Nilai dari kelompok penilai " + j + ": ");
                nilai = s.nextInt();
                totalNilai += nilai;
            }

            rataNilai = totalNilai / 5;
            System.out.println("Kelompok " + i + " Nilai rata-rata = " + rataNilai);

            if (rataNilai > rt) {
                rt = rataNilai;
                kt = i;
            }

            i++;
            System.out.println("----------------------------");
        }

        System.out.println("Kelompok dengan rata-rata tertinggi adalah: " + kt + " (" + rt + ")");
    }
}

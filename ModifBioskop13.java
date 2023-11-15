import java.util.Scanner;

public class ModifBioskop13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] penonton = new String [4][2];
        
        penonton[0][0] = "Amin";
        penonton[0][1] = "Bena";
        penonton[1][0] = "Candra";
        penonton[1][1] = "Dela";
        penonton[2][0] = "Eka";
        penonton[2][1] = "Farhan";
        penonton[3][0] = "Gisel";

        // Modifikasi langkah 4
        System.out.println(penonton.length);

        for (int i = 0; i < penonton.length; i++) {
            System.out.println("Panjang baris ke-" + (i+1) + ": " + penonton[i].length);
        }
        // Modifikasi langkah 5
        System.out.println(penonton.length);

        for (String[] barisPenonton : penonton) {
            System.out.println("Panjang baris: " + barisPenonton.length);
        }
        // Tambahan Kode perintah
        System.out.println("Penonton pada baris ke-3: ");

        for (int i = 0; i < penonton.length; i++) { // Modifikasi langkah soal 11
            System.out.println("Penonton pada baris ke-" + (i+1) + ": " + String.join(", ", penonton[i]));
        }
        System.out.println(penonton.length);
        System.out.println(penonton[0].length);
        System.out.println(penonton[1].length);
        System.out.println(penonton[2].length);
        System.out.println(penonton[3].length);

        sc.close();
    }
}
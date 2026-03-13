import java.util.Scanner;

public class MainStudent {
    public static void main(String[] args) {
        //Agar user dapat memberikan input, soal nomor 4
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah siswa: ");
        int jmlSiswa = input.nextInt();
        input.nextLine();
        //Menggunakan array
        Student[] siswa = new Student[jmlSiswa];
        //Melakukan looping sebanyak jumlah siswa
        for (int i =  0; i < jmlSiswa; i++) {
            System.out.println("Data siswa ke-" + (i + 1));

            System.out.print("Nama: ");
            String name = input.nextLine();
            System.out.print("Alamat: ");
            String address = input.nextLine();
            System.out.print("Umur: ");
            int age = input.nextInt();
            input.nextLine();
            System.out.print("Nilai Matematika: ");
            double math = input.nextDouble();
            System.out.print("Nilai Bahasa Inggris: ");
            double english = input.nextDouble();
            System.out.print("Nilai IPA/Sains: ");
            double science = input.nextDouble();
            input.nextLine();

            siswa[i] = new Student(name, address, age);
            siswa[i].setMath((int) math);
            siswa[i].setEnglish((int) english);
            siswa[i].setScience((int) science);
        }
        System.out.println("===== DATA SISWA =====");
        for (int i = 0; i < jmlSiswa; i++) {
            System.out.println("Siswa ke-" + (i+1));
            siswa[i].displayMessage();
            System.out.println("=====================");
        }
        input.close();
    }
}

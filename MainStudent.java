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

//        //siswa dengan nama anna dirubah informasi alamat dan umurnya melalui constructor
//        System.out.println("==================");
//        anna = new Student("anna", "Batu", 18);
//        anna.displayMessage();
//
//        //siswa dengan nama chris dirubah informasi alamat dan umurnya melalui method
//        System.out.println("==================");
//        chris.setAddress("Surabaya");
//        chris.setAge(22);
//        chris.displayMessage();

//        Student anna = new Student();
//        anna.setName("Anna");
//        anna.setAddress("Malang");
//        anna.setAge(20);
//        anna.setMath(100);
//        anna.setScience(89);
//        anna.setEnglish(80);
//        anna.displayMessage();
//
//        //menggunakan constructor lain
//        System.out.println("==================");
//        Student chris = new Student("Chris", "Kediri", 21);
//        chris.setMath(70);
//        chris.setScience(60);
//        chris.setEnglish(90);
//        chris.displayMessage();
//
//        //Menggunakan constructor dari soal no.2
//        Student hera = new Student(88, 90, 80);
//        System.out.println("==================");
//        hera.setName("Hera");
//        hera.setAddress("Surabaya");
//        hera.setAge(20);
//        hera.displayMessage();


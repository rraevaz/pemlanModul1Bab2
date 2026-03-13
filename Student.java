public class Student {
    private String name;
    private String address;
    private int age;
    private double mathGrade;
    private double englishGrade;
    private double scienceGrade;
    private double average;
    private static int count;
    public Student () {
        name = "";
        address = "";
        age = 0;
        count++;
    }
    public Student(String n, String a, int ag) {
        name = n;
        address = a;
        age = ag;
        count++;
    }
    //constructor untuk soal no.2
    public Student(double math, double english, double science) {
        mathGrade = math;
        englishGrade = english;
        scienceGrade = science;
        count++;
    }
    public void setName(String n) {
        name = n;
    }
    public void setAddress(String a) {
        address = a;
    }
    public void setAge(int ag) {
        age = ag;
    }
    public void setMath(int math) {
        mathGrade = math;
    }
    public void setEnglish(int english) {
        englishGrade = english;
    }
    public void setScience(double science) {
        scienceGrade = science;
    }
    public double getAverage() {
        double result = 0;
        result = (mathGrade + scienceGrade + englishGrade) / 3;
        return result;
    }
    //Method untuk soal nomor 3
    public boolean statusAkhir() {
        if (getAverage() >= 61) {
            return true;
        } else {
            return false;
        }
    }
    public void jumlahObjek() { //Menghitung banyak objek yang telah dibuat
        System.out.println("Jumlah objek yang telah dibuat adalah " + count);
    }
    public void displayMessage() {
        System.out.println("Siswa dengan nama " + name);
        System.out.println("beralamat di " + address);
        System.out.println("berumur " + age);
        System.out.printf("mempunyai nilai rata-rata %.2f\n", getAverage());
        if (statusAkhir()) { //Untuk menampilkan statusAkhir pada display
            System.out.println("Siswa lolos dan tidak perlu melakukan remidi");
        } else {
            System.out.println("Siswa harus melalukan remidi");
        }
        jumlahObjek(); //memanggil method untuk menghitung banyak objek
    }
}

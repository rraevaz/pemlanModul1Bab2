public class RasionalDemo {
    public static void main(String[] args) {
        Rasional R1 = new Rasional(1,2);
        Rasional R2 = new Rasional(1,3);

        System.out.println("R1.isRasional: " + R1.isRasional());
        System.out.println("R2.isRasional: " + R2.isRasional()); //awalnya R1
        System.out.println();

        System.out.println("R1 > R2 : " + R1.moreThan(R2));
        System.out.println("R1 < R2 : " + R1.lessThan(R2)); //Soal nomor 2
        System.out.println("R1 <= R2 : " + R1.lessOrEquals(R2));
        System.out.println("R1 => R2 : " + R1.moreOrEquals(R2) + "\n");

        System.out.print("R1 : ");
        R1.cetak();
        System.out.print("R2 : ");
        R2.cetak();
        System.out.println();

        R1.sederhana();
        R2.sederhana();

        System.out.print("R1 : ");
        R1.cetak();
        System.out.print("R2 : ");
        R2.cetak();
        System.out.println();

        System.out.println("Setelah dilakukan cast ke double menjadi : ");
        System.out.println("R1 : " + R1.cast());
        System.out.println("R2 : " + R2.cast());
        System.out.println();

        R1.negasi();
        System.out.print("Unary- dari R1 : ");
        R1.cetak();
        System.out.println();

        R1.unaryPlus(R2);
        R1.sederhana();
        System.out.print("Nilai dari 'R1 += R2' : ");
        R1.cetak();
        //Mencetak method nomor 4
        R1.unaryMin(R2);
        R1.sederhana();
        System.out.print("Nilai dari 'R1 -= R2' : " );
        R1.cetak();

        R1.multiplied(R2);
        R1.sederhana();
        System.out.print("Nilai dari 'R1 * R2' : ");
        R1.cetak();

        R1.dividedBy(R2);
        R1.sederhana();
        System.out.print("Nilai dari 'R1 / R2' : ");
        R1.cetak();
    }
}
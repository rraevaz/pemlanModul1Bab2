public class Rasional {
    private int pembilang, penyebut;
    public Rasional() {
        pembilang = 0;
        penyebut = 1;
    }
    public Rasional(int pbl, int pyb) {
        pembilang = pbl;
        penyebut = pyb;
    }
    //mengecek suatu bilangan adalah rasional atau bukan
    public boolean isRasional() {
        return (penyebut!= 0);
    }
    //menyederhanakan bilangan rasional
    public void sederhana() {
        int temp, A, B;
        if (penyebut == 0) {
            return;
        }
        if (penyebut < 0) { //agar simbol minus tidak berada di penyebut
            pembilang = -pembilang;
            penyebut = -penyebut;
        }
        A = Math.abs(pembilang);
        B = Math.abs(penyebut);

        //mengubah while menjadi for (Soal nomor 3)
        for ( ; B != 0; A = B, B = temp) {
            temp = A % B;
        }
        pembilang /=A;
        penyebut /=A;
    }
    public double cast() {
        return (penyebut==0.0) ? 0.0 : (double)pembilang / (double)penyebut;
    }
    //operator >
    public boolean moreThan (Rasional A) {
        return (pembilang * A.penyebut > penyebut * A.pembilang);
    }
    //Operator < (Soal nomor 2)
    public boolean lessThan (Rasional A) {
        return (pembilang * A.penyebut < penyebut * A.pembilang);
    }
    //Operator <= (Soal nomor 2)
    public boolean lessOrEquals (Rasional A) {
        return (pembilang * A.penyebut <= penyebut * A.pembilang);
    }
    //Operator => (Soal nomor 2)
    public boolean moreOrEquals (Rasional A) {
        return (pembilang * A.penyebut >= penyebut * A.pembilang);
    }
    //operator Unary- ---> A = -A
    public void negasi () {
        pembilang = - pembilang;
    }
    //operator unary += \
    public void unaryPlus(Rasional A) {
        pembilang = pembilang * A.penyebut + penyebut * A.pembilang;
        penyebut *= A.penyebut;
    }
    //Operator unary -= (Soal nomor 4)
    public void unaryMin(Rasional A) {
        pembilang = pembilang * A.penyebut - penyebut * A.pembilang;
        penyebut *= A.penyebut;
    }
    //Operator * (Soal nomor 4)
    public void multiplied(Rasional A) {
        pembilang = pembilang * A.pembilang;
        penyebut *= A.penyebut;
    }
    //Operator / (Soal nomor 4)
    public void dividedBy(Rasional A) {
        pembilang = pembilang * A.penyebut;
        penyebut = penyebut * A.pembilang;
    }
    public void cetak() {
        System.out.println(pembilang + "/" + penyebut);
    }
}

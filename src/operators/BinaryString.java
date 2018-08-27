package operators;

public class BinaryString {
    static  long i = 0x2f;
    static  long i2 = 0177;

    public static void main(String[] args){
        System.out.println("i = " + Long.toBinaryString(i));
        System.out.println("i2 = " + Long.toBinaryString(i2));
    }
}
// шестнадцатиричные и восьмиричные данные используются с типом long. Для выводы результатов используется метод Long.toBinaryString()
public class Exercise2 {
    public static void main(String[] args) {
        //convert char to integer
        char c = 'z';
        int cI = c;
        System.out.println(cI);

        //convert int to long and long to short
        int i = 250;
        long iL = (long) i;
        System.out.println(iL);
        short iS = (short) iL;
        System.out.println(iS);

        //convert double to long
        double d = 301.067;
        long dL = (long) d;
        System.out.println(dL);

        //convert int to float
        int i2 = 100;
        float i2F = i2 + 5000.66F;
        System.out.println(i2F);

        //convert int to byte
        int i3 = 737;
        byte i3B = (byte) (i3 * 100);
        System.out.println(i3B);

        //convert double to long
        double d2 = 298.68;
        long d2L = (long) (d2 /25);
        System.out.println(d2L);
    }
}

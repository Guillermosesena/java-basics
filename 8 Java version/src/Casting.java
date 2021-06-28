public class Casting {
    public static void main(String[] args){
        //30 dogs per year
        //How many dogs were relocated?
        double monthlyDogs = 30.0/12.0;
        System.out.println(monthlyDogs);

        //Estimation, the value is truncated
        int estimatedMothlyDogs = (int) monthlyDogs;
        System.out.println(estimatedMothlyDogs);

        //Accuracy
        int a = 30;
        int b = 12;

        System.out.println((double) a/b);

        //automatic casting (implicit casting) int/int -> int
        double c = a /b;//2
        System.out.println(c);

        c = (double) a/b; //2.5
        System.out.println(c);

        // '1' -> decimal ASCII 49
        char n = '1';
        int nl = n;
        System.out.println(nl);

        short nS = (short) n;
        System.out.println(nS);
    }
}

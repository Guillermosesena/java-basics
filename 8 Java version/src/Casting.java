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
    }
}

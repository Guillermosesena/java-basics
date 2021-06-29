public class LogicalOperators {
    public static void main(String[] args) {
        int a = 8;
        int b = 5;
        //comparison operators
        System.out.println("Is a equal to b? " + (a == b));
        System.out.println("Is a different to b? " + (a != b));

        //relational operators
        /*System.out.println("Is a greater than b? " + (a > b));
        System.out.println("Is a less than b? " + (a < b));
        System.out.println("Is a greater than or equal to b? " + (a >= b));
        System.out.println("Is a less than or equal to b? " + (a <= b));*/

        if (a == b) {
            System.out.println("A is equal to b");
        } else if (a != b) {
            System.out.println("A is different to B");
        } else if (a > b) {
            System.out.println("A is greater than B");
        } else if (a < b) {
            System.out.println("A is less than B");
        } else if (a >= b) {
            System.out.println("A is greater than or equal to B");
        } else if (a <= b) {
            System.out.println("A is less than or equal to B");
        }
    }
}

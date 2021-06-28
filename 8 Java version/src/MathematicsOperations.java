public class MathematicsOperations {
    public static void main(String[] args){
        double x = 2.1;
        double y = 3;

        //rounds the specified double value upward
        System.out.println(Math.ceil(x));

        //rounds the specified double value downward
        System.out.println(Math.floor(x));

        //returns the base to the exponent power
        System.out.println(Math.pow(x,y));

        //return the greatest number
        System.out.println(Math.max(x,y));

        //return square root
        System.out.println(Math.sqrt(x));

        //circle area
        //pi * r^2
        System.out.println(Math.PI * Math.pow(y,2));

        //sphere area
        //4*PI*r^2
        System.out.println(4*Math.PI * Math.pow(y,2));

        //sphere area
        //(4/3)*PI*r^3
        System.out.println((4/3) * Math.PI * Math.pow(y,3));
    }
}

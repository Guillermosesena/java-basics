public class Functions {


    public static void main(String[] args) {
        double y = 3 ;

        double area = circleArea(y);
        System.out.println(area);

        double area_ = sphereArea(y);
        System.out.println(area_);

        double volume = sphereVolume(y);
        System.out.println(volume);

        System.out.println("Pesos to dollars: " + convertToDollar(200.0,"MXN"));

    }
    /**
     * Description: Function to obtain the area of a circle
     *
     * @param r Radius of a circle
     * @return Return the area of a circle
     * */
    public static double circleArea(double r) {
        return Math.PI * Math.pow(r,2);
    }

    /**
     * Description: Function to obtain the area of a sphere
     *
     * @param r Radius of a sphere
     * @return Return the area of a sphere
     * */
    public static double sphereArea(double r) {
        return 4*Math.PI * Math.pow(r,2);
    }

    /**
     * Description: Function to obtain the volume of a sphere
     *
     * @param r Radius of a sphere
     * @return Return the volume of a sphere
     * */
    public static double sphereVolume(double r) {
        return Math.pow(r,3)* Math.PI * (4.0/3.0);
    }


    /**
     * Description: Function that converts mexican/colombian pesos to dollars
     *
     * @param quantity Amount of money to convert to dollar
     * @param currency Currency to convert. Only available for Mexican and Colombian pesos
     * @return quantity Return the dollar amount
     * */
    public static double convertToDollar(double quantity, String currency)
    {
        switch (currency){
            case "MXN":
                quantity = quantity * 0.0504;
                break;
            case "COP":
                quantity = quantity * 0.00027;
                break;

        }
        return quantity;
    }
}

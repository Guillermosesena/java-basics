public class WhileLoop {
    static boolean  isTurnOnLight = false;

    public static void main(String[] args) {

        turnOffLight();

        int i = 1;
        while(isTurnOnLight && i<=100) {
            printSOS();
            i++;
        }
    }

    /**
     * Description: Function that prints SOS in morse code
    **/
    public static void printSOS(){
        System.out.println("...___...");
    }
    /**
     * Description: Function that turns on/off the light
     * @return Return the state (on or off) of the light
     * */
    public static boolean turnOffLight(){
        isTurnOnLight = (isTurnOnLight)?false:true;
        return isTurnOnLight;
    }
}

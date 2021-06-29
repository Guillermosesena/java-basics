public class Switch {
    public static void main(String[] args){
        String colorModeSelected = "Dark";

        switch(colorModeSelected){
            case "Light":
                System.out.println("You selected the Light Mode");
                break;
            case "Night":
                System.out.println("You selected the Night Mode");
                break;
            case "Blue Dark":
                System.out.println("You selected the Blue Dark Mode");
                break;
            case "Dark":
                System.out.println("You selected the Dark Mode");
                break;
            default:
                System.out.println("You have to select a valid option");

        }
    }
}

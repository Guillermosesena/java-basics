import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        int response;

        do{
            System.out.println("Select the number of the option tha you prefer");
            System.out.println("1. Movies");
            System.out.println("2. Series");
            System.out.println("0. Exit");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 0:
                    System.out.println("Thanks for your visit");
                    break;
                case 1:
                    System.out.println("Movies");
                    break;
                case 2:
                    System.out.println("Series");
                    break;
                default:
                    System.out.println("Select a valid option");
            }
        }
        while(response !=0 );
        System.out.println("Bye");
    }
}

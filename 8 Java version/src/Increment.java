public class Increment {
    public static void  main(String[] args){
        int lives = 5;
        lives = lives -1;
        System.out.println(lives);//4

        //post decrement operator
        lives--;
        System.out.println(lives);//3

        //post increment operator
        lives++;
        System.out.println(lives);//4

        //post increment
        int gift = 100 + lives++;
        System.out.println(gift);//104
        System.out.println(lives);//5

        //pre increment
        gift = 100 + ++ lives;
        System.out.println(gift);//106
        System.out.println(lives);//6

    }
}

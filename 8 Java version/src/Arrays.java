public class Arrays {
    public static void main(String[] args) {
        String[] androidVersions = new String[17];
        String days [] = new String[17];

        String[][] cities = new String[4][2];//4*2 =8
        /*
        * Country   City
        * México    CDMX
        * México    Guadalajara
        * Colombia  Bogotá
        * Colombia  Medellín
        **/
        int [][][] numbers = new int[2][2][2];
        int [][][][] numbers4 = new int[2][2][2][2];

        androidVersions[0] = "Apple pie";
        androidVersions[1] = "Banana Bread";
        androidVersions[2] = "Cupcake";
        androidVersions[3] = "Donut";

        for(int k=0; k<androidVersions.length; k++)
        {
            System.out.println("Android version: " + androidVersions[k]);
        }

        for (String androidVersion : androidVersions) {
            System.out.println(androidVersion);
        }

        cities[0][0]="México";
        cities[0][1]="CDMX";
        cities[1][0]="México";
        cities[1][1]="Guadalajara";
        cities[2][0]="Colombia";
        cities[2][1]="Bogotá";
        cities[3][0]="Colombia";
        cities[3][1]="Medellín";

        /*for(int i=0; i<4; i++)
        {
            System.out.println("Country: " + cities[i][0]+ " City:" + cities[i][1]);
        }*/

        /*for(int i=0; i< cities.length; i++)
        {
            for(int j=0; j < cities[i].length; j++)
            System.out.println(cities[i][j]);
        }*/

        for (String[] pair: cities) {
            for (String name: pair) {
                System.out.println(name);
            }
        }


        String[][][][] animals = new String[2][3][2][2];
        animals[1][0][0][1] = "Monkey";
        for(int i=0; i< animals.length; i++) {
            for (int j = 0; j < animals[i].length; j++) {
                for (int k=0; k<animals[i][j].length; k++) {
                    for(int m=0; m<animals[i][j][k].length; m++) {
                        System.out.println(animals[i][j][k][m]);
                    }
                }
            }
        }
    }
}

public class IfStatement {
    public static void main(String[] args) {
        boolean isBluetoothEnabled = false;
        int fileSended =3;

        if(isBluetoothEnabled == true)
        {
            //Send file
            fileSended++;
            System.out.println("File was send");
            int i =0;
            i++;
        }
        else
        {
            System.out.println("Turn on the Bluetooth");
        }
    }
}

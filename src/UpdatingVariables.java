public class UpdatingVariables {
        public static void main(String[] args){
            int salary = 1000;
            //bonus $200
            //udp
            salary = salary + 200;
            System.out.println(salary);

            //Pension discount
            salary = salary - 50;
            System.out.println(salary);

            //Extra hours $30
            //Food $45
            salary = salary + (30*2) - 45;
            System.out .println(salary);

            //Updating strings
            String employeeName = "Carlos Hernandez";
            employeeName = employeeName + " Sanchez";
            System.out.println(employeeName);
            employeeName= "Juan " + employeeName;
            System.out.println(employeeName);

        }
}

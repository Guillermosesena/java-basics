public class DataTypes {
    public static void main(String[] args) {
        //byte covers a range from -128 to 127
        //short covers a range from -32,768 to 32,767
        //int covers a range from -2,147,483,648 to 2,147,483,647
        //long covers a range from -9,223,372,036,854,775,808 to +9,223,372,036,854,775.807
        //float covers a range from1.40129846432481707e-45 to 3.40282346638528860e+38
        //double covers a range from 4.94065645841246544e-324d to 1.79769313486231570e+308d

        int n = 1234567890;
        //without L is assumed to be an int
        long nL = 12345678901L;

        double nD = 123.456;
        //without F is assumed to be an double
        float nF = 123.456F;

        var salary = 1000; //int
        //discount 3%
        var pension = salary * 0.03; //double
        var totalSalary = salary - pension; //double

        System.out.println(salary);
        System.out.println(pension);
        System.out.println(totalSalary);

        var employeeName = "Juan Hernandez";
        System.out.println("EMPLOYEE: " +employeeName + " SALARY: " + totalSalary);
    }
}

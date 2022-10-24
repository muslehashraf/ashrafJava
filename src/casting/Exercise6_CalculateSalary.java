package casting;

public class Exercise6_CalculateSalary {
    public static void main(String[] args) {

        String salary1 = "5000";
        String salary2 = "6000.25";
        String salary3 = "4000.50";
        /*
         Task 1
         Find min and max salary

        Expected output:
        Min salary = $4000.5
        Max salary = $6000.25
         */
        double d1 = Double.parseDouble(salary1);
        double d2 = Double.parseDouble(salary2);
        double d3 = Double.parseDouble(salary3);
        System.out.println("Min salary = $" + Math.min(Math.min(d1, d2), d3));
        System.out.println("Max salary = $" + Math.max(Math.max(d1, d2), d3));



        /*
        TASK-2
        Calculate the 10 present of the min salary
        expected output
        400.05
         */
        System.out.println((Math.min(Math.min(d1, d2), d3)) * 0.1);












    }
}

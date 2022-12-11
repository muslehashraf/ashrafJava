package singleton;

public class DriverTest {
    public static void main(String[] args) {

        //Driver driver1 = new Driver(); // compiler error as constructor is private

        //Driver driver2 = Driver.driver; // compiler error as instance variable is private

        //Only way to access the driver instance is through the public getter method
        Driver driver3 = Driver.getDriver();
        Driver driver4 = Driver.getDriver();
        Driver driver5 = Driver.getDriver();

        System.out.println(driver3); // Driver@29453f44
        System.out.println(driver4); // Driver@29453f44
        System.out.println(driver5); // Driver@29453f44

        //It is clearly seen above that all driver references are pointing the same object in the heap
    }
}
package AdapterPattern;

public class DatabaseRunner {
    public static void main(String[] args) {
        Database data1 = new AdapterJavaToDatabase(); {
        data1.insert();
        data1.select();
        data1.update();
        };
    }




}
public class App {
    public static void main(String[] args) throws Exception {

        double kilo = 1.609;


        System.out.printf("+------------------------+%n");
        System.out.printf("| Miles   | Kilometers    %n");
        System.out.printf("+------------------------+%n");
        for (int i = 1; i <= 10; i++) {
            
            System.out.printf("|%-9s|%-10.3f\n", i, ( i  * kilo) );
        }
        System.out.printf("+------------------------+%n");

    }
}

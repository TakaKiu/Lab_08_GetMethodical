class CtoFTableDisplay {
    public static void main(String[] args) {
        // Display the table header
        System.out.println("Celsius\t\tFahrenheit");
        System.out.println("---------------------------");

        // Display the Celsius to Fahrenheit conversion table
        for (int celsius = -100; celsius <= 100; celsius++) {
            double fahrenheit = CtoF(celsius);
            System.out.printf("%-8d\t%.2f%n", celsius, fahrenheit);
        }
    }

    public static double CtoF(double celsius) {
        return celsius * 9 / 5 + 32;
    }
}
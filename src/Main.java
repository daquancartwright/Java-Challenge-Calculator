public class Main {
    public static void main(String[] args) {

        // Create an instance of the Calculator Class
        Calculator calculator = new Calculator();

        // Perform a calculation
        calculator.setOperandOne(117);
        calculator.setOperation("+");
        calculator.setOperandTwo(10);
        calculator.performOperation();

        // Get and print the result
        double result = calculator.getResults();
        System.out.println("Result: " + result);

    }
}
public class Calculator {

    // Declare variables
    private double operandOne;
    private double operandTwo;
    private String operation;
    private double result;

    // Set the first operand
    public void setOperandOne(double operand) {
        this.operandOne = operand;
    }

    // Set the second operand
    public void setOperandTwo(double operand) {
        this.operandTwo = operand;
    }

    // Set the operation
    public void setOperation(String operation) {
        // Check if the operation is either "+" or "-"
        if (operation.equals("+") || operation.equals("-")) {
            this.operation = operation;
        } else {
            // If an invalid operation is provided, display an error message
            System.out.println("Invalid operation. Please use '+' or '-'.");
        }
    }

    // Perform the selected operation
    public void performOperation() {
        if (operation.equals("+")) {
            result = operandOne + operandTwo;
        } else if (operation.equals("-")) {
            result = operandOne - operandTwo;
        }
    }

    // Get results
    public double getResults() {
        return result;
    }

}

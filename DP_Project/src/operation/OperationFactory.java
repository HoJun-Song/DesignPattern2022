package operation;

public class OperationFactory {
    public Operation create(String type) {
        Operation operation = null;
        switch (type) {
            case "+":
                operation = new Addition();
                break;
            case "-":
                operation = new Subtraction();
                break;
            case "*":
                operation = new Multiplication();
                break;
            case "/":
                operation = new Division();
                break;
        }
        return operation;
    }
}

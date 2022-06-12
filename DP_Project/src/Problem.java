import Information.Information;
import operation.Operation;
import operation.OperationFactory;

public class Problem {
    private String operation;
    private Information info;
    private String content;
    private float answer;

    public Problem(Information info, String operation) {
        this.info = info;
        this.operation = operation;
    }

    public void makeProblem() {
        OperationFactory opFactory = new OperationFactory();
        Operation op = opFactory.create(operation);
        content = op.makeContent(info);
        answer = op.calculateAnswer();
    }

    public String getContent() {
        return content;
    }
    public float getAnswer() {
        return answer;
    }
}

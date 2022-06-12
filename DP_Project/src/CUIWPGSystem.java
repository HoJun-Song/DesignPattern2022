public class CUIWPGSystem implements WPGSystem {
    public static final CUIWPGSystem singleton = new CUIWPGSystem();
    private Workbook workbook;

    @Override
    public void createWorkBook() {
        workbook = new Workbook();
        workbook.createProblems();
    }

    @Override
    public void solveWorkBook() {
        workbook.solveProblems();
    }
}

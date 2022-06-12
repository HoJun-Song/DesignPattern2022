public class WPG {
    private WPGSystem wpgSystem;
    private String version;

    public WPG(String version) {
        this.version = version;
        wpgSystem = getSystem();
    }
    private WPGSystem getSystem() {
        if (wpgSystem == null) {
            if (version == "cui") {
                wpgSystem = CUIWPGSystem.singleton;
            }
        }
        return wpgSystem;
    }
    public void run() {
        wpgSystem.createWorkBook();
        wpgSystem.solveWorkBook();
    }
}

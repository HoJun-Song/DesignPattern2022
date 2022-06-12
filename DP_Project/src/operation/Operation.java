package operation;

import Information.Information;

public interface Operation {
    String makeContent(Information info);
    void setValues(Information info);
    float calculateAnswer();
}

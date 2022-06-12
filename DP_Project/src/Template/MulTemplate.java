package Template;

import java.util.ArrayList;

public class MulTemplate implements Template {
    private ArrayList<String> templates;

    public MulTemplate() {
        templates = new ArrayList<String>();
        templates.add("(이름)은 (숫자1)개의 (항목)을 (숫자2)묶음 가지고 있습니다.\n " +
                "(이름)은 전부 (항목)이 몇 개입니까?");
    }

    @Override
    public ArrayList<String> getTemplate() {
        return templates;
    }
}

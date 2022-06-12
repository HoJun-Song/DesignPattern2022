package Template;

import java.util.ArrayList;

public class DivTemplate implements Template {
    private ArrayList<String> templates;

    public DivTemplate() {
        templates = new ArrayList<String>();
        templates.add("(이름)은 (항목)을 (숫자1)개 가지고 있습니다. (성별)는 (숫자2)명의 친구에게 똑같이 나누어 주고 싶습니다.\n " +
                "각각 (항목)을 몇 개씩 가지게 되나요?");
    }

    @Override
    public ArrayList<String> getTemplate() {
        return templates;
    }
}

package Template;

import java.util.ArrayList;

public class AddTemplate implements Template{
    private ArrayList<String> templates;

    public AddTemplate() {
        templates = new ArrayList<String>();
        templates.add("(이름1)은 (항목)을 (숫자1)개 가지고 있습니다. (이름2)은 (항목)을 (숫자2)개 가지고 있습니다.\n " +
                "그들이 가지고 있는 (항목)은 모두 몇 개입니까?");
    }

    @Override
    public ArrayList<String> getTemplate() {
        return templates;
    }
}

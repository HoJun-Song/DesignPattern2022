package Template;

import java.util.ArrayList;

public class SubTemplate implements Template{
    private ArrayList<String> templates;

    public SubTemplate() {
        templates = new ArrayList<String>();
        templates.add("(이름1)은 (항목)을 (숫자1)개 가지고 있습니다. (이름1)은 (이름2)에게 (항목) (숫자2)개를 주었습니다.\n " +
                "(이름1)에게 몇 개의 (항목)가 남았습니까?");
    }

    @Override
    public ArrayList<String> getTemplate() {
        return templates;
    }
}

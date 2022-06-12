package operation;

import Information.Information;
import Information.Person;
import Template.DivTemplate;
import Template.Template;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Division implements Operation {
    private ArrayList<Person> people;
    private ArrayList<Integer> values;
    public Division(){
        people = new ArrayList<Person>();
        values = new ArrayList<Integer>();
    }

    @Override
    public String makeContent(Information info) {
        Template template = new DivTemplate();
        ArrayList<String> list = template.getTemplate();
        String sentence = list.get(0);

        setValues(info);
        sentence = sentence.replace("(이름)",people.get(0).name);
        sentence = sentence.replace("(항목)",info.getRandomItem());
        sentence = sentence.replace("(숫자1)",Integer.toString(values.get(0)));
        sentence = sentence.replace("(숫자2)",Integer.toString(values.get(1)));
        String gender = people.get(0).gender.equals("male") ? "그" : "그녀";
        sentence = sentence.replace("(성별)",gender);

        return sentence;
    }

    @Override
    public void setValues(Information info) {
        people.add(info.getRandomPerson());

        values.add(info.getRandomNum());
        int tmp = info.getRandomNum();
        while (tmp == 0) {
            tmp = info.getRandomNum();
        }
        values.add(tmp);
    }

    @Override
    public float calculateAnswer() {
        float result = ((float) values.get(0)) / values.get(1);
        DecimalFormat form = new DecimalFormat("0.00");
        return Float.parseFloat(form.format(result));
    }
}

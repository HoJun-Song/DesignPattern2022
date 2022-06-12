package operation;

import Information.Information;
import Information.Person;
import Template.SubTemplate;
import Template.Template;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Subtraction implements Operation{
    private ArrayList<Person> people;
    private ArrayList<Integer> values;
    public Subtraction(){
        people = new ArrayList<Person>();
        values = new ArrayList<Integer>();
    }

    @Override
    public String makeContent(Information info) {
        Template template = new SubTemplate();
        ArrayList<String> list = template.getTemplate();
        String sentence = list.get(0);

        setValues(info);
        sentence = sentence.replace("(이름1)",people.get(0).name);
        sentence = sentence.replace("(이름2)",people.get(1).name);
        sentence = sentence.replace("(항목)",info.getRandomItem());
        sentence = sentence.replace("(숫자1)",Integer.toString(values.get(0)));
        sentence = sentence.replace("(숫자2)",Integer.toString(values.get(1)));

        return sentence;
    }

    @Override
    public void setValues(Information info) {
        Person person1 = info.getRandomPerson();
        Person person2 = null;
        do {
            person2 = info.getRandomPerson();
        }while (person2.name.equals(person1.name));
        people.add(person1);
        people.add(person2);

        values.add(info.getRandomNum());
        int tmp = info.getRandomNum();
        while (values.get(0) <= tmp) {
            tmp = info.getRandomNum();
        }
        values.add(tmp);
    }

    @Override
    public float calculateAnswer() {
        float result = ((float) values.get(0)) - values.get(1);
        DecimalFormat form = new DecimalFormat("0.00");
        return Float.parseFloat(form.format(result));
    }
}

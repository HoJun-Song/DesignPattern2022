package Information;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class TextInputManager implements InputManager{
    private Scanner sc;
    public TextInputManager() {
        sc = new Scanner(System.in);
    }

    @Override
    public ArrayList<Person> inputImportantPeople() {
        ArrayList<Person> names = new ArrayList<Person>();
        System.out.println("학습자에게 중요한 사람들의 이름과 성별을 입력하세요.\nex. name1-male, name2-female");
        String input = sc.nextLine();
        input = input.replace(" ", "");
        String[] namesList = input.split(",");
        for (String pair : namesList) {
            String[] splitPair = pair.split("-");
            names.add(new Person(splitPair[0], splitPair[1]));
        }
        return names;
    }

    @Override
    public ArrayList<String> inputItem() {
        ArrayList<String> items = new ArrayList<String>();
        System.out.println("학습자가 관심을 갖고 있는 항목들의 이름을 입력하세요.\nex. item1, item2");
        String input = sc.nextLine();
        input = input.replace(" ", "");
        String[] itemsList = input.split(",");
        items.addAll(Arrays.asList(itemsList));
        return items;
    }

    @Override
    public ArrayList<String> inputOperation() {
        ArrayList<String> operations = new ArrayList<String>();
        System.out.println("연산의 종류를 하나 이상 입력하세요.\nex. *, +, /, -");
        String input = sc.nextLine();
        input = input.replace(" ", "");
        String[] inputList = input.split(",");
        Collections.addAll(operations, inputList);
        return operations;
    }

    @Override
    public int inputNumOfProblems() {
        int numOfProblems = 0;
        System.out.println("생성할 문제 수를 입력하세요.");
        String input = sc.nextLine();
        numOfProblems = Integer.parseInt(input);
        return numOfProblems;
    }

    @Override
    public int inputMinNum() {
        int min = 0;
        System.out.println("피연산자의 범위의 최솟값을 입력하세요.");
        String input = sc.nextLine();
        min = Integer.parseInt(input);
        return min;
    }

    @Override
    public int inputMaxNum() {
        int max = 0;
        System.out.println("피연산자의 범위의 최댓값을 입력하세요.");
        String input = sc.nextLine();
        max = Integer.parseInt(input);
        return max;
    }
}

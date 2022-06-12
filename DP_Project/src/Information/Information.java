package Information;

import java.util.ArrayList;
import java.util.Random;

public class Information {
    private ArrayList<String> operations;
    private ArrayList<Person> importantPeople;
    private ArrayList<String> items;
    private int numOfProblems;
    private int minNum;
    private int maxNum;

    public void inputInfo() {
        InputManager inputManager = new TextInputManager();
        importantPeople = inputManager.inputImportantPeople();
        items = inputManager.inputItem();
        operations = inputManager.inputOperation();
        numOfProblems = inputManager.inputNumOfProblems();
        minNum = inputManager.inputMinNum();
        maxNum = inputManager.inputMaxNum();
    }

    public Person getRandomPerson() {
        Random rand = new Random();
        int num = rand.nextInt(importantPeople.size());
        return importantPeople.get(num);
    }

    public String getRandomItem() {
        Random rand = new Random();
        int num = rand.nextInt(items.size());
        return items.get(num);
    }

    public int getRandomNum() {
        Random rand = new Random();
        int num = rand.nextInt(maxNum) + minNum;
        return num;
    }

    public ArrayList<String> getOperations() {
        return operations;
    }
    public int getNumOfProblems() {
        return numOfProblems;
    }
}

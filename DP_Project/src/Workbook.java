import Information.Information;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Workbook {
    private ArrayList<Problem> problems;

    public Workbook() {
        problems = new ArrayList<Problem>();
    }
    public void createProblems() {
        System.out.println("문제집을 생성 중입니다...");
        Information info = new Information();
        info.inputInfo();

        for (String operation : info.getOperations()) {
            for (int i = 0; i < info.getNumOfProblems(); i++) {
                problems.add(new Problem(info, operation));
            }
        }

        for (Problem problem : problems) {
            problem.makeProblem();
        }

        System.out.println("문제집 생성이 완료되었습니다.\n");
    }

    public void solveProblems() {
        Scanner sc = new Scanner(System.in);
        System.out.println("문제풀기를 시작합니다.");
        System.out.println("학생 본인의 이름을 입력하세요.");
        String student = sc.nextLine();

        while (true) {
            int score = 0;
            Collections.shuffle(problems);
            for (int i = 0; i < problems.size(); i++) {
                Problem p = problems.get(i);
                System.out.println((i + 1) + ". " + p.getContent());
                String input = sc.nextLine();
                input = input.replace(" ", "");
                float tmp = Float.parseFloat(input);
                DecimalFormat form = new DecimalFormat("0.00");
                float answer = Float.parseFloat(form.format(tmp));

                if (answer == (p.getAnswer())) {
                    System.out.println("정답입니다!!!\n");
                    score += 1;
                }
                else System.out.println("틀렸습니다...\n");
            }
            System.out.println(student + "의 점수는 " + score + "점입니다.");

            System.out.println("문제를 다시 푸시겠습니까? 프로그램을 종료하시려면 exit를 입력하세요.");
            String flag = sc.nextLine();
            if (flag.equals("exit")) break;
        }
        System.out.println("WPG Program을 종료합니다.");
    }
}

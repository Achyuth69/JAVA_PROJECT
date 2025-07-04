package project3;

import java.io.*;
import java.util.*;

public class KBC implements Interface{
    public double score = 0;
    public int a = 7;
    InputStreamReader reader = new InputStreamReader(System.in);
    BufferedReader input = new BufferedReader(reader);
    boolean lifelineUsed = false;

    @Override
    public void result() throws Exception {
        if (score == 0) {
            System.out.printf("Your performance is alarmingly weak!");
        } else if (score == 500000) {
            System.out.println("Congratulations!\nYou won 50,000,000$");
        } else {
            System.out.println("Better luck next time!!!");
        }
    }

    @Override
    public void display() {
        System.out.println("____________________");
        System.out.println("Hello! Everyone, here starts the KBC - Kaun Banega Crorepati!!!");
        System.out.println("Answer all the questions and win 50,000,000$");
        System.out.println("Rules:\n1. Only one chance of answering will be given\n2. For every question you will get a chance to win an exclusive prize\n3. You can use one lifeline for the entire game");
        System.out.println("___________________");
    }

    public void useLifeline(int choice, Question q) {
        if (lifelineUsed) {
            System.out.println("Sorry, you have already used a lifeline!");
            return;
        }

        lifelineUsed = true;  // Mark the lifeline as used

        switch (choice) {
            case 1: // 50-50
                int correctAnswer = q.answer;
                Random rand = new Random();
                int wrongAnswer;
                do {
                    wrongAnswer = rand.nextInt(4);
                } while (wrongAnswer == correctAnswer);
                System.out.println("You have used the 50-50 lifeline. The options are:");
                System.out.println((correctAnswer + 1) + ". " + q.options.get(correctAnswer));
                System.out.println((wrongAnswer + 1) + ". " + q.options.get(wrongAnswer));
                break;
            case 2: // Phone a Friend
                System.out.println("You have used the Phone a Friend lifeline. Your friend says: " + q.options.get(q.answer));
                break;
            case 3: // Ask the Audience
                System.out.println("You have used the Ask the Audience lifeline. The audience thinks the answer is: " + q.options.get(q.answer));
                break;
        }
    }

    @Override
    public void q1() throws Exception {
        Question q = new Question("Who is the king of the world?", Arrays.asList("Alpha", "Beta", "Gamma", "None"), 0);
        System.out.println("Q1: " + q.question);
        for (int i = 0; i < q.options.size(); i++) {
            System.out.println((i + 1) + ": " + q.options.get(i));
        }
        System.out.println("Select your answer or type 'L' to use a lifeline: ");
        String n = input.readLine();

        if (n.equalsIgnoreCase("L")) {
            System.out.println("Choose a lifeline: 1. 50-50  2. Phone a Friend  3. Ask the Audience");
            int lifelineChoice = Integer.parseInt(input.readLine());
            useLifeline(lifelineChoice, q);
            System.out.println("Now select your answer: ");
            n = input.readLine();
        }

        a = Integer.parseInt(n);
        if (a == 1) {
            System.out.println("Congratulations!");
            score = 100000;
        } else {
            System.out.println("Wrong answer!!\nCorrect answer is 1: Alpha.");
            System.out.println("Your first answer is wrong");
            System.out.println("Sorry, you cannot win the prize.");
        }
        System.out.println("You have won " + score + "$");
    }

    @Override
    public void q2() throws Exception {
        Question q = new Question("The symbol of element gold in the modern periodic table?", Arrays.asList("Au", "Gd", "Sn", "Tn"), 0);
        System.out.println("Q2: " + q.question);
        for (int i = 0; i < q.options.size(); i++) {
            System.out.println((i + 1) + ": " + q.options.get(i));
        }
        System.out.println("Select your answer or type 'L' to use a lifeline: ");
        String n = input.readLine();

        if (n.equalsIgnoreCase("L")) {
            System.out.println("Choose a lifeline: 1. 50-50  2. Phone a Friend  3. Ask the Audience");
            int lifelineChoice = Integer.parseInt(input.readLine());
            useLifeline(lifelineChoice, q);
            System.out.println("Now select your answer: ");
            n = input.readLine();
        }

        a = Integer.parseInt(n);
        if (a == 1 && score >= 100000) {
            System.out.println("Congratulations!");
            score = 500000;
        } else if (a == 1) {
            System.out.println("Correct answer but you can't win the prize, but you can proceed further.");
        } else {
            System.out.println("Wrong answer!!\nCorrect answer is 1: Au.");
        }
        System.out.println("Your AMOUNT is " + score + "$");
    }

    @Override
    public void q3() throws Exception {
        Question q = new Question("Which of these is an Operating System?", Arrays.asList("DOS", "Windows 2000", "BASIC", "UNIX"), 2);
        System.out.println("Q3: " + q.question);
        for (int i = 0; i < q.options.size(); i++) {
            System.out.println((i + 1) + ": " + q.options.get(i));
        }
        System.out.println("Select your answer or type 'L' to use a lifeline: ");
        String n = input.readLine();

        if (n.equalsIgnoreCase("L")) {
            System.out.println("Choose a lifeline: 1. 50-50  2. Phone a Friend  3. Ask the Audience");
            int lifelineChoice = Integer.parseInt(input.readLine());
            useLifeline(lifelineChoice, q);
            System.out.println("Now select your answer: ");
            n = input.readLine();
        }

        a = Integer.parseInt(n);
        if (a == 3 && score >= 500000) {
            System.out.println("Congratulations!!");
            score = 100000;
        } else if (a == 3) {
            System.out.println("Correct answer but you can't win the prize, but you can proceed further.");
        } else {
            System.out.println("Wrong Answer!!\nCorrect answer is 3: BASIC.");
        }
        System.out.println("Your AMOUNT is " + score + "$");
    }

    @Override
    public void q4() throws Exception {
        Question q = new Question("Which of these is not a part of MS-Office?", Arrays.asList("MS-Access", "FoxPro", "MS-Excel", "MS-PowerPoint"), 1);
        System.out.println("Q4: " + q.question);
        for (int i = 0; i < q.options.size(); i++) {
            System.out.println((i + 1) + ": " + q.options.get(i));
        }
        System.out.println("Select your answer or type 'L' to use a lifeline: ");
        String n = input.readLine();

        if (n.equalsIgnoreCase("L")) {
            System.out.println("Choose a lifeline: 1. 50-50  2. Phone a Friend  3. Ask the Audience");
            int lifelineChoice = Integer.parseInt(input.readLine());
            useLifeline(lifelineChoice, q);
            System.out.println("Now select your answer: ");
            n = input.readLine();
        }

        a = Integer.parseInt(n);
        if ((a == 2) && (score >= 100000)) {
            System.out.println("Congratulations!!");
            score = 200000;
        } else if (a == 2) {
            System.out.println("Correct answer but you can't win the prize, but you can proceed further.");
        } else {
            System.out.println("Wrong Answer!!\nCorrect answer is 2: FoxPro.");
        }
        System.out.println("Your AMOUNT is " + score + "$");
    }

    @Override
    public void q5() throws Exception {
        Question q = new Question("Which of these is a computer language?", Arrays.asList("Pascal", "dBASE", "Oracle", "UNIX"), 0);
        System.out.println("Q5: " + q.question);
        for (int i = 0; i < q.options.size(); i++) {
            System.out.println((i + 1) + ": " + q.options.get(i));
        }
        System.out.println("Select your answer or type 'L' to use a lifeline: ");
        String n = input.readLine();

        if (n.equalsIgnoreCase("L")) {
            System.out.println("Choose a lifeline: 1. 50-50  2. Phone a Friend  3. Ask the Audience");
            int lifelineChoice = Integer.parseInt(input.readLine());
            useLifeline(lifelineChoice, q);
            System.out.println("Now select your answer: ");
            n = input.readLine();
        }

        a = Integer.parseInt(n);
        if ((a == 1) && (score >= 200000)) {
            System.out.println("Congratulations!!");
            score = 500000;
        } else if (a == 1) {
            System.out.println("Correct answer but you can't win the prize, but you can proceed further.");
        } else {
            System.out.println("Wrong Answer!!\nCorrect answer is 1: Pascal.");
        }
        System.out.println("Your AMOUNT is " + score + "$");
    }

    @Override
    public void q6() throws Exception {
        Question q = new Question("Who developed Java?", Arrays.asList("James Gosling", "Bill Gates", "Dennis Ritchie", "Ken Thompson"), 0);
        System.out.println("Q6: " + q.question);
        for (int i = 0; i < q.options.size(); i++) {
            System.out.println((i + 1) + ": " + q.options.get(i));
        }
        System.out.println("Select your answer or type 'L' to use a lifeline: ");
        String n = input.readLine();

        if (n.equalsIgnoreCase("L")) {
            System.out.println("Choose a lifeline: 1. 50-50  2. Phone a Friend  3. Ask the Audience");
            int lifelineChoice = Integer.parseInt(input.readLine());
            useLifeline(lifelineChoice, q);
            System.out.println("Now select your answer: ");
            n = input.readLine();
        }

        a = Integer.parseInt(n);
        if ((a == 1) && (score >= 200000)) {
            System.out.println("Congratulations!!");
            score = 500000;
        } else if (a == 1) {
            System.out.println("Correct answer but you can't win the prize, but you can proceed further.");
        } else {
            System.out.println("Wrong Answer!!\nCorrect answer is 1: James Gosling.");
        }
        System.out.println("Your AMOUNT is " + score + "$");
    }

    @Override
    public void q7() throws Exception {
        Question q = new Question("Which of these is a cloud computing platform?", Arrays.asList("AWS", "Oracle", "Azure", "UNIX"), 0);
        System.out.println("Q7: " + q.question);
        for (int i = 0; i < q.options.size(); i++) {
            System.out.println((i + 1) + ": " + q.options.get(i));
        }
        System.out.println("Select your answer or type 'L' to use a lifeline: ");
        String n = input.readLine();

        if (n.equalsIgnoreCase("L")) {
            System.out.println("Choose a lifeline: 1. 50-50  2. Phone a Friend  3. Ask the Audience");
            int lifelineChoice = Integer.parseInt(input.readLine());
            useLifeline(lifelineChoice, q);
            System.out.println("Now select your answer: ");
            n = input.readLine();
        }

        a = Integer.parseInt(n);
        if ((a == 1) && (score >= 500000)) {
            System.out.println("Congratulations!! You have won the grand prize!");
            score = 1000000;
        } else if (a == 1) {
            System.out.println("Correct answer but you can't win the prize, but you can proceed further.");
        } else {
            System.out.println("Wrong Answer!!\nCorrect answer is 1: AWS.");
        }
        System.out.println("Your AMOUNT is " + score + "$");
    }
}
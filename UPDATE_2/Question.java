package project3;

import java.util.List;

public class Question {
    String question;
    List<String> options;
    int answer; // The index of the correct answer (0-based)

    public Question(String question, List<String> options, int answer) {
        this.question = question;
        this.options = options;
        this.answer = answer;
    }
}
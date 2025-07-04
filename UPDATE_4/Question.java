package project;

public class Question {
    private String questionText;
    private String[] options;
    private int correctAnswer;

    public Question(String questionText, String[] options, int correctAnswer) {
        this.questionText = questionText;
        this.options = options;
        this.correctAnswer = correctAnswer; // Store the correct answer as 1-4
    }

    public String getQuestionText() {
        return questionText;
    }

    public String[] getOptions() {
        return options;
    }

    public int getCorrectAnswer() {
        return correctAnswer; // Return as 1-4
    }

    public boolean isAnswerCorrect(int userAnswer) {
        return userAnswer == correctAnswer; // Compare user answer (1-4) with correct answer (1-4)
    }

    public void displayQuestion() {
        System.out.println(questionText);
        for (int i = 0; i < options.length; i++) {
            System.out.println((i + 1) + ": " + options[i]); // Display options as 1, 2, 3, 4
        }
    }
}
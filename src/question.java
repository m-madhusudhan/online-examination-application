public class Question {
    private String questionText;
    private String correctAnswer;

    public Question(String questionText, String correctAnswer) {
        this.questionText = questionText;
        this.correctAnswer = correctAnswer.toLowerCase();
    }

    public String getQuestionText() {
        return questionText;
    }

    public boolean checkAnswer(String answer) {
        return answer.toLowerCase().trim().equals(correctAnswer);
    }
}

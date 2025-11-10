import java.util.*;

public class Exam {
    private String title;
    private List<Question> questions;

    public Exam(String title) {
        this.title = title;
        this.questions = new ArrayList<>();
    }

    public void addQuestion(Question q) {
        questions.add(q);
    }

    public int getTotalQuestions() {
        return questions.size();
    }

    public void conductExam(User user, Scanner sc) {
        System.out.println("\nStarting " + title);
        System.out.println("Answer the following questions:\n");

        int score = 0;
        for (int i = 0; i < questions.size(); i++) {
            Question q = questions.get(i);
            System.out.println((i + 1) + ". " + q.getQuestionText());
            System.out.print("Your answer: ");
            String answer = sc.nextLine();

            if (q.checkAnswer(answer)) {
                System.out.println("✅ Correct!\n");
                score++;
            } else {
                System.out.println("❌ Incorrect.\n");
            }
        }

        user.setScore(score);
    }

    public String getTitle() {
        return title;
    }

    public List<Question> getQuestions() {
        return questions;
    }
}

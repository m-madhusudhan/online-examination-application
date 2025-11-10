import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Online Examination Application ===");
        Scanner sc = new Scanner(System.in);

        // Sample user login
        System.out.print("Enter Username: ");
        String username = sc.nextLine();
        User user = new User(username);

        // Initialize exam
        Exam exam = new Exam("Java Fundamentals Quiz");
        exam.addQuestion(new Question("Which keyword is used to inherit a class in Java?", "extends"));
        exam.addQuestion(new Question("What is the size of int in Java?", "4"));
        exam.addQuestion(new Question("Which company developed Java?", "Sun Microsystems"));
        exam.addQuestion(new Question("Which method is the entry point of a Java program?", "main"));
        exam.addQuestion(new Question("What does JVM stand for?", "Java Virtual Machine"));

        // Conduct exam
        exam.conductExam(user, sc);

        // Show score and report
        System.out.println("\n=== Exam Completed ===");
        System.out.println("Score: " + user.getScore() + "/" + exam.getTotalQuestions());
        System.out.println("Percentage: " + (user.getScore() * 100.0 / exam.getTotalQuestions()) + "%");

        ReportGenerator.generateReport(user, exam);

        sc.close();
    }
}

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class ReportGenerator {
    public static void generateReport(User user, Exam exam) {
        try {
            String filename = "ExamReport_" + user.getUsername() + ".txt";
            FileWriter fw = new FileWriter(filename);
            fw.write("=== Online Examination Report ===\n");
            fw.write("User: " + user.getUsername() + "\n");
            fw.write("Exam: " + exam.getTitle() + "\n");
            fw.write("Score: " + user.getScore() + "/" + exam.getTotalQuestions() + "\n");
            fw.write("Percentage: " + (user.getScore() * 100.0 / exam.getTotalQuestions()) + "%\n");
            fw.write("Generated on: " + LocalDateTime.now() + "\n");
            fw.close();
            System.out.println("Report saved as: " + filename);
        } catch (IOException e) {
            System.out.println("Error generating report: " + e.getMessage());
        }
    }
}

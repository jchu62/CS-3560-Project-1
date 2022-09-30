import java.util.*;
public class VotingService {
    private QuestionType question;
    HashMap<UUID, Character> studentAnswers = new HashMap<>();
    HashMap<UUID, Character[]> multipleStudentAnswers = new HashMap<>();
    private Student[] students;

    public VotingService(SingleChoiceQuestion question, Student[] students)
    {
        System.out.println("Single Choice Question initialized");
        this.question = question;
        this.students = students;
    }

    public VotingService(MultipleChoiceQuestion question, Student[] students)
    {
        System.out.println("Multiple Choice Question initialized");
        this.question = question;
        this.students = students;
    }

    
}

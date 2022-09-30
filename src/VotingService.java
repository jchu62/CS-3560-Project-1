import java.util.*;
public class VotingService {
    private QuestionType question;
    private HashMap<UUID, Character> studentAnswers = new HashMap<>();
    private HashMap<UUID, char[]> multipleStudentAnswers = new HashMap<>();
//    private Student[] students;

    public VotingService(SingleChoiceQuestion question/*, Student[] students*/)
    {
        System.out.println("Single Choice Question initialized");
        this.question = question;
//        this.students = students;
    }

    public VotingService(MultipleChoiceQuestion question/*, Student[] students*/)
    {
        System.out.println("Multiple Choice Question initialized");
        this.question = question;
//        this.students = students;
    }

    private void singleAnswerVote(Student student, char answer)
    {
        if(studentAnswers.containsKey(student.getUUID()))
        {
            studentAnswers.replace(student.getUUID(), answer);
        }
        else{
            studentAnswers.put(student.getUUID(), answer);
        }
    }

    private void multipleAnswerVote(Student student, char[] answers)
    {
        if(multipleStudentAnswers.containsKey(student.getUUID()))
        {
            multipleStudentAnswers.replace(student.getUUID(), answers);
        }
        else{
            multipleStudentAnswers.put(student.getUUID(), answers);
        }
    }

    private void displayVotes()
    {
        
    }

    private void displayQuestion()
    {

    }
}

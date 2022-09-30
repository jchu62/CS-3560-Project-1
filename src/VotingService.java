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

    public void singleAnswerVote(Student student, char answer)
    {
        if(studentAnswers.containsKey(student.getUUID()))
        {
            studentAnswers.replace(student.getUUID(), answer);
        }
        else{
            studentAnswers.put(student.getUUID(), answer);
        }
    }

    public void multipleAnswerVote(Student student, char[] answers)
    {
        if(multipleStudentAnswers.containsKey(student.getUUID()))
        {
            multipleStudentAnswers.replace(student.getUUID(), answers);
        }
        else{
            multipleStudentAnswers.put(student.getUUID(), answers);
        }
    }

    public void displaySingleAnswerVotes()
    {
        System.out.println("The votes are " + studentAnswers.values());

    }

    public void displayMultipleAnswerVotes()
    {
        // this does not work :( not sure how to fix either
        //System.out.println("The votes are " + Arrays.toString((char[])multipleStudentAnswers.values()));
        System.out.println("The votes are " + multipleStudentAnswers.values());
    }

    public void displayQuestion()
    {
        question.displayQuestionDescription();
        question.displayAnswerDescription();
    }
}

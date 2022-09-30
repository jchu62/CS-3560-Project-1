import java.util.*;
public class VotingService {
    /* SingleChoiceQuestion test = new SingleChoiceQuestion(1, 'a'); */

    HashMap<UUID, Character> studentAnswers = new HashMap<>();
    HashMap<UUID, Character[]> multipleStudentAnswers = new HashMap<>();
    private Student[] students;

    public VotingService(SingleChoiceQuestion question, Student[] students)
    {
        System.out.println("Single Choice Question initialized");
    };

//    public static void main(String args[])
//    {   String[] hi = {"j"};
//        SingleChoiceQuestion test2 = new SingleChoiceQuestion(1, 'a', "lol", hi);
//        System.out.println(test2.getQuestionDescription());
//        System.out.println(test2.getAnswerDescriptions());
//        System.out.println(test2.getCorrectAnswer());
//    }
}

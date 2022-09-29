public class VotingService {
    /* SingleChoiceQuestion test = new SingleChoiceQuestion(1, 'a'); */

    private Student[] students;
    private int[] numOfAnswers;

    public VotingService(QuestionType question)
    {

    };

    public static void main(String args[])
    {
        SingleChoiceQuestion test2 = new SingleChoiceQuestion(1, 'a', "lol");
        System.out.println(test2.getQuestionDescription());
    }
}

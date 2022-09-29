public class VotingService {
    /* SingleChoiceQuestion test = new SingleChoiceQuestion(1, 'a'); */

    private Student[] students;
    private int[] numOfAnswers;

    public VotingService(QuestionType question)
    {

    };

    public static void main(String args[])
    {   String[] hi = {"j"};
        SingleChoiceQuestion test2 = new SingleChoiceQuestion(1, 'a', "lol", hi);
        System.out.println(test2.getQuestionDescription());
        System.out.println(test2.getAnswerDescriptions());
        System.out.println(test2.getCorrectAnswer());
    }
}

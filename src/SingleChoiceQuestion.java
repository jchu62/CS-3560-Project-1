public class SingleChoiceQuestion extends QuestionType
{
    final char[] ANSWERS = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i',
            'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q',
            'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    private char[] availableAnswers;
    private char correctAnswer;
    private String questionDescription;

    public SingleChoiceQuestion(int numOfAnswers, char correctAnswer)
    {
        super(numOfAnswers, correctAnswer);
        this.correctAnswer = correctAnswer;
    }

    public SingleChoiceQuestion(int numOfAnswers, char correctAnswer, String questionDescription)
    {
        super(numOfAnswers, correctAnswer, questionDescription);
        this.correctAnswer = correctAnswer;
    }
}

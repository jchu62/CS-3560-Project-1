public class SingleChoiceQuestion extends QuestionType
{
    final char[] ANSWERS = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i',
            'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q',
            'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    private char[] availableAnswers;
    private char correctAnswer;
    private String questionDescription;
    private String[] answerDescriptions;

    public SingleChoiceQuestion(int numOfAnswers, char correctAnswer)
    {
        super(numOfAnswers, correctAnswer);
        this.correctAnswer = correctAnswer;
    }

    public SingleChoiceQuestion(int numOfAnswers, char correctAnswer, String questionDescription)
    {
        super(numOfAnswers, correctAnswer, questionDescription);
    }

    public SingleChoiceQuestion(int numOfAnswers, char correctAnswer, String questionDescription, String[] answerDescriptions)
    {
        super(numOfAnswers,correctAnswer, questionDescription, answerDescriptions);
        this.correctAnswer = correctAnswer;
    }

    private boolean isTrue(char answer)
    {
        if (answer == this.getCorrectAnswer());
        return true;
    };

    public char getCorrectAnswer()
    {
        return this.correctAnswer;
    }

    public void displayQuestionDescription(String description)
    {
        System.out.println(description);
    }

    public void setQuestionDescription(String description)
    {
        questionDescription = description;
    }

    public String getQuestionDescription()
    {
        return this.questionDescription;
    }

    public void setAnswerDescriptions(String[] descriptions)
    {
        this.answerDescriptions = descriptions.clone();
    }

    public String[] getAnswerDescriptions()
    {
        return this.answerDescriptions;
    }
}

public class SingleChoiceQuestion extends QuestionType
{
    public SingleChoiceQuestion(int numOfAnswers, String questionDescription, String[] answerDescriptions)
    {
        super(numOfAnswers, questionDescription, answerDescriptions);
    }

    private char singleChoiceAnswer(char answer)
    {
        for (int i = 0; i < availableAnswers.length; i++) {
            if (answer == availableAnswers[i])
                return answer;
        }
        System.out.println("Detecting invalid answer, answer set to 'a' automatically");
        return 'a';
    }
}

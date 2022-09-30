public class MultipleChoiceQuestion extends QuestionType
{
    final char[] ANSWERS = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i',
            'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q',
            'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

    public MultipleChoiceQuestion(int numOfAnswers, String questionDescription, String[] answerDescriptions)
    {
        super(numOfAnswers, questionDescription, answerDescriptions);
    }

    private char[] multipleChoiceAnswers(char[] answers)
    {
        char[] validAnswers = new char[availableAnswers.length];
        return validAnswers;
    }

}

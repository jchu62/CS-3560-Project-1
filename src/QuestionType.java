public abstract class QuestionType
{
    // Decided to make answers into a char array because anything beyond 26 answers is most likely excessive
    final char[] ANSWERS = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i',
                      'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q',
                      'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    char[] availableAnswers;
    char[] correctAnswer;
    String questionDescription;
    String[] answerDescription;

    public QuestionType(int numOfAnswers, char correctAnswer)
    {
        availableAnswers = new char[numOfAnswers];
        for (int i = 0; i < numOfAnswers; i++)
        {
            availableAnswers[i] = ANSWERS[i];
        }
        this.correctAnswer = new char[1];
        this.correctAnswer[1] = correctAnswer;
    }

    public QuestionType(int numOfAnswers, char correctAnswer, String questionDescription)
    {
        availableAnswers = new char[numOfAnswers];
        for (int i = 0; i < numOfAnswers; i++)
        {
            availableAnswers[i] = ANSWERS[i];
        }
        this.correctAnswer = new char[1];
        this.correctAnswer[1] = correctAnswer;
        this.questionDescription = questionDescription;
    }


    private boolean isTrue(char answer)
    {
        if (answer == this.getCorrectAnswer());
        return true;
    };

    public char getCorrectAnswer()
    {
        return this.correctAnswer[1];
    }



    public void displayQuestionDescription(String description)
    {
        System.out.println(description);
    }
}

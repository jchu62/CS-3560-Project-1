public class SingleChoiceQuestion extends QuestionType
{
    final char[] ANSWERS = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i',
            'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q',
            'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    private char correctAnswer;

   /* public SingleChoiceQuestion(int numOfAnswers, char correctAnswer)
    {
        super(numOfAnswers, correctAnswer);
        this.correctAnswer = correctAnswer;
    }

    public SingleChoiceQuestion(int numOfAnswers, char correctAnswer, String questionDescription)
    {
        super(numOfAnswers, correctAnswer, questionDescription);
        System.out.println(this.questionDescription);
        System.out.println(this.correctAnswer);
    }
    */
    public SingleChoiceQuestion(int numOfAnswers, char correctAnswer, String questionDescription, String[] answerDescriptions)
    {
        super(numOfAnswers,correctAnswer, questionDescription, answerDescriptions);
        this.correctAnswer = correctAnswer;
    }

//    private boolean isTrue(char answer)
//    {
//        if (answer == this.getCorrectAnswer());
//        return true;
//    };

    @Override
    public char getCorrectAnswer()
    {
        return this.correctAnswer;
    }

//    public void displayQuestionDescription(String description)
//    {
//        System.out.println(description);
//    }
//
//    public void displayAnswerDescription(String descriptions)
//    {
//        for (int i = 0; i < availableAnswers.length; i++)
//        {
//            // No catch for overflow because it will not print it out
//            if (availableAnswers.length > answerDescriptions.length || i >= answerDescriptions.length)
//            {
//                System.out.println(availableAnswers[i] + " : NULL");
//            }
//            else
//            {
//                System.out.println(availableAnswers[i] + " : " + answerDescriptions[i]);
//            }
//        }
//    }

//    public void setQuestionDescription(String description)
//    {
//        questionDescription = description;
//    }
//
//    public String getQuestionDescription()
//    {
//        return this.questionDescription;
//    }
//
//    public void setAnswerDescriptions(String[] descriptions)
//    {
//        this.answerDescriptions = descriptions.clone();
//    }
//
//    public String[] getAnswerDescriptions()
//    {
//        return this.answerDescriptions;
//    }
}

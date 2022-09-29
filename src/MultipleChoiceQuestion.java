public class MultipleChoiceQuestion extends QuestionType
{
    final char[] ANSWERS = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i',
            'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q',
            'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    char[] correctAnswer;

    public MultipleChoiceQuestion(int numOfAnswers, char[] correctAnswer, String questionDescription, String[] answerDescriptions)
    {
//        super(numOfAnswers, correctAnswer, questionDescription, answerDescriptions);
        super(numOfAnswers, questionDescription, answerDescriptions);
//        char[] testArray = new char[correctAnswer.length];
//        int nonRepeatedAnswers = 1;
//        boolean duplicates = false;
//        for (int i = 0; i < correctAnswer.length; i++)
//        {
//            for (int j = 0; j < nonRepeatedAnswers; j++)
//            {
//                if (testArray[nonRepeatedAnswers] == correctAnswer[i])
//                {
//                    duplicates = true;
//                    break;
//                }
//
//            }
//        }
        this.correctAnswer = correctAnswer.clone(); // for now
        // sort first, then search

    }

}

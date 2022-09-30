public class MultipleChoiceQuestion extends QuestionType
{
    public MultipleChoiceQuestion(int numOfAnswers, String questionDescription, String[] answerDescriptions)
    {
        super(numOfAnswers, questionDescription, answerDescriptions);
    }

    // Answer eligibility verification
    private char[] multipleChoiceAnswers(char[] answers) {
        char[] validAnswers = new char[availableAnswers.length];

        // Preventing crash by invalid array length
        if (validAnswers.length == 0)
        {
            System.out.println("There are no answers in here, one answer set to 'a' automatically.");
            char [] crashAvoidanceArray = {'a'};
            return crashAvoidanceArray;
        }
        int nonRepeatedSum = 0;
        boolean isInAvailableAnswers = false;
        boolean isNotInArray = true;
        for (int i = 0; i < answers.length; i++)
        {
            // checks if the answer is a legal answer
            for (int j = 0; j < availableAnswers.length; j++)
            {
                if (answers[i] == availableAnswers[j])
                {
                    isInAvailableAnswers = true;
                    break;
                }
            }
            // checks if the answer was legal, and if it is then checks if it is a repeat
            if (isInAvailableAnswers)
            {
                if (nonRepeatedSum == 0)
                {
                    validAnswers[0] = answers[i];
                }
                else
                {
                    for (int k = 0; k < nonRepeatedSum; k++)
                    {
                        if (validAnswers[k] == answers[i])
                        {
                            isNotInArray = false;
                            break;
                        }
                    }
                }
                if (isNotInArray)
                {
                    validAnswers[nonRepeatedSum] = answers[i];
                }
            }
            isNotInArray = true;
            isInAvailableAnswers = false;
        }
        // more crash avoidance
        if (nonRepeatedSum == 0)
        {
            System.out.println("No valid answers were found, automatically setting one answer to 'a'.");
            char [] crashAvoidanceArray = {'a'};
            return crashAvoidanceArray;
        }

        char[] actualValidAnswers = new char[nonRepeatedSum];
            for (int i = 0; i < actualValidAnswers.length; i++)
            {
                actualValidAnswers[i] = validAnswers[i];
            }
            return actualValidAnswers;
    }
}

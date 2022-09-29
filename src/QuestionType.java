public abstract class QuestionType
{
    // Decided to make answers into a char array because anything beyond 26 answers is most likely excessive
    final char[] ANSWERS = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i',
                      'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q',
                      'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    char[] availableAnswers;
//    char[] correctAnswer;
    String questionDescription;
    String[] answerDescriptions;

  /*  public QuestionType(int numOfAnswers, char correctAnswer)
    {
        // error checking
        if ( numOfAnswers > 26 || numOfAnswers < 1){
            throw new ArrayIndexOutOfBoundsException();
        }
        else
        {
            availableAnswers = new char[numOfAnswers];
            for (int i = 0; i < numOfAnswers; i++)
            {
                availableAnswers[i] = ANSWERS[i];
            }
        }
        this.correctAnswer = new char[1];
        this.correctAnswer[1] = correctAnswer;
    }

    public QuestionType(int numOfAnswers, char correctAnswer, String questionDescription)
    {
        if ( numOfAnswers > 26 || numOfAnswers < 0){
            throw new ArrayIndexOutOfBoundsException();
        }
        else
        {
            availableAnswers = new char[numOfAnswers];
            for (int i = 0; i < numOfAnswers; i++)
            {
                availableAnswers[i] = ANSWERS[i];
            }
        }
        this.correctAnswer = new char[1];
        this.correctAnswer[0] = correctAnswer;
        this.questionDescription = questionDescription;
    }
    */
    public QuestionType(int numOfAnswers, /*char correctAnswer,*/ String questionDescription, String[] answerDescriptions)
    {
        if ( numOfAnswers > 26 || numOfAnswers < 0){
            throw new ArrayIndexOutOfBoundsException();
        }
        else
        {
            availableAnswers = new char[numOfAnswers];
            for (int i = 0; i < numOfAnswers; i++)
            {
                availableAnswers[i] = ANSWERS[i];
            }
        }
        /* this.correctAnswer = new char[1];
        this.correctAnswer[0] = correctAnswer; */
        this.questionDescription = questionDescription;
        this.answerDescriptions = answerDescriptions.clone();
    }

//    private boolean isTrue(char answer)
//    {
//        if (answer == this.getCorrectAnswer());
//        return true;
//    };

//    public char getCorrectAnswer()
//    {
//        return this.correctAnswer[1];
//    }

    public void displayQuestionDescription(String description)
    {
        System.out.println(description);
    }

    public void displayAnswerDescription(String descriptions)
    {
        for (int i = 0; i < availableAnswers.length; i++)
        {
            // No catch for overflow because it will not print it out
            if (availableAnswers.length > answerDescriptions.length || i >= answerDescriptions.length)
            {
                System.out.println(availableAnswers[i] + " : NULL");
            }
            else
            {
                System.out.println(availableAnswers[i] + " : " + answerDescriptions[i]);
            }
        }
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

    public String getAnswerDescriptions()
    {
        String allAnswerDescriptions = "";
        for (int i = 0; i < answerDescriptions.length; i++)
        {
            allAnswerDescriptions += answerDescriptions[i] + " ";
        }
        return allAnswerDescriptions;
    }
}

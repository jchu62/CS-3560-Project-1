// Jesse Chu
// CS 3560 Assignment #1
// 9/29/22

public class SimulationDriver {
    public static void main(String[] args)
    {
        multipleChoiceSimulation();
        singleChoiceSimulation();
    }
    public static void singleChoiceSimulation()
    {
        String[] answerDescriptions = {"Scream", "Cry", "Fight", "Go Fishing", "Consume", "Help"};
        SingleChoiceQuestion question = new SingleChoiceQuestion(6,
                "What would you do if you were randomly generated?",
                answerDescriptions);
        VotingService singleVote = new VotingService(question);
        int randomizer = (int)(1 + Math.random() * 10);
        char[] randomAnswers = new char[randomizer];
        for (int i = 0; i < randomAnswers.length; i++)
        {
            int randomAnswerGenerator = (int)(Math.random()*5);
            // Only time that switch statement might be good
            switch(randomAnswerGenerator)
            {
                case 0:
                    randomAnswers[i] = 'a';
                    break;
                case 1:
                    randomAnswers[i] = 'b';
                    break;
                case 2:
                    randomAnswers[i] = 'c';
                    break;
                case 3:
                    randomAnswers[i] = 'd';
                    break;
                case 4:
                    randomAnswers[i] = 'e';
                    break;
                case 5:
                    randomAnswers[i] = 'f';
                    break;
                default:
                    randomAnswers[i] = 'a';
            }
        }
        Student[] students = new Student[randomizer];
        for (int i = 0; i < students.length; i++)
        {
            students[i] = new Student();
            singleVote.singleAnswerVote(students[i],students[i].submitAnswer(question.singleChoiceAnswer(randomAnswers[i])));
        }
        singleVote.displayQuestion();
        singleVote.displaySingleAnswerVotes();
    }
    public static void multipleChoiceSimulation()
    {
        String[] answerDescriptions = {"Sheep", "Bird", "Fish Don't Exist", "Shark", "Human", "Help"};
        MultipleChoiceQuestion question = new MultipleChoiceQuestion(6,
                "What are not fish?",
                answerDescriptions);
        VotingService multipleVote = new VotingService(question);
        int randomizer = (int)(1 + Math.random() * 10);
        Student[] students = new Student[randomizer];
        for (int i = 0; i < randomizer; i++)
        {
            char[] randomAnswers = new char[randomizer];
            students[i] = new Student();
            for (int j = 0; j < randomizer; j++)
            {
                int randomAnswerGenerator = (int)(Math.random()*5);
                switch(randomAnswerGenerator)
                {
                    case 0:
                        randomAnswers[i] = 'a';
                        break;
                    case 1:
                        randomAnswers[i]= 'b';
                        break;
                    case 2:
                        randomAnswers[i] = 'c';
                        break;
                    case 3:
                        randomAnswers[i] = 'd';
                        break;
                    case 4:
                        randomAnswers[i] = 'e';
                        break;
                    case 5:
                        randomAnswers[i]= 'f';
                        break;
                    default:
                        randomAnswers[i] = 'a';
                }
            }
           multipleVote.multipleAnswerVote(students[i], students[i].submitAnswers(question.multipleChoiceAnswers(randomAnswers)));
        }
        multipleVote.displayQuestion();
        multipleVote.displayMultipleAnswerVotes();
    }
}

// Jesse Chu
// CS 3560 Assignment #1
// 9/29/22

public class SimulationDriver {
    public static void main(String[] args)
    {
        String[] descriptions = {"1", "50", "500", "0"};
        Student[] classroom = new Student[4];
        classroom[0] = new Student();
        classroom[1] = new Student();
        classroom[2] = new Student();
        classroom[3] = new Student();
        SingleChoiceQuestion singleQuestion = new SingleChoiceQuestion(4,
                "What is the amount of fish in the world?", descriptions);
        VotingService voteTest = new VotingService(singleQuestion);
        voteTest.singleAnswerVote(classroom[1], classroom[1].submitAnswer(singleQuestion.singleChoiceAnswer('a')));
        voteTest.singleAnswerVote(classroom[2], classroom[2].submitAnswer(singleQuestion.singleChoiceAnswer('b')));
        voteTest.displaySingleAnswerVotes();
        voteTest.singleAnswerVote(classroom[2], classroom[2].submitAnswer(singleQuestion.singleChoiceAnswer('a')));
        voteTest.singleAnswerVote(classroom[3], classroom[3].submitAnswer(singleQuestion.singleChoiceAnswer('b')));
        voteTest.displaySingleAnswerVotes();
    }
}

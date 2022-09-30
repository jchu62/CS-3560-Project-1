import java.util.UUID;

public class Student {
    UUID uuid;
    public Student()
    {
        this.uuid = UUID.randomUUID();
    }

    private char submitAnswer(char answer)
    {
        return answer;
    }

    private char[] submitAnswers(char[] answers)
    {
        return answers;
    }

    // No setters because there should be no reason to change a student's ID

    public UUID getUUID()
    {
        return this.uuid;
    }

}

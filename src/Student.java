import java.util.UUID;

public class Student {
    UUID uuid;
    public Student()
    {
        this.uuid = UUID.randomUUID();
    }

    public char submitAnswer(char answer)
    {
        return answer;
    }

    public char[] submitAnswers(char[] answers)
    {
        return answers;
    }

    // No setters because there should be no reason to change a student's ID

    public UUID getUUID()
    {
        return this.uuid;
    }

}

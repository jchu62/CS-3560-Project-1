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

    // No setters because there should be no reason to change a student's ID

    public UUID getUuid()
    {
        return this.uuid;
    }

}

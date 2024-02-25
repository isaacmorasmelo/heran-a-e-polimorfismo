package entities;

public class desafio_Task extends desafio_Lesson{

    private String description;
    private int questionCount;

    public desafio_Task() {

    }

    public desafio_Task(String title, String description, int questionCount) {
        super(title);
        this.description = description;
        this.questionCount = questionCount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuestionCount() {
        return questionCount;
    }

    public void setQuestionCount(int questionCount) {
        this.questionCount = questionCount;
    }

    @Override
    public int duration() {
        return questionCount * 300;
    }
}

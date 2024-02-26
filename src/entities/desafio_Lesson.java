package entities;

public abstract class desafio_Lesson {
    public String title;
    public desafio_Lesson(String title) {
        this.title = title;
    }

    public abstract int duration();

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}

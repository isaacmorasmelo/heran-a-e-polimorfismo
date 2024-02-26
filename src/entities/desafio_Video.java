package entities;

public class desafio_Video extends desafio_Lesson{

    private String url;
    private int seconds;

    public desafio_Video(String title, String url, int seconds) {
        super(title);
        this.url = url;
        this.seconds = seconds;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    @Override
    public int duration() {
        return seconds;
    }

}

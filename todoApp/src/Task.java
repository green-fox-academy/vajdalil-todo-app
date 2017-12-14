public class Task {

    private boolean isDone;
    private String content;

    public Task() {
        this.isDone = false;
        this.content = "";
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
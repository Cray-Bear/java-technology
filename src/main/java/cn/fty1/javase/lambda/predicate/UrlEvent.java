package cn.fty1.javase.lambda.predicate;

public class UrlEvent {


    private boolean status;
    private String text;
    private String url;
    private Long curTime;

    public UrlEvent() {
    }

    public UrlEvent(String url) {
        this.url = url;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Long getCurTime() {
        return curTime;
    }

    public void setCurTime(Long curTime) {
        this.curTime = curTime;
    }
}

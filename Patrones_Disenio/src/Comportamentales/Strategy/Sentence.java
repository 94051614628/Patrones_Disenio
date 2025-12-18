package Comportamentales.Strategy;

public class Sentence {
    private Integer call;
    private String sentence;

    public Sentence(String sentence) {
        this.sentence = sentence;
        call = 0;
    }

    public Integer getCall() {
        return call;
    }

    public void setCall(Integer call) {
        this.call = call;
    }

    public String getSentence() {
        return sentence;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }
}

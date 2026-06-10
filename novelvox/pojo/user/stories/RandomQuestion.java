package novelvox.pojo.user.stories;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RandomQuestion {

    @JsonProperty("Question")
    private String question;
    @JsonProperty("Answer")
    private String answer;
    @JsonProperty("colon")
    private String colon;

    public RandomQuestion() {
    }

    public RandomQuestion(String question, String answer, String colon) {
        this.question = question;
        this.answer = answer;
        this.colon = colon;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getColon() {
        return colon;
    }

    public void setColon(String colon) {
        this.colon = colon;
    }

    @Override
    public String toString() {
        return "RandomQuestion [question=" + question + ", answer=" + answer + ", colon=" + colon + "]";
    }
}

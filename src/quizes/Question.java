package quizes;

import java.util.Objects;

public abstract class Question {

  private String question;




  public Question(String question) {
    this.question = question;

  }



  public String getQuestion() {
    return question;
  }

  public void setQuestion(String question) {
    this.question = question;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Question)) return false;
    Question question1 = (Question) o;
    return Objects.equals(getQuestion(), question1.getQuestion());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getQuestion());
  }
}

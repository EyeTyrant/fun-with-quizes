package quizes;


import java.util.ArrayList;

public class MultiChoice extends Question{
  private static final String question = "";
  String multiQuestion;

  public MultiChoice(String multiQuestion) {
    super(question);
    this.multiQuestion = multiQuestion;
  }

  public String getMultiQuestion() {
    return multiQuestion;
  }

  public void setMultiQuestion(String multiQuestion) {
    this.multiQuestion = multiQuestion;
  }

  @Override
  public String toString() {
    return multiQuestion;
  }


}

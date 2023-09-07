package seminar3;

public class zadanie2Zeroby extends ArithmeticException {
  public zadanie2Zeroby(String message){
    super(message);
  }

  public zadanie2Zeroby(){
    super("нельзя делить на 0");
  }
}

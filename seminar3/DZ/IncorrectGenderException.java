package seminar3.DZ;

public class IncorrectGenderException extends RuntimeException {
  public IncorrectGenderException() {
    super("неправильный пол(f либо m)");
  }

  public IncorrectGenderException(String message) {
    super(message);
  }
}

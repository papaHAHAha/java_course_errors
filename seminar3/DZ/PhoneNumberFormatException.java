package seminar3.DZ;

public class PhoneNumberFormatException extends NumberFormatException {
  public PhoneNumberFormatException() {
    super("номер телефона не может быть длиннее 15 символов и содержит только цифры");
  }

  public PhoneNumberFormatException(String message) {
    super(message);
  }
}

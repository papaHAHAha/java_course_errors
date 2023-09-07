package seminar3.DZ;

public class LongNameException extends StringIndexOutOfBoundsException {
  public LongNameException() {
    super("имя/фамилия/отчество слишком длинное/недоступное(пустая строка, наличие цифр)");
  }

  public LongNameException(String message) {
    super(message);
  }
}

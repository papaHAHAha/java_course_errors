package seminar3.DZ;

public class BirthDateFormatException extends NumberFormatException {
  public BirthDateFormatException() {
    super("неправильный формат даты рождения(dd.mm.yyyy)/недопустимый день/месяц/год рождения(введите реальный день рождения)");
  }

  public BirthDateFormatException(String message) {
    super(message);
  }
}

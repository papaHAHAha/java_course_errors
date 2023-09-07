package seminar3;

public class zadanie3Dataexc extends NumberFormatException {
  public zadanie3Dataexc() {
    super("в ячейке лежит символ или текст вместо числа: ");
  }

  public zadanie3Dataexc(int i, int j) {
    super(String.format("в ячейке [%d][%d] лежит символ или текст вместо числа.", i, j));
  }
}

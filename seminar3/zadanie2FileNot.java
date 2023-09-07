package seminar3;

import java.io.FileNotFoundException;

public class zadanie2FileNot extends FileNotFoundException {
  public zadanie2FileNot(){
    super("файл не найден");
  }

  public zadanie2FileNot(String message){
    super(message);
  }
}

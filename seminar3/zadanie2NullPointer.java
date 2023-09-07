package seminar3;

public class zadanie2NullPointer extends NullPointerException {
  public zadanie2NullPointer(){
    super("обращение к пустому элементу");
  }

  public zadanie2NullPointer(String message){
    super(message);
  }
}

package seminar3;

import java.io.IOException;

public class zadanie1 implements AutoCloseable {
  private static Integer count;

  public zadanie1() {
    count = 0;
  }

  public static void add() throws IOException {
    if (count != null) {
      count++;
    } else {
      throw new IOException();
    }
  }

  @Override
  public void close() throws Exception {
    count = null;
    System.out.println("экземпляр закрыт");
  }

  public static Integer getCount() throws NullPointerException {
    if (count != null) {
      return count;
    }else{
      throw new NullPointerException();
    }
  }
}

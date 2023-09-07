package seminar3;

public class zadanie1Check {
  public static void main(String[] args) {
    // zadanie1 m = new zadanie1();
    // try {
    //   m.close();
    // } catch (Exception e) {
    // }
    try(zadanie1 b = new zadanie1()) {
      System.out.println(b.getCount());
    } catch (Exception e) {
    }
  }
}

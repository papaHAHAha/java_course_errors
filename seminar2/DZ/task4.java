package seminar2.DZ;

import java.util.Scanner;

public class task4 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      System.out.println("введите строку: ");
      String s = scanner.nextLine();
      if(s.isEmpty()){
        throw new RuntimeException("Пустые строки вводить нельзя.");
      } else {
        System.out.println(s);
      }
    }

  }
}

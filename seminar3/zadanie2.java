package seminar3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class zadanie2 {
  public static void main(String[] args) throws FileNotFoundException{
    // String[] arr = new String[1];
    // arr[0] = null;
    // try {
    //   System.out.println(arr[0].length());
    // } catch (NullPointerException e) {
    // throw new zadanie2NullPointer();
    // }
    // try {
    //   FileReader reader = new FileReader("fassaf");
    // } catch (IOException e) {
    //   throw new zadanie2FileNot();
    // }
    try {
      int a = 10/0;
    } catch (ArithmeticException e) {
      throw new zadanie2Zeroby();
    }
    
  }
}

package seminar2.DZ;

import java.util.Scanner;

public class task1 {
  public static void main(String[] args) {
    float num = isFloat();
    System.out.println("Your float number is: " + num);
  }

  public static float isFloat(){
    Scanner scanner = new Scanner(System.in);
    float num = 0f;
    boolean flag = false;
    while(flag == false){
      System.out.println("write float number: ");
      if (scanner.hasNextFloat()){
        num = scanner.nextFloat();
        flag = true;
      } else {
        System.out.println("Error! Please, write the float number: ");
        scanner.next();
      }
    }

    return num;
  }
}

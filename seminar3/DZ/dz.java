package seminar3.DZ;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;
import java.util.Scanner;

public class dz {
  public static void main(String[] args) {
    System.setProperty("console.encoding", "UTF-8");
    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите информацию: ");
    String info = scanner.nextLine();


    String[] userData = check(info);
    if (userData != null) {
      String lastName = userData[0];
      saveDataToFile(lastName, userData);
    }
    scanner.close();

    // if (userData != null) {
    //   String lastName = userData[0];
    //   try {
    //     saveDataToFile(lastName, userData);
    //     System.out.println("Данные успешно сохранены в файл.");
    //   } catch (IOException e) {
    //     e.printStackTrace();
    //   }
    // }
  }

  public static String[] check(String info) {
    String[] userData = info.split(" ");
    if (userData.length != 6) {
      throw new RuntimeException("Введите все нужные данные");
    }

    String lastName = userData[0];
    String firstName = userData[1];
    String middleName = userData[2];
    String birthDate = userData[3];
    String phoneNumber = userData[4];
    String gender = userData[5];
    if (lastName.length() > 15 || firstName.length() > 20 || middleName.length() > 20 || lastName.length() < 2
        || firstName.length() < 2 || middleName.length() < 2 || !isFIOValid(lastName) || !isFIOValid(firstName)
        || !isFIOValid(middleName)) {
      throw new LongNameException();
    }

    validateBirthDate(birthDate);

    if (!phoneNumber.matches("\\d+") || phoneNumber.length() > 15) {
      throw new PhoneNumberFormatException();
    }

    if (!(gender.equals("f") || gender.equals("m"))) {
      throw new IncorrectGenderException();
    }
    return userData;
  }

  public static boolean isFIOValid(String name) {
    return !name.trim().isEmpty();
  }

  public static void validateBirthDate(String birthDate) {
    String[] dateComponents = birthDate.split("\\.");
    int day = Integer.parseInt(dateComponents[0]);
    int month = Integer.parseInt(dateComponents[1]);
    int year = Integer.parseInt(dateComponents[2]);

    int currentYear = Calendar.getInstance().get(Calendar.YEAR);

    int maxDay;
    if (month == 2) {
      maxDay = (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) ? 29 : 28;
    } else if (month == 4 || month == 6 || month == 9 || month == 11) {
      maxDay = 30;
    } else {
      maxDay = 31;
    }

    if (!birthDate.matches("\\d{2}\\.\\d{2}\\.\\d{4}") || year < 1900 || year > currentYear || month < 1 || month > 12
        || day < 1 || day > maxDay) {
      throw new BirthDateFormatException();
    }
  }

  public static void saveDataToFile(String lastName, String[] userData) {
    try {
      String packageDirectory = "C:\\geekbrains\\java_course_errors\\seminar3\\DZ";

      String filePath = packageDirectory + "\\" + lastName + ".txt";

      BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true));

      String dataToWrite = String.join(" ", userData);

      writer.write(dataToWrite);
      writer.newLine();
      writer.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  // public static void saveDataToFile(String lastName, String[] userData) throws
  // IOException {
  // String packageDirectory = "C:\\geekbrains\\java_course_errors\\seminar3\\DZ";

  // String filePath = packageDirectory + "\\" + lastName + ".txt";

  // BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true));

  // String dataToWrite = String.join(" ", userData);

  // writer.write(dataToWrite);
  // writer.newLine();
  // writer.close();
  // }
}

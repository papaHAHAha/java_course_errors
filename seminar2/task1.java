package seminar2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class task1 {

  public static String PATH = "C:\\geekbrains\\java_course_errors\\seminar2\\task1Names.txt";
  public static void main(String[] args) {
    List<String[]> listNames = readToList(PATH);
    replace(listNames);
    writeToFile(listNames);
  }

  public static List<String[]> readToList(String file){
    List<String[]> result = new ArrayList<>();
    try{
    BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
    String line = "";
    while ((line = bufferedReader.readLine()) != null){
      String[] temp = line.split("=");
      if (!isNum(temp[1]) && !temp[1].equals("?")){
        throw new RuntimeException("Неподходящие данные после '=': " + temp[1]);
      }
      result.add(temp);
    }
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }
    return result;
  }

  public static boolean isNum(String text) {
    try {
      Integer.parseInt(text);
      return true;
    } catch (NumberFormatException e) {
      return false;
    }
  }

  public static void replace(List<String[]> list) {
    for (String[] string : list) {
      if (string[1].equals("?")) {
        string[1] = String.valueOf(string[0].length());
      }
    }
  }

   public static void writeToFile(List<String[]> list){
      try {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(PATH));
        for (String[] item : list) {
          bufferedWriter.write(item[0] + "=" + item[1]);
          bufferedWriter.newLine();
        }
        bufferedWriter.close();
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
  }
}

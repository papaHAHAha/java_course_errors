import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class zadanie3 {
  public static void main(String[] args) {
    String[] array = {null, null, null};
    NotEqualNull(array);
  }

  public static void NotEqualNull(String[] array){
    List<String> nulls = new ArrayList<>(Arrays.asList(array));
    for (Integer i = 0; i < array.length; i++) {
      if(i == null){nulls.add("null");}
    }
    if(nulls.contains(null)){throw new RuntimeException("в массиве встречается null: " + nulls.toString());}
  }
}

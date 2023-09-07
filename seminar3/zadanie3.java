package seminar3;

public class zadanie3 {
  public static void main(String[] args) {
    String[][] array = { { "1", "2", "3", "4" },
        { "1", "2", "3", "4" },
        { "1", "2", "3", "4" },
        { "1", "2", "3", "4" } };

    String[][] array1 = { { "1", "2", "3", "4" },
        { "1", "2", "3", "4" },
        { "1", "2", "3", "4" },
        { "1", "2", "3", "4" },
        { "1", "2", "3", "4" } };

    String[][] array2 = { { "1", "2", "3", "4" },
        { "1", "2", "3", "4" },
        { "1", "2", "3", "4" },
        { "1", "2", "ihhi", "4" } };
        try {
          System.out.println(arrSum(array1));
        } catch (zadanie3ArrSizeExc | zadanie3Dataexc e) {
          System.out.println(e.getMessage());
        }
        
  }

  private static int arrSum(String[][] arr) {
    if (arr.length != 4 || arr[0].length != 4)
      throw new zadanie3ArrSizeExc();
    int result = 0;
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        try {
          int num = Integer.parseInt(arr[i][j]);
          result += num;
        } catch (NumberFormatException e) {
          throw new zadanie3Dataexc(i,j);
        }
      }
    }
    return result;
  }
}

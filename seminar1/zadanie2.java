public class zadanie2 {
  public static void main(String[] args) {
    Integer array[][]= new Integer[2][2];
    array[0][0] = 1;
		array[0][1] = 0;
		array[1][0] = 1;
		array[1][1] = 0;
    System.out.println(limitedAmount(array));
  }

  public static Integer limitedAmount(Integer[][] array){
    int rows = array.length;
    int columns = array[0].length;
    if(rows != columns){throw new RuntimeException("error");}

    int sum = 0;
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array.length; j++) {
        if(array[i][j] != 1 & array[i][j] != 0){throw new RuntimeException("error2");}
        else sum += array[i][j];
      }
    }
    return sum;
  }
}

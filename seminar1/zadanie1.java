public class zadanie1 {
  public static void main(String[] args) {
    int[] array = {1, 2, 3, 4, 5, 6};
    printMsg(checkArray(array, 1, 6));
  }

  public static int checkArray(int[] array, int number, int len){
    if(array == null){return -3;}

    else if(array.length < len){return -1;}

    for (int i = 0; i < array.length; i++) {
      if (array[i] == number){
        return i;
      }
    }
    return -2;
  }

  public static void printMsg(int print){
    if(print == -1){System.out.println("длина массива меньше некоторого заданного минимума");}
    else if(print == -2){System.out.println("Искомый элемент не найден");}
    else if(print == -3){System.out.println("вместо массива пришел null");}
    else System.out.println("Индекс найденного элемента: " + print);
  }
}

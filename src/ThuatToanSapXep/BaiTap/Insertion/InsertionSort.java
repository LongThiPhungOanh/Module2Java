package ThuatToanSapXep.BaiTap.Insertion;
import java.util.Scanner;
public class InsertionSort {
    static int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
    static int[] newList = new int[list.length + 1];
    public static void insertionSort(int[] list) {
        boolean needNextPass = true;
        for (int k = 1; k < list.length && needNextPass; k++) {
            needNextPass = false;
            for (int i = 0; i < list.length - k; i++) {
                if (list[i] > list[i + 1]) {
                    int temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;
                    needNextPass = true;
                }
            }
        }
    }
    public static int[] add(int[] list) {

        System.out.println("Nhập số ban muốn chèn: ");
        Scanner scanner = new Scanner(System.in);
        int check = scanner.nextInt();
        int count = 0;
        for (int i = 0; i < list.length; i++) {
            if (check > list[i]) {
                newList[i] =list[i] ;
                count++;
            } else if (check < list[i]) {
                break;
            }
        }
        newList[count] = check;
        if (newList.length - (count + 1) >= 0)
            System.arraycopy(list, count, newList, count + 1, newList.length - (count + 1));
        return newList;
  }
  public static void display(int[] add){
      System.out.println("Mảng đã được chèn");
      for (int check: add) {
          System.out.println(check);
      }
  }
    public static void main(String[] args) {
        insertionSort(list);
        System.out.println("Mảng ban đầu");
        for (int check : list) {
            System.out.println(check);
        }
       display(add(list));
    }
}


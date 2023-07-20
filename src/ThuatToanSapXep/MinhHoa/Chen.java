package ThuatToanSapXep.MinhHoa;

public class Chen {
    public static void main(String[] args) {
        int[] array = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
        int pos, x;
        for (int i = 1; i < array.length; i++) {
            x = array[i];
            pos = i;
            while (pos > 0 && x < array[pos - 1]) {
                array[pos] = array[pos - 1];
                pos--;
            }
            array[pos] = x;
        }
    }
}

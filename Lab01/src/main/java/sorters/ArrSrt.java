package sorters;


import java.util.Arrays;
/**
 * Here generated arrays from {@link fillers.Fillers} are sorted by {@code Arrays.sort(arr)} <br>
 * @author Polonskiy
 * @version 1.2
 */
public class ArrSrt extends Sorter {
    /**
     * @param arr is an array, get from {@link fillers.Fillers} and set in Analyzer <br>
     * @return arr
     */
    public int[] srtArr(int arr[]) {
        Arrays.sort(arr);

        System.out.print(Arrays.toString(arr) + " ");
        return arr;
    }
}

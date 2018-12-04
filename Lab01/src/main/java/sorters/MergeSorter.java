package sorters;

import java.util.Arrays;

/**
 * Merge Sort is a Divide and Conquer algorithm.<br>
 * It divides input array in two halves, calls itself for the two halves and then merges the two sorted halves.<br>
 * Main is a class where Analyze methods are summoned <br>
 *
 * @author Polonskiy
 * @version 1.2
 */
public abstract class MergeSorter extends Sorter {

    public abstract int[] sorter(int arr[]);

    void merge(int[] part1, int[] part2) {
        int len_1 = part1.length, len_2 = part2.length;
        int a = 0, b = 0, len = len_1 + len_2; // a, b - счетчики в массивах
        int[] result = new int[len];
        for (int i = 0; i < len; i++) {
            if (b < len_2 && a < len_1) {
                if (part1[a] > part2[b]) result[i] = part2[b++];
                else result[i] = part1[a++];
            } else if (b < len_2) {
                result[i] = part2[b++];
            } else {
                result[i] = part1[a++];
            }
        }
//       System.out.println(Arrays.toString(result) + " ");
    }

}

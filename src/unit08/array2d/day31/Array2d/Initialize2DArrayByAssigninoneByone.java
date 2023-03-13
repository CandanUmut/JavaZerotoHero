package unit08.array2d.day31.Array2d;

import java.util.Arrays;

public class Initialize2DArrayByAssigninoneByone {
    public static void main(String[] args) {
        int [][]numbers = new int[3][2];
        System.out.println(Arrays.deepToString(numbers));
        int[] nums0 = {2,3};
        int[] nums1 = {2,31};
        int[] nums2 = {2,323};
        numbers[0]=nums0;
        numbers[1]=nums1;
        numbers[2]=nums2;
        System.out.println(Arrays.deepToString(numbers));

    }
}

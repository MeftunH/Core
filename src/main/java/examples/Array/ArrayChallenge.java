package examples.Array;
/* @author - Maftun Hashimli (maftunhashimli@gmail.com)) */

public class ArrayChallenge {
    //Have the function ArrayChallenge(arr) take the array of numbers stored in arr and return the number that appears most frequently (the mode). For example: if arr contains [10, 4, 5, 2, 4] the output should be 4. If there is more than one mode return the one that appeared in the array first (ie. [5, 10, 10, 6, 5] should return 5 because it appeared first). If there is no mode return -1. The array will not be empty.
    //Examples
    //Input: new int[] {5,5,2,2,1}
    //Output: 5
    //Input: new int[] {3,4,1,6,10}
    //Output: -1
    public static int ArrayChallenge(int[] arr) {
        int max = 0;
        int mode = 0;
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > max) {
                max = count;
                mode = arr[i];
            }
        }
        if (max == 1) {
            return -1;
        }
        return mode;
    }

    public static void main(String[] args) {
        System.out.println(ArrayChallenge(new int[] {5,5,2,2,1}));
        System.out.println(ArrayChallenge(new int[] {3,4,1,6,10}));
    }
}

import java.util.Arrays;

public class Searchin2dArray {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{23,43},{45,65,76}};
        int target = 45;
        int[] ans = search(arr,target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] search(int[][] arr, int target)
    {
        for(int row=0;row< arr.length;row++)
        {
            for(int col=0;col<arr[row].length;col++){
                if(target==arr[row][col]) {
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }

}

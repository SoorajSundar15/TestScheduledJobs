public class Maxin2DArray {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{23,43},{45,65,76,998}};
        int ans = maxinarray(arr);
        System.out.println(ans);

    }
    static int maxinarray(int[][] arr)
    {
        int max = 0;
        for(int row=0;row<arr.length;row++)
        {
            for(int col=0;col<arr[row].length;col++)
            {
                if(arr[row][col]>max)
                {
                    max=arr[row][col];
                }
            }
        }
        return max;
    }
}

public class MinInArray {
    public static void main(String[] args) {
        int[] arr = {23,45,32,12,65,87,9};
        int ans = findmin(arr);
        System.out.println(ans);

    }

    static int findmin(int[] arr)
    {
        int ans = arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]<ans){
                ans=arr[i];
            }
        }
        return ans;
    }
}

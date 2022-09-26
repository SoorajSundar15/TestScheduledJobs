import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {45,877,990,12,34,56,1,2,3,45,5};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the target number to find index");
        int target = sc.nextInt();
//        int ans = linearsearch(arr,target);
        int ans = searchinrange(arr,target,0,4);
        System.out.println(ans);
    }

//    static int linearsearch(int[] arr, int target)
//    {
//        if(arr.length==0)
//        {
//            return -1;
//        }
//        for(int index=0;index<arr.length;index++)
//        {
//            int actual = arr[index];
//            if(actual==target)
//            {
//                return index;
//            }
//
//        }
//        return Integer.MAX_VALUE;

        static int searchinrange(int[] arr, int target, int start, int end)
        {
            if(arr.length==0)
            {
                return -1;
            }
            for(int i=start;i<end;i++)
            {
                if(target==arr[i])
                {
                    return i;
                }
            }
            return Integer.MIN_VALUE;
    }
}

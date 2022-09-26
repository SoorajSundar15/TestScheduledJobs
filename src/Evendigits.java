public class Evendigits {
    public static void main(String[] args) {
        int[] arr = {12,433,343,12,878767};
//        System.out.println(findnum(arr));
        System.out.println(evendigits(arr));

    }

//     static int findnum(int[] nums)
//     {
//         int count=0;
//         for(int num:nums)
//         {
//             if(even(num))
//             {
//                 count++;
//             }
//         }
//         return count;
//     }
//
//     static boolean even(int num) {
//         return digit(num) % 2 == 0;
//     }
//
//     static int digit(int n)
//     {
//         int count=0;
//         while(n>0)
//         {
//             count++;
//             n=n/10;
//         }
//        return count;
//     }


    static int evendigits(int[] num)
    {
        int count=0;
        for(int nums:num)
        {
            if(isEven(nums)){
                count++;
            }

        }
        return count;
    }
    static boolean isEven(int num)
    {
        return numberofdigits(num)%2==0;
    }

    static int numberofdigits(int num)
    {
        int count=0;
        while(num>0)
        {
            num=num/10;
            count++;
        }
        return count;
    }
    }

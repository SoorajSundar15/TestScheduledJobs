import java.util.Scanner;

public class Linearsearch1 {

    public static void main(String[] args) {
        int[] arr = {1,22,33,23,43,55,432,76};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to search");
        int num = sc.nextInt();
        ls(arr,num);
    }

    static void ls(int[] arr, int num)
    {

        boolean flag=false;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==num)
            {
                System.out.println("The number "+ arr[i]+" is found at index:"+ i);
                flag=true;
            }
        }
        if(flag==false)
        {
            System.out.println("The number is not found");
        }
    }
}

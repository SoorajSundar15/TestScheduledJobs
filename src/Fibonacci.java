public class Fibonacci {
    public static void main(String[] args) {
        int a=0;
        int b=1;
        int n=10;
        int count=0;
        while(count<=n)
        {
            System.out.println(a);
            int next = a+b;
            a=b;
            b=next;
            count++;
        }

    }
}

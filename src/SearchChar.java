public class SearchChar {
    public static void main(String[] args) {
        String input = "suraj";
        char ch = 'b';
        System.out.println(searchchar(input,ch));

    }

    static boolean searchchar(String input,char ch)
    {
        if(input.length()==0)
        {
            return false;
        }
        for (int i=0;i<input.length();i++)
        {
            if(ch==input.charAt(i))
            {
                return true;
            }
        }
        return false;
    }
}

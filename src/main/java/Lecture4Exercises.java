public class Lecture4Exercises {

    /*
     *   implement a function that returns factorial of given n
     *   lecture 4 page 15
     */
    public long factorial(int n) {
        long temp = 1;
        for(int i = 1 ; i <= n ; i++)
            temp *= i;
        return temp;
    }

    /*
     *   implement a function that return nth number of fibonacci series
     *   the series -> 1, 1, 2, 3, 5, 8, ...
     *   lecture 4 page 19
     */
    public long fibonacci(int n) {
        long a = 1,b = 1,c = 2;
        for(int i = 3 ; i <= n ; i++)
        {
            c = a + b;
            a = b;
            b = c;
        }
        if(n == 1 || n == 2)
            return 0;
        return c;
    }

    /*
     *   implement a function that return reverse of a given word
     *   lecture 4 page 19
     */
    public String reverse(String word) {
        StringBuilder sb = new StringBuilder();
        for(int i = word.length() - 1; i >= 0;i--)
        {
            sb.append(word.charAt(i));
        }
        return sb.toString();
    }

    /*
     *   implement a function that returns true if the given line is
     *   palindrome and false if it is not palindrome.
     *   palindrome is like 'wow', 'never odd or even', 'Wow'
     *   lecture 4 page 19
     */
    public boolean isPalindrome(String line_x) {
        String l ="";
        for(int i = 0; i < line_x.length(); i++) {
            if(line_x.charAt(i)!=' ')
                line_x = line_x +  line_x.charAt(i);
        }
        for(int i = 0 ; i <= line_x.length() / 2; i++) {
            if(Character.toUpperCase(line_x.charAt(i)) != Character.toUpperCase(line_x.charAt(line_x.length() - i -1 )))
                return false;
        }
        return true;
    }

    /*
     *   implement a function which computes the dot plot of 2 given
     *   string. dot plot of hello and ali is:
     *       h e l l o
     *   h   *
     *   e     *
     *   l       * *
     *   l       * *
     *   o           *
     *   lecture 4 page 26
     */
    public char[][] dotPlot(String str1, String str2) {
        char [][] a = new char[str1.length()][str2.length()];
        for(int i = 0 ;i <str1.length(); i++) {
            for(int j = 0 ; j <str2.length();j++)
            {
                if(str1.charAt(i) != str2.charAt(j))
                    a[i][j] = ' ';
                else
                    a[i][j] = '*';
            }
        }
        return a;
    }
}

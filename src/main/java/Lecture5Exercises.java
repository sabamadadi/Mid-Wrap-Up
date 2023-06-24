import java.util.Random;
public class Lecture5Exercises {

    /*
     *   implement a function to create a random password with
     *   given length using lower case letters
     *   lecture 5 page 14
     */
    public StringBuilder weakPassword(int size) {
        String random = "abcdefghijklmnopqrstuvxyz";
        StringBuilder sb = new StringBuilder(size);


        for(int i = 0 ; i < size ; i++) {
            int character = (int) (random.length() * Math.random());
            sb.append(random.charAt(character));

        }
        return sb;
    }

    /*
     *   implement a function to create a random password with
     *   given length and at least 1 digit and 1 special character
     *   lecture 5 page 14
     */

    public String strongPassword(int length) throws Exception {
            if (length < 3) {
                throw new Exception("Password length must be at least 3");
            }

            Random random = new Random();
            StringBuilder password = new StringBuilder();
            password.append((char) (random.nextInt(10) + '0'));
            password.append((char) (random.nextInt(15) + '!'));
            for (int i = 2; i < length; i++) {
                password.append((char) (random.nextInt(94) + ' '));
            }
            for (int i = 0; i < length; i++) {
                int j = random.nextInt(length);
                char temp = password.charAt(i);
                password.setCharAt(i, password.charAt(j));
                password.setCharAt(j, temp);
            }

            return password.toString();
        }

    /*
     *   implement a function that checks if a integer is a fibobin number
     *   integer n is fibobin is there exist an i where:
     *       n = fib(i) + bin(fib(i))
     *   where fib(i) is the ith fibonacci number and bin(i) is the number
     *   of ones in binary format
     *   lecture 5 page 17
     */
    public boolean isFiboBin(int n) {
        int a = 0;
        int b = 1;
        while (b <= n) {
            int c = a + b;
            if ((n - b) == Integer.bitCount(c)) {
                return true;
            }
            a = b;
            b = c;
        }
        return false;
    }
    }

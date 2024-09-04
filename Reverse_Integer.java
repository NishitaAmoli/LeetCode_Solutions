/* Q7- REVERSE INTEGER
 Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
 */
public class Reverse_Integer {
        public int reverse(int x) {
            int rev=0;
            while(x!=0){
                int digit=x%10;
                int newrev=rev*10+digit;
                if(newrev/10!=rev){
                    return 0;
                }
                rev=newrev;
                x/=10;
            }
            return rev;
        }
}

import java.util.HashSet;
import java.util.Set;
class Solution {
    boolean isHappy(int n) {
        Set<Integer> happy = new HashSet<>();
        do{

            int sum = 0;
            do{
                sum += Math.pow(n % 10, 2);
                n = n / 10;
            }while(n!=0);
            if (sum == 1) return true;

            n = sum;

            if (happy.contains(n))
                return false;
            happy.add(n);
        }while (true);
    }
}
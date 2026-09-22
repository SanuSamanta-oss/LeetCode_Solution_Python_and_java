class Solution {
    public double myPow(double x, int n) {
        
        long power = n;

        // If the power is Negative
        if(power < 0 ){
            x = 1/x ;
            power = -power;
            // You can write power = -power first then x = 1/x ; there is no order specifically.
        }

        double result = 1;

        while (power > 0){
            //  Two condition arises 
            // 1. power is odd
            // 2. power is even
            
            // if power odd 
            if(power % 2 == 1){
                result = result * x;
            }

            // square of x 
            x = x * x;
            power = power / 2;

        }
        return result;
    }
}
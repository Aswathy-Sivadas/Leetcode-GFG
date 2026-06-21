class Solution {
    static int setBits(int n) {
        // code here
        int c=1;
        while(n!=1)
        {
            if(n%2!=0)
            {
                c++;
            }
            n/=2;
        }
        return c;
    }
}
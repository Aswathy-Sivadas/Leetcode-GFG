class Solution {
    public int xorOperation(int n, int start) {
        int nu=0,c=1;;
        for(int i=start;c<=n;i+=2)
        {
            nu^=i;
            c++;
        }
        return nu;
    }
}
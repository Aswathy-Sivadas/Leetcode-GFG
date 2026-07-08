/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int low=1;int mid=0,bad=0;
        while(low<=n)
        {
            mid=low+((n-low)/2);

            if(isBadVersion(mid))
            {
                bad=mid;
                n=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return bad;
    }
}
class CheckBit {
    static boolean checkKthBit(int n, int k) {
        // code here
        // StringBuffer sb=new StringBuffer();
        // while(n!=1)
        // {
        //     sb.append(n%2);
        //     n/=2;
        // }
        if((n&(1<<k))!=0)
        {
            return true;
        }
        else{
            return false;
        }
    }
}
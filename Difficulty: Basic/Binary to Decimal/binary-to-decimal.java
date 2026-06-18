class Solution {
    public int binaryToDecimal(String b) {
        // code here
    int i=b.length()-1,sum=0;
    while(i>=0)
    {
        sum+=((b.charAt(i)-'0')*Math.pow(2,((b.length()-1)-i)));
        i--;}
        return sum;
    }
    
        
    }

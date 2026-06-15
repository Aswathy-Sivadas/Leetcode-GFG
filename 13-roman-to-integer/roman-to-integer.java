class Solution {
    public int romanToInt(String s) {
        char I=1,V=5,X=10,L=50,C=100,D=500,M=1000;
        int sum=0,i=0;
        while( i<s.length())
        {
            if(i+1<s.length() & s.charAt(i)=='I' && s.charAt(i+1)=='V')
            {
                sum+=4;
                i+=2;
            }
            else if(i+1<s.length() & s.charAt(i)=='I' && s.charAt(i+1)=='X')
            {
                sum+=9;
                i+=2;
            }
            else if(i+1<s.length() & s.charAt(i)=='X' && s.charAt(i+1)=='L')
            {
                sum+=40;
                i+=2;
            }
            else if(i+1<s.length() & s.charAt(i)=='X' && s.charAt(i+1)=='C')
            {
                sum+=90;
                i+=2;
            }
            else if(i+1<s.length() & s.charAt(i)=='C' && s.charAt(i+1)=='D')
            {
                sum+=400;
                i+=2;
            }
            else if(i+1<s.length() & s.charAt(i)=='C' && s.charAt(i+1)=='M')
            {
                sum+=900;
                i+=2;
            }
            else if(s.charAt(i)=='I')
            {
                sum+=I;i++;
            }
            else if(s.charAt(i)=='V')
            {
                sum+=V;i++;
            }
            else if(s.charAt(i)=='X')
            {
                sum+=X;i++;
            }
            else if(s.charAt(i)=='L')
            {
                sum+=L;i++;
            }
            else if(s.charAt(i)=='C')
            {
                sum+=C;i++;
            }
            else if(s.charAt(i)=='D')
            {
                sum+=D;i++;
            }
            else if(s.charAt(i)=='M')
            {
                sum+=M;i++;
            }
        }
        return sum;
    }
}
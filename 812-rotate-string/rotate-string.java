class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length())return false;
        String d=goal+goal;
        if(d.contains(s))return true;
        else{
            return false;
        }
    }
}
class Solution {
    public int titleToNumber(String columnTitle) {
        int n=0;
        for(int i=0;i<columnTitle.length();i++){
            n+=(columnTitle.charAt(i)-64)*Math.pow(26, columnTitle.length()-1-i);
            //System.out.println(alpha+" "+n);   
        }
        return n;
        
    }
}
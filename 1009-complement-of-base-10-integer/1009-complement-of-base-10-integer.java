class Solution {
    public int bitwiseComplement(int n) {
        String s=Integer.toBinaryString(n);
        String res="";
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='0'){
                res+='1';
            }
            else{
                res+='0';
            }
            
        }
        return Integer.parseInt(res, 2);
        
    }
}
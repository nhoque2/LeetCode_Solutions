class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength=0, count=0, leftIndex=0;
        String temp="";
        for(int i=0;i<s.length();i++){
            String str = s.substring(i,i+1);
            if(!temp.contains(str)){
                temp+=str;
                maxLength=Math.max(temp.length(), maxLength);
            }
            else{
                //String temp1=temp.substring(1,temp.length());
              
                    temp+=str;
                    temp=temp.substring(temp.indexOf(str)+1,temp.length());
               
     
            }
            //System.out.println(temp+" "+maxLength);
        }
        return maxLength;
        
    }
}
class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.length()==0){
            return 0;
        }
        if(haystack.contains(needle)){
            String temp=haystack.replaceFirst(needle, " ");
            for(int i=0;i<temp.length();i++){
                if(haystack.charAt(i)!=temp.charAt(i)){
                    return i;
                }
            }
        }
        return -1;  
    }
}
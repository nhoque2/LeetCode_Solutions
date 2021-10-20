class Solution {
    public String reverseWords(String s) {
        String[] list = s.replaceAll("( +)"," ").trim().split(" ");
        String res="";
        for(int i=list.length-1;i>=0;i--){
            res+=list[i]+" ";
        }
        return res.trim();
        
    }
}
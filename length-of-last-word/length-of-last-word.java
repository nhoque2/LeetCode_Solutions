class Solution {
    public int lengthOfLastWord(String s) {
        String[] list = s.trim().replaceAll(" +", " ").split(" ");
        return list[list.length-1].length();        
    }
}
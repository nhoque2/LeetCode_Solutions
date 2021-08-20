class Solution {
    public String longestCommonPrefix(String[] strs) { 
        if(strs.length==1){
            return strs[0];
        }
        ArrayList<String> prefixes = new ArrayList<>();
        String prefix="";
        boolean hasPrefix=true;
        for(int i=0;hasPrefix && i<strs.length;i++){
            for(int j=i+1;hasPrefix && j<strs.length;j++){
                int length=Math.min(strs[i].length(),strs[j].length());
                boolean isPrefix=true;
                if(length==0){
                    prefix="";
                    hasPrefix=false;
                }
                for(int k=0;isPrefix && k<length;k++){
                    if(strs[i].charAt(k)==strs[j].charAt(k)){
                        prefix=strs[i].substring(0,k+1);
                  
                    }     
                    
                    else{  
                        if(prefix.length()==length || k==0){
                            prefix="";
                            prefixes.add("");
                        }
                        isPrefix=false;
                    }
                }
                if(prefix.isEmpty()){
                    hasPrefix=false;
                }
                System.out.println();
            }
            prefixes.add(prefix);
        }
        String shortest=prefixes.get(0);
        for(String str : prefixes){
            if (str.length() < shortest.length()) {
                shortest = str;
            }
        }
        
        return shortest;
    }
}
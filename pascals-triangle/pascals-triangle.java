class Solution {
    public List<List<Integer>> generate(int numRows) {
         List<List<Integer>> res = new ArrayList<List<Integer>>();
         
         for(int i=0;i<numRows;i++){
             List<Integer> temp= new ArrayList<Integer>();
             temp.add(1);
             if(i==1){
                 temp.add(1);
             }
             else if(i>=2){
                  for(int j=1;j<i;j++){
                    //System.out.println(res.get(i-1));
                    temp.add(res.get(i-1).get(j)+res.get(i-1).get(j-1));
                  }
                  temp.add(1);
             }    
             res.add(temp);
         }
        return res;
        
    }
}
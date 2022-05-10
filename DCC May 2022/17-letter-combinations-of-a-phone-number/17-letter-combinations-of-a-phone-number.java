class Solution {
    public List<String> letterCombinations(String digits) {
        LinkedList<String> output_arr = new LinkedList();
        if(digits.length() == 0) return output_arr;
        output_arr.add("");
        
        String[] map = new String[] {"0","1","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        
        for(int i=0; i< digits.length() ;i++){
            int index = Character.getNumericValue(digits.charAt(i));
            while(output_arr.peek().length() == i){
                String permutation = output_arr.remove();
                for( char c: map[index].toCharArray()){
                    output_arr.add(permutation + c);
                }
            }
        }
        return output_arr;
    }
}
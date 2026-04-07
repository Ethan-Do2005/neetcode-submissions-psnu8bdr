class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String str : strs){
            sb.append(str.length()).append("#").append(str);
        }

        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        int i =0;
        int j = 0;
        while(i < str.length()){
            j = i;
            while(str.charAt(j) != '#') j++;
            String length1 = str.substring(i,j);
            int length = Integer.parseInt(length1);
            
            int start = j + 1;
            int end = j + 1 + length;

            String s = str.substring(start,end);
            res.add(s);
            i = j + 1 + length;
        }

        return res;
    }
    /*
    Using two pointer
    */
}

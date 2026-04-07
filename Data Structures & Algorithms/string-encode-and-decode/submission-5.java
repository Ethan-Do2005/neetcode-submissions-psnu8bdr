class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String s : strs){
            sb.append(s.length()).append('#').append(s);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();

        int i = 0;
        while(i < str.length()){
            int j = i;
            while(str.charAt(j) != '#') j++;
            int len = Integer.parseInt(str.substring(i,j));
            int start = j + 1;
            result.add(str.substring(start, start+len));
            i = start + len;
        }

        return result;
    }
}
/*
Encode:
Input ["neet","code","love","you"]
Output: 4#neet4#code4#love3#you

First wrap
+ The length of each string (strs.length)
+ Add '#' (add )
+ Add that word (add strs)

Decode:
Input [4#neet4#code4#love3#you]
Output ["neet","code","love","you"]
*/

class Solution {
    public String mergeAlternately(String n, String m) {

        StringBuilder sb = new StringBuilder();
        int i =0;
        int j = 0;

        while(i< n.length() || j<m.length()){


            //string 1 se word lene hain
            if(i< n.length()){
                sb.append(n.charAt(i));
                i++;
            }
            
            if(j< m.length()){
                sb.append(m.charAt(j));
                j++;
            }
        }

        return sb.toString();
        
    }
}
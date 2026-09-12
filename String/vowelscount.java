class Solution {
    public int maxVowels(String s, int k) {
        int n = s.length();
        int vcount =0 ;
        
      for(int i =0 ; i<n ; i++){
        if(isVowel(s.charAt(i)))
        vcount++;
      }
      int max = vcount;
      for(int i = k ; i<n ;i++){
        if(isVowel(s.charAt(i -k))){
            vcount--;
        }
        if(isVowel(s.charAt(i))){
            vcount++;
        }
        max =Math.max(max , vcount);
      }
      return max ;

    }
    public boolean isVowel(char ch){
        return ch =='a' || ch =='i' || ch == 'o' || ch == 'e' || ch == 'u';
    }
}

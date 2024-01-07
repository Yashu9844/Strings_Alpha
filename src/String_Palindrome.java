public class String_Palindrome {        //Palindrome it should same when we read from Both A Side
    static boolean isPalindrome(String arr){
        int n = arr.length();
         for(int i=0;i<n/2;i++){
             if(arr.charAt(i) != arr.charAt(n-i-1)){
                 return false;
             }
         }
         return true;
    }

    public static void main(String[] args) {
        String yashu="racecar";

        System.out.println(isPalindrome(yashu));
    }
}

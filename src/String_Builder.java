public class String_Builder {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("");
        for(char ch ='a';ch<='z';ch++){
            sb.append(ch);
        }
        System.out.println(sb);
        System.out.println(sb.length());
       String str1 = "hello";
        System.out.println(str1.toUpperCase());
    }
}
            // this 0(26n) = 0n    which is efficient

        // the one which wrote in book is 0n^2 = not efficient
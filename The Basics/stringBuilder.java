public class stringBuilder {
    public static void main(String[] args) throws Exception {
        //we can create mutable strings with string builder 
        StringBuilder sb = new StringBuilder("new string builder string");
        System.out.println(sb);

        char ch = sb.charAt(0);
        System.out.println(ch);

        sb.setCharAt(5, 'x');
        System.out.println(sb);

        sb.deleteCharAt(5);
        System.out.println(sb);
    }
}

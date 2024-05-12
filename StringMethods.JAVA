public class StringMethods {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        boolean match = str1.regionMatches(0, str2, 0, 5);
        System.out.println("regionMatches(): " + match);
        boolean startsWith = str2.startsWith("Wor");
        System.out.println("startsWith(): " + startsWith); 
        boolean endsWith = str1.endsWith("lo");
        System.out.println("endsWith(): " + endsWith);
        int firstIndex = str2.indexOf('o');  
        int lastIndex = str2.lastIndexOf('o');
        System.out.println("indexOf('o'): " + firstIndex); 
        System.out.println("lastIndexOf('o'): " + lastIndex);
    }
}

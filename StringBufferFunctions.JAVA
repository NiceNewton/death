public class StringBufferFunctions {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Java is my favorite Programming Language");
        sb.append("!");
        System.out.println("append(): " + sb);
        sb.insert(20, " Object-Oriented ");
        System.out.println("insert(): " + sb);

        sb.delete(22, 33);
        System.out.println("delete(): " + sb);
        sb.ensureCapacity(100);
        int capacity = sb.capacity();
        System.out.println("capacity(): " + capacity);
        sb.reverse();
        System.out.println("reverse(): " + sb);
    }
}

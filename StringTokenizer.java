import java.util.StringTokenizer;

class Test {
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("Deepak gupta");
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}

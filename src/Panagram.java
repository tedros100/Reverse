// is sentence a panagram
public class Panagram {
    public static void main(String[] args) {
        String s= "Hello world";
        System.out.println(isPanagram(s.toLowerCase()));

    }
    private static boolean isPanagram(String s) {
        //todo Auto-generated method stub
        if (s.length() < 26) {
            return false;
        } else {
            for (char ch='a'; ch<= 'z'; ch++) {
                if(s.indexOf(ch) <0) {
                    return false;
                }
            }
        }
    return true;
    }
}

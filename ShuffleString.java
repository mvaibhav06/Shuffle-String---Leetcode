import java.util.HashMap;

public class ShuffleString {
    public static String restoreString(String s, int[] indices){
        HashMap<Integer, Character> temp = new HashMap<>();

        for (int i=0; i<indices.length; i++){
            temp.put(indices[i], s.charAt(i));
        }
        String out = "";
        for (int i=0; i<s.length(); i++){
            out += temp.get(i);
        }
        return out;
    }
    public static void main(String[] args) {

    }
}

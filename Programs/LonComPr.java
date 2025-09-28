public class LonComPr {
    public static void main(String[] args) {
        String[] s1 = {"flower","flow","flight"};
        String[] s2 = {"dog","racecar","car"};

        System.out.println(pref_check(s1)+"\n"+pref_check(s2)); 
    }

    public static String pref_check(String[] strs) {

        if (strs == null || strs.length == 0) return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) { 

            prefix = prefix.substring(0, prefix.length() - 1);
            if (prefix.isEmpty()) return "";

            }
        }
        return prefix;
    }
}
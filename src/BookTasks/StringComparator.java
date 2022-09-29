package BookTasks;

public class StringComparator {
    public static int compare(String o1, String o2) {
        int l1 = o1.length();
        int l2 = o2.length();
        int lmin = Math.min(l1, l2);

        for (int i = 0; i < lmin; i++) {
            int str1_ch = (int)o1.charAt(i);
            int str2_ch = (int)o2.charAt(i);

            if (str1_ch != str2_ch) {
                return str1_ch - str2_ch;
            }
        }

        if (l1 != l2) {
            return l1 - l2;
        }
        else {
            return 0;
        }
    }
}



public class plusOut {
    public static void main(String[] args) {
        System.out.println(plusOut("12xy34", "xy"));
    }   

    public static String plusOut(String str, String word) {
        int len_str = str.length();
        int len_word = word.length();
        int extra_character_skip = 1;
        String string_holder = "";

        for (int i = 0; i < len_str; i++) {
            if (i <= len_str - len_word) {
                String place_holder = str.substring(i, i + len_word);
                if (place_holder.equals(word)) {
                    string_holder = string_holder + word;
                    i = i + len_word - extra_character_skip;
                } else {
                    string_holder = string_holder + "+";
                }
            } else {
                string_holder = string_holder + "+";
            }
        }
        return string_holder;
    }
}




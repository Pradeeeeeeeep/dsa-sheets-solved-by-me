package Search;

public class searchInString {
    static void main(String[] args) {
        String name = "Pradeep";
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == 'p') {
                System.out.println(i);
            }
        }
    }
}

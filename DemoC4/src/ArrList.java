import java.util.ArrayList;

public class ArrList {
    public static void main(String[] args) {
        ArrayList<String> colors= new ArrayList<String>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.remove("Green");
        colors.add("Pink");
        System.out.println(colors.get(1));
        System.out.println(colors.contains("Orange"));
        System.out.println(colors.size());
        System.out.println(colors);
    }
}

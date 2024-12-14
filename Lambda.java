import java.util.ArrayList;
import java.util.List;

public class Lambda {

    public static void main(String[] args) {
        
        List<String> names = List.of("Anudeep", "Priya", "Akshara", "Ayansh", "Sandeep");

        List<String> filteredList = names.stream().filter(name -> name.startsWith("A")).toList();
        for (String name : filteredList) {
            System.out.println(name);
        }


    }
}
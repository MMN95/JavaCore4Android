import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Phonebook {

    private final Map<String, List<String>> contacts = new HashMap<>();

    public void add(String surname, String phone){
        contacts.computeIfAbsent(surname, p -> new ArrayList<>()).add(phone);
    }

    public void get(String surname){
        if (contacts.containsKey(surname)){
            System.out.println(surname + ": " + contacts.get(surname));
        } else
            System.out.println("В справочнике не нашлось информации по фамилии " + surname);
    }



}

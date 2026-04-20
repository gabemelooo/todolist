package Service;
import java.util.ArrayList;

public class ListTasks {

    public static void list(ArrayList<String> tasks){
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println(tasks.get(i));
        }
    }
}

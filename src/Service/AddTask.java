package Service;

import java.util.Scanner;
import java.util.ArrayList;

public class AddTask {

    ArrayList<String> tasks = new ArrayList<>();

     public void newTask() {
        Scanner scan = new Scanner (System.in);
        System.out.print("\nName your task: ");

        tasks.add(scan.nextLine());
        System.out.println();
    }

}

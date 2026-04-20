package UI;

import java.util.Scanner;

public class Menu {

    public void menuToDo(){
        System.out.println("TO-DO LIST");
        System.out.println("\n1. Add a new note");
        System.out.println("2. List existing notes");
        System.out.println("3. Quit");
    }

    public int choice(){
        Scanner scan = new Scanner(System.in);
        System.out.print("\nChoose an option (1 - 3): ");
        int option = scan.nextInt();
        return option;
    }

}

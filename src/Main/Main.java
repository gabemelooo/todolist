import Service.AddTask;
import Service.ListTasks;
import UI.Menu;

void main() {
    Menu menu = new Menu();
    AddTask addtask = new AddTask();
    ListTasks listtasks = new ListTasks();
    boolean loop = true;

    while (loop){
    menu.menuToDo();
    int option = menu.choice();

    if(option == 1) {
        addtask.newTask();
    } else if(option == 2){
        ListTasks.list(addtask.newTask());
        }
    }
}

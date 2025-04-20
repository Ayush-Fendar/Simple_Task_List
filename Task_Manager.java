import java.util.Scanner;  // reads input from userṇ
import java.util.ArrayList;  // stores the task in list
  

public class Task_Manager {
 private static ArrayList<String> tasks= new ArrayList<>();
 private static Scanner scanner = new Scanner(System.in);

 public static void main(String[] args) {
      while(true)   // infinite loop to keep the menu during program termination
      {
        showMenu();
        int choice=scanner.nextInt();      // read user choice
        scanner.nextLine();               //consume the newline characterṇ

        switch(choice) 
        {
            case 1 :
               addTask();                // call method to add
               break;
            case 2:
               removeTask();            // call method to remove 
               break;
            case 3:
               listTasks();               // call method to list all tasks
               break;
            case 4:
               System.out.println("Exiting.......GOODBYE !!!");
               return;                   // end 
            default:
               System.out.println("Invalid choice please try again.");       
        }
    }
}

private static void showMenu()
{ 
    System.out.println("\n<! ===================================== !>");
    System.out.println("         TASK LIST MANAGER             ");
    System.out.println("<! ======================================== !>");
    System.out.println("1.  Add Task ");
    System.out.println("2.  Remove Task");
    System.out.println("3.  List Task ");
    System.out.println("4.  Exit ");
    System.out.println("----------------------------------------------");
    System.out.println("Choose an option:-");
}

private static void addTask()
{ 
    System.out.println("Enter task :-");
    String task=scanner.nextLine();
    tasks.add(task);
    System.out.println("Task added successfully");
}

private static void removeTask() {
   listTasks(); // Show all tasks
   if (tasks.isEmpty()) {
       return; // Stop if no tasks are available
   }
   System.out.print("Enter task number to remove: ");
   int index = scanner.nextInt() - 1; // Convert to list index
   scanner.nextLine(); // Consume newline

   if (index >= 0 && index < tasks.size()) {
       tasks.remove(index); // Remove the task
       System.out.println("Task removed successfully!");
   } else {
       System.out.println("Invalid task number.");
   }
}
private static void listTasks() {
    if (tasks.isEmpty()) {
        System.out.println("No tasks found.");
    } else {
        System.out.println("\nYour Tasks:");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));
        }
    }
}

    
}

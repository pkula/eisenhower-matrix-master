import java.util.*;
import java.time.LocalDate;

//This is the file containing a logic of an Eisenhower todo_quarter.

class TodoQuarter {


    private List<TodoItem> todoItems;

    TodoQuarter() {
        todoItems = new ArrayList<TodoItem>();
    }


    void addItem(String title, LocalDate deadline) {
        for (int i=0;i<todoItems.size();i++){
            if (todoItems.get(i).getDeadline().isBefore(  deadline  )){
                todoItems.add(i, new TodoItem(title,deadline));
                return;
            }
        }
        todoItems.add(new TodoItem(title,deadline));
    }

//Append TodoItem object to todoItems sorted decreasing by deadline.

    void removeItem(int index) {
        todoItems.remove(index);
    }


    void archiveItems() {
        for (int i = 0; i < todoItems.size(); i++) {
            if (todoItems.get(i).isDone) {
                todoItems.remove(i);
            }
        }
    }


    TodoItem getItem(int index) {
        return todoItems.get(index);
    }


    List<TodoItem> getItems() {
        return todoItems;
    }
}

    toString(){
        String str;
        for (int i=0;i<todoItems.size();i++){
            str = str +
        }


    }

///Returns a formatted list of todoItems sorted decreasing by deadline. There is an expecting output:

// 2. [x] 11-6 submit assignment```
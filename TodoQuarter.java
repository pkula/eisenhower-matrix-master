import java.util.*;

//This is the file containing a logic of an Eisenhower todo_quarter.

class TodoQuarter {


    private List<TodoItem> todoItems;

    TodoQuarter() {
        todoItems = new ArrayList<TodoItem>();
    }


   /* void addItem(String title, LocalDate deadline) {
        todoItems.add()
    }*/

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

  //  toString()

///Returns a formatted list of todoItems sorted decreasing by deadline. There is an expecting output:

// 2. [x] 11-6 submit assignment```
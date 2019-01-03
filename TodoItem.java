import java.time.LocalDate;
//This is the file containing a todoItem logic.

class TodoItem {


    private String title;

    private LocalDate deadline;

    public boolean isDone;

    //description: contains true if TODO item is done, otherwise contains false. Default value is false


    TodoItem(String title, LocalDate deadline) {
        this.title = title;
        this.deadline = deadline;
        isDone = false;

    }


    String getTitle() {
        return title;
    }


    LocalDate getDeadline() {
        return deadline;
    }


    void mark() {
        isDone = true;
    }

    void unmark() {
        isDone = false;
    }


    public String toString() {
        //String day = deadline.toString().substring(5,7);
        //String day = deadline.toString().substring(8);
        if (isDone) {
            return "[x] " + deadline.toString().substring(5) + " " + title;
        } else {
            return "[ ] " + deadline.toString().substring(5) + " " + title;
        }
        //[x] 12-6 submit assignment
    }
}
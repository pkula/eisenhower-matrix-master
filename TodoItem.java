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

/*
    toString() {

        Returns a formatted string with details about todoItem.Format of deadline is 'day-month'

        Expecting output for example done item:

        [x]12 - 6 submit assignment

        Expecting output for example undone item:

        [ ]28 - 6 submit assignment
    }*/
}
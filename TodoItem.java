//This is the file containing a todoItem logic.

class TodoItem{


}
    string title;

    LocalDate deadline;

    boolean isDone;

        //description: contains true if TODO item is done, otherwise contains false. Default value is false






    TodoItem(String title, LocalDate deadline){

    }


    String getTitle(){
        return title;
    }



    LocalDate getDeadline(){
        return deadline;
    }


    void mark(){
        isDone = True;
    }

    void unmark(){
        isDone = False;
    }


    toString() {

        Returns a formatted string with details about todoItem.Format of deadline is 'day-month'

        Expecting output for example done item:

        [x]12 - 6 submit assignment

        Expecting output for example undone item:

        [ ]28 - 6 submit assignment
    }
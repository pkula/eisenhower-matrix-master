import java.util.*;
import java.time.LocalDate;
import java.lang.String;


class TodoMatrix{

    Map<String,TodoQuarter> todoQuarters;

//key: String - status of todoQuarter, value: TodoQuarter object

//possible keys of TODO quarter:
//- 'IU' means that todoQuarter contains important todoItems & urgent
//- 'IN' means that todoQuarter contains important todoItems & not urgent
//- 'NU' means that todoQuarter contains not important todoItems & urgent
//- 'NN' means that todoQuarter contains not important & not urgent todoItems


    TodoMatrix(){
        todoQuarters = new HashMap<>();
        todoQuarters.put("IU",new TodoQuarter());
        todoQuarters.put("IN",new TodoQuarter());
        todoQuarters.put("NU",new TodoQuarter());
        todoQuarters.put("NN",new TodoQuarter());
    }


    Map getQuarters(){
        return todoQuarters;
    }


    TodoQuarter getQuarter(String status){
        return todoQuarters.get(status);
    }


    void addItem(String title, LocalDate deadline, boolean isImportant){
        LocalDate nowww = LocalDate.now();
        if (isImportant){

            if (deadline.isBefore(nowww.plusDays(3))){
                todoQuarters.get("IU").addItem(title,deadline);
            }
            else{
                todoQuarters.get("IN").addItem(title,deadline);
            }
        }
        else{
            if (deadline.isBefore(nowww.plusDays(3))){
                todoQuarters.get("NU").addItem(title,deadline);
            }
            else{
                todoQuarters.get("NN").addItem(title,deadline);
            }

        }
    }

//Adds new item to map todoQuarters using adequate key. You should use method addItem from TodoQuarter class.

//This method should be overloaded so as to accept two parameters only. In that case, isImportant should be false by default.



  /*  addItemsFromFile(String fileName)

Reads data from fileName.csv file and appends TodoItem objects to attributes todoItems in the properly TodoQuarter objects. Every item is written in a separate line the following format:

title|day-month|is_important

If isImportant is equal to false then last element is an empty string. Otherwise the last element is an arbitrary string. If the last element of line is an empty string, isImportant is equal to false - it means that the item should be assigned to a not important TODO quarter. Otherwise item should be assign to an important TODO quarter.

    saveItemsToFile(String fileName)

Writes all details about TODO items to fileName.csv file Every item is written in a separate line the following format:

title|day-month|is_important

If isImportant contains false then the last element of line should be an empty string. Otherwise last element is an arbitrary string.
*/

    void archiveItems(){
        todoQuarters.get("IU").archiveItems();
        todoQuarters.get("IN").archiveItems();
        todoQuarters.get("NU").archiveItems();
        todoQuarters.get("NN").archiveItems();
    }

//Removes all TodoItem objects with a parameter isDone set to true from list todoItems in every element of dictionary todoQuarters

    public String toString(){
        String s = "";
        s = s + "important & urgent\n";
        s = s + todoQuarters.get("IU").toString() + "\n";
        s = s + "important & not urgent\n";
        s = s + todoQuarters.get("IN").toString() + "\n";
        s = s +"not important & urgent\n";
        s = s + todoQuarters.get("NU").toString() + "\n";
        s = s + "not important & not urgent\n";
        s = s + todoQuarters.get("NN").toString() + "\n";
        return s;
    }

//Returns a todoQuarters list (an Eisenhower todoMatrix) formatted to string.








}
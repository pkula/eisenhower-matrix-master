import java.util.*;


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
/*

    addItem(String title, LocalDate deadline, boolean isImportant)

Adds new item to map todoQuarters using adequate key. You should use method addItem from TodoQuarter class.

This method should be overloaded so as to accept two parameters only. In that case, isImportant should be false by default.

    addItemsFromFile(String fileName)

Reads data from fileName.csv file and appends TodoItem objects to attributes todoItems in the properly TodoQuarter objects. Every item is written in a separate line the following format:

title|day-month|is_important

If isImportant is equal to false then last element is an empty string. Otherwise the last element is an arbitrary string. If the last element of line is an empty string, isImportant is equal to false - it means that the item should be assigned to a not important TODO quarter. Otherwise item should be assign to an important TODO quarter.

saveItemsToFile(String fileName)

Writes all details about TODO items to fileName.csv file Every item is written in a separate line the following format:

title|day-month|is_important

If isImportant contains false then the last element of line should be an empty string. Otherwise last element is an arbitrary string.

    archiveItems()

//Removes all TodoItem objects with a parameter isDone set to true from list todoItems in every element of dictionary todoQuarters

    toString()

//Returns a todoQuarters list (an Eisenhower todoMatrix) formatted to string.



*/
}
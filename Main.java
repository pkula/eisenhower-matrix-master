import java.util.*;
import java.time.LocalDate;


public class Main{
    public static void main(String args[]){
        LocalDate dead =  LocalDate.now();
        TodoMatrix matrix = new TodoMatrix();
        matrix.addItem("kurwa mac",dead.plusDays(10),false);
        matrix.addItem("kurwa mac",dead,false);
        matrix.addItem("kurwa mac",dead,false);
        matrix.addItem("kurwa mac",dead,false);
        matrix.addItem("kurwa mac",dead,false);
        matrix.addItem("kurwa mac",dead,false);
        System.out.println(matrix.toString());
    }

}

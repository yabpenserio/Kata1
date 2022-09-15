package kata1;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Kata1 {

    public static void main(String[] args) {
        Calendar date;
        date = GregorianCalendar.getInstance();
        date.set(2002,7,6);
        
        Person person = new Person("Sara", date);
        System.out.println(person.getName() + " tiene " + person.getAge() 
                + " años");
    }
    
}

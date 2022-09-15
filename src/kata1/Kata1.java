package kata1;

import java.time.LocalDate;


public class Kata1 {

    public static void main(String[] args) {
        LocalDate date;
        date = LocalDate.of(2002,8,6);
        
        Person person = new Person("Sara", date);
        System.out.println(person.getName() + " tiene " + person.getAge() 
                + " años");
    }
    
}

package Common;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Validations {

    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private LocalDate date = null;

    public int getIntFromInput(String name, int con1, int con2) {
        Scanner sc = new Scanner(System.in);
        int number;
        while (true) {
            System.out.print(String.format("Enter %s: ", name));
            try {
                number = sc.nextInt();
                if (number > con1 && number < con2) {
                    return number;
                } else {
                    System.out.println("Please enter the integer number > " + con1 +  " and < " + con2);
                }
            } catch (InputMismatchException e) {
                System.out.println("Only enter the integer number > 0 ");
                sc.next();
            }
        }
    }
    
 
  
    
    public LocalDate getDateFromInput(String name) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print(String.format("Enter %s: ", name));
            String dateString = sc.nextLine();
            if (!dateString.isEmpty()) {
                try {
                    date = LocalDate.parse(dateString, formatter);
                    if (date.getYear() > 1950 && date.getYear() < 2024) {
                        return date;
                    } else {
                        System.out.println("Invalid date. Try again");
                    }
                } catch (DateTimeParseException ex) {
                    System.out.println(String.format("Invalid date format. Please enter again"));
                }
            }
        }
    }


    public String getString(String name) {
        Scanner sc = new Scanner(System.in);
        String s = null;
        while (s == null || s.isEmpty()) {
            System.out.print(String.format("Enter %s: ", name));
            s = sc.nextLine();
        }
        return s;
    }
    public String inputPatter(String name, String pattern) {
        Scanner sc = new Scanner(System.in);
        String s = null;
        do {
            System.out.print(String.format("Enter %s: ", name));
            s = sc.nextLine();
        } while (s == null || s.isEmpty() || !s.matches(pattern));
        return s;
    }

}

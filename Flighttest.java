import java.text.NumberFormat;
import java.util.*;



public class Flighttest{
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);

        int sentinel = 1;  //sentinel
        
        //while loop
        while (sentinel != 0){

        //variables
        //airline name, flight number, flight's origin, destination,

        System.out.println("Enter flight number");
            while (!in.hasNextInt()) {
            System.out.println("Please enter an integer");
            in.next();
        }
            int flightnum = in.nextInt();

        System.out.println("Enter airline name");
            while (!in.hasNext()) {
            System.out.println("Please enter a string");
            in.next();
        }
            String airname = in.next();
        
        System.out.println("Enter airport of origin");
            while (!in.hasNext()) {
            System.out.println("Please enter a string");
            in.next();
        }
            String origin = in.next();

        System.out.println("Enter destination(s)"); //demarcate values with a comma
            while (!in.hasNext()) {
            System.out.println("Please enter a string");
            in.next();
        }
            //String [] destinations = in.next().toString();
            String destination = in.next();
            Book newFlight = new Book(airname, flightnum, origin, destination);  //constructor

            newFlight.flightDeclaration();

            System.out.println("Do you want to book another flight? (press 0 to end/any other number to continue)");
            while (!in.hasNextInt()) {
                System.out.println("Please enter a value");
                in.next();
            }
                sentinel = in.nextInt();

        }
       


    }
}
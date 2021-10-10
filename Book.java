import java.lang.reflect.Array;

//import java.util.Scanner;

public class Book{

//airline name, flight number, flight's origin, destination,  
    private String airname;
    private int flightnum;
    private String origin;
    private String destination;

    public Book(String aname, int fnum, String origin, String dest){
        aname = this.airname;
        fnum = this.flightnum;
        origin = this.origin;
        dest = this.destination;

    }

    public String getAirlineName(){
        return this.airname;
    }

    public int getFlightNumber (){
        return this.flightnum;
    }

    public String getOrigin(){
        return this.origin;
    }

    public String getDestinations(){
        return this.destination;
    }

    //Setters could have input validation
    public void setAirlineName(String aname){
        aname = this.airname;
    }

    public void setFlightNumber (int fnum){
        fnum = this.flightnum;
    }

    public void setOrigin(String origin){
        origin = this.origin;
    }

    public void setDestinations(String dest){
        dest = this.destination;
    }

    //toString method
    public String flightDeclaration(){
        return "Your flight with " + this.airname + "from " + this.origin + "to " + this.destination + "has a flight number of: " + this.flightnum;
    }
}
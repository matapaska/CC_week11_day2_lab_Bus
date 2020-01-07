import java.util.ArrayList;

public class Bus {

   private String destination;
   private int capacity;
   private ArrayList<Person> passengers;

   public Bus(String destination, int capacity) {
       this.destination = destination;
       this.capacity = capacity;
       this.passengers = new ArrayList<Person>();
   }

    public int passengerCount() {
       return passengers.size();
    }

    public void addPassenger(Person person) {
        if (this.passengers.size() < this.capacity) {
            passengers.add(person);
        }
    }

    public void removePassenger() {
       this.passengers.remove(0);
    }

    public void pickUpPassenger(BusStop busStop) {
       Person person = busStop.removePerson();
       passengers.add(person);
    }
}

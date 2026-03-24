abstract class Room {
    private String type;
    private double price;
    private String amenities;
    public Room(String type, double price, String amenities) {
        this.type = type;
        this.price = price;
        this.amenities = amenities;
    }
    public String getType() { return type; }
    public double getPrice() { return price; }
    public String getAmenities() { return amenities; }
    public abstract void displayRoomDetails();
}

class SingleRoom extends Room {
    public SingleRoom() { super("Single Room", 100.0, "1 Bed, Free Wi-Fi"); }
    public void displayRoomDetails() {
        System.out.println("Type: " + getType() + " | Price: $" + getPrice() + " | Amenities: " + getAmenities());
    }
}

class DoubleRoom extends Room {
    public DoubleRoom() { super("Double Room", 180.0, "2 Beds, AC, Free Wi-Fi"); }
    public void displayRoomDetails() {
        System.out.println("Type: " + getType() + " | Price: $" + getPrice() + " | Amenities: " + getAmenities());
    }
}

class SuiteRoom extends Room {
    public SuiteRoom() { super("Luxury Suite", 450.0, "King Bed, Mini-Bar, Sea View"); }
    public void displayRoomDetails() {
        System.out.println("Type: " + getType() + " | Price: $" + getPrice() + " | Amenities: " + getAmenities());
    }
}

public class UseCase2RoomInitialization {
    public static void main(String[] args) {
        System.out.println("====================================================");
        System.out.println("       BOOK MY STAY - UC2: ROOM INITIALIZATION      ");
        System.out.println("====================================================");
        Room s = new SingleRoom();
        Room d = new DoubleRoom();
        Room st = new SuiteRoom();
        int singleAvailable = 10;
        int doubleAvailable = 5;
        int suiteAvailable = 2;
        s.displayRoomDetails();
        System.out.println("   Availability: " + singleAvailable + " rooms remaining.");
        System.out.println("----------------------------------------------------");
        d.displayRoomDetails();
        System.out.println("   Availability: " + doubleAvailable + " rooms remaining.");
        System.out.println("----------------------------------------------------");
        st.displayRoomDetails();
        System.out.println("   Availability: " + suiteAvailable + " rooms remaining.");
        System.out.println("====================================================");
    }
}

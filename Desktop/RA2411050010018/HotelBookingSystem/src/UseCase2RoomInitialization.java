/**
 * Book My Stay App - Use Case 2
 * Purpose: Room Initialization using Abstraction and Inheritance.
 * Version: 2.0
 */
public class UseCase2RoomInitialization {

    // --- 1. ABSTRACT CLASS (Must be static to be used in main) ---
    static abstract class Room {
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

    // --- 2. CONCRETE CLASSES (Must also be static) ---

    static class SingleRoom extends Room {
        public SingleRoom() {
            super("Single Room", 100.0, "1 Bed, Free Wi-Fi");
        }
        @Override
        public void displayRoomDetails() {
            System.out.println("Type: " + getType() + " | Price: $" + getPrice() + " | Amenities: " + getAmenities());
        }
    }

    static class DoubleRoom extends Room {
        public DoubleRoom() {
            super("Double Room", 180.0, "2 Beds, AC, Free Wi-Fi");
        }
        @Override
        public void displayRoomDetails() {
            System.out.println("Type: " + getType() + " | Price: $" + getPrice() + " | Amenities: " + getAmenities());
        }
    }

    static class SuiteRoom extends Room {
        public SuiteRoom() {
            super("Luxury Suite", 450.0, "King Bed, Mini-Bar, Sea View");
        }
        @Override
        public void displayRoomDetails() {
            System.out.println("Type: " + getType() + " | Price: $" + getPrice() + " | Amenities: " + getAmenities());
        }
    }

    // --- 3. MAIN ENTRY POINT ---
    public static void main(String[] args) {
        System.out.println("====================================================");
        System.out.println("       BOOK MY STAY - UC2: ROOM INITIALIZATION      ");
        System.out.println("====================================================");

        // Polymorphism in action
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
        System.out.println("Application Version: 2.0 | Execution: Success");
    }
}
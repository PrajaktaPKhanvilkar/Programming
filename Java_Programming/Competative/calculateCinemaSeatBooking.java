import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class calculateCinemaSeatBooking {

    // Simple Seat class to track state
    static class Seat {
        String id;
        double price;
        boolean isBooked;

        Seat(String id, double price) {
            this.id = id;
            this.price = price;
            this.isBooked = false;
        }
    }

    private final Map<String, Seat> seatMap = new HashMap<>();
    private final int totalSeats;
    private int remainingSeats;

    public calculateCinemaSeatBooking() {
        // Initialize rows with different prices
        // Row A: $15.0, Row B: $12.0, Row C: $10.0
        initializeRow("A", 5, 15.0);
        initializeRow("B", 5, 12.0);
        initializeRow("C", 5, 10.0);
        
        this.totalSeats = seatMap.size();
        this.remainingSeats = totalSeats;
    }

    private void initializeRow(String rowLabel, int seatCount, double price) {
        for (int i = 1; i <= seatCount; i++) {
            String seatId = rowLabel + i;
            seatMap.put(seatId, new Seat(seatId, price));
        }
    }

    public synchronized void bookSeats(List<String> seatIds) {
        System.out.println("\n--- Processing Booking Request for: " + seatIds + " ---");
        
        // 1. Validate seat existence and availability
        for (String id : seatIds) {
            Seat seat = seatMap.get(id);
            if (seat == null) {
                System.out.println("Result: FAILED (Seat " + id + " does not exist)");
                return;
            }
            if (seat.isBooked) {
                System.out.println("Result: FAILED (Seat " + id + " is already booked)");
                return;
            }
        }

        // 2. Calculate costs
        double rawTotal = 0;
        for (String id : seatIds) {
            rawTotal += seatMap.get(id).price;
        }

        // 3. Apply group discount if group size >= 6
        double finalTotal = rawTotal;
        if (seatIds.size() >= 6) {
            finalTotal = rawTotal * 0.90; 
        }

        // 4. Commit booking state change
        for (String id : seatIds) {
            seatMap.get(id).isBooked = true;
        }
        remainingSeats -= seatIds.size();

        // 5. Output successful transaction metrics
        System.out.println("Result: SUCCESS");
        System.out.printf("Total Cost: $%.2f%s\n", finalTotal, (seatIds.size() >= 6 ? " (10% Discount Applied)" : ""));
        System.out.println("Remaining Seats: " + remainingSeats + "/" + totalSeats);
    }

    public static void main(String[] args) {
        calculateCinemaSeatBooking system = new calculateCinemaSeatBooking();

        // Test 1: Successful booking under 6 seats (No discount)
        system.bookSeats(List.of("A1", "A2"));

        // Test 2: Failed booking due to overlap with Test 1
        system.bookSeats(List.of("A2", "B1"));

        // Test 3: Successful large group booking (>= 6 seats, 10% discount)
        // Row B (3 seats @ $12) + Row C (3 seats @ $10) = $36 + $30 = $66 -> 10% off = $59.40
        system.bookSeats(List.of("B2", "B3", "B4", "C1", "C2", "C3"));

        // Test 4: Failed booking due to invalid seat name
        system.bookSeats(List.of("Z1"));
    }
}

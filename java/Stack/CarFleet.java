package java.Stack;

import java.util.Arrays;
import java.util.Stack;

public class CarFleet {

    // Helper class to store car data
    private static class Car {
        int position;
        int speed;
        
        Car(int position, int speed) {
            this.position = position;
            this.speed = speed;
        }
    }

    public int carFleet(int target, int[] position, int[] speed) {

        int n = position.length;
        
        // Step 1: Create array of car data and sort by position (descending)
        Car[] cars = new Car[n];
        for (int i = 0; i < n; i++) {
            cars[i] = new Car(position[i], speed[i]);
        }
        
        // Sort by position in descending order (closest to target first)
        Arrays.sort(cars, (a, b) -> Integer.compare(b.position, a.position));
        
        // Step 2: Use monotonic stack to track fleets
        Stack<Double> stack = new Stack<>();
        
        for (Car car : cars) {
            // Calculate time needed to reach target
            double time = (double)(target - car.position) / car.speed;
            
            // If stack is empty or current car takes longer than the fleet ahead,
            // it forms a new fleet
            if (stack.isEmpty() || time > stack.peek()) {
                stack.push(time);
            }
            // Else, current car joins the fleet ahead (faster car gets slowed down)
        }
        
        return stack.size();
        
    }
}


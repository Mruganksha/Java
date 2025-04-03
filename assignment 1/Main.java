import java.util.*;

class Intersection {
    String id;
    int trafficFlow;
    // updateTime records the order of the last update; higher means more recent.
    long updateTime;

    public Intersection(String id) {
        this.id = id;
        this.trafficFlow = 0;
        this.updateTime = 0;
    }
}

class TrafficManagementSystem {
    // Using a HashMap to store intersections by id.
    private Map<String, Intersection> intersections;
    // A counter to simulate the order (timestamp) of updates.
    private long updateCounter;

    public TrafficManagementSystem() {
        intersections = new HashMap<>();
        updateCounter = 0;
    }

    // Adds a new intersection if it does not already exist.
    public void addIntersection(String intersectionId) {
        if (!intersections.containsKey(intersectionId)) {
            intersections.put(intersectionId, new Intersection(intersectionId));
        }
    }

    // Updates the traffic flow for an intersection.
    public void updateTrafficData(String intersectionId, int trafficFlow) {
        // If the intersection does not exist, add it first.
        if (!intersections.containsKey(intersectionId)) {
            addIntersection(intersectionId);
        }
        Intersection intersection = intersections.get(intersectionId);
        intersection.trafficFlow = trafficFlow;
        // Increment the counter to mark the recency of this update.
        updateCounter++;
        intersection.updateTime = updateCounter;
    }

    // Optimizes (sorts) the intersections based on traffic flow and recency.
    public List<Intersection> optimizeTrafficLights() {
        List<Intersection> list = new ArrayList<>(intersections.values());
        // Sort intersections:
        // - Descending order of trafficFlow.
        // - If equal, descending order of updateTime (i.e., most recently updated first).
        Collections.sort(list, new Comparator<Intersection>() {
            public int compare(Intersection i1, Intersection i2) {
                if (i2.trafficFlow != i1.trafficFlow) {
                    return i2.trafficFlow - i1.trafficFlow;
                } else {
                    return Long.compare(i2.updateTime, i1.updateTime);
                }
            }
        });
        return list;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Number of intersections
        int n = sc.nextInt();
        TrafficManagementSystem tms = new TrafficManagementSystem();
        for (int i = 0; i < n; i++) {
            String id = sc.next();
            tms.addIntersection(id);
        }

        // Number of traffic updates
        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            String intersectionId = sc.next();
            int trafficFlow = sc.nextInt();
            tms.updateTrafficData(intersectionId, trafficFlow);
        }

        // Optimize and get the sorted intersections
        List<Intersection> optimized = tms.optimizeTrafficLights();
        // Print both the id and the corresponding traffic flow
        for (Intersection inter : optimized) {
            System.out.println(inter.id + " " + inter.trafficFlow);
        }
        sc.close();
    }
}

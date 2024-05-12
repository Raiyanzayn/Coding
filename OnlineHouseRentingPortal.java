//package demo;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//class House{
//    String houseId;
//    String locality;
//    String city;
//    int squareFeet;
//    String type;
//    int ownerId;
//    int rent;
//
//    public House(String houseId, String locality, String city, int squareFeet, String type, int ownerId, int rent) {
//        this.houseId = houseId;
//        this.locality = locality;
//        this.city = city;
//        this.squareFeet = squareFeet;
//        this.type = type;
//        this.ownerId = ownerId;
//        this.rent = rent;
//    }
//}
//
//class User {
//    int userId;
//    String name;
//    String email;
//    String mobile;
//    String password;
//
//    public User(int userId, String name, String email, String mobile,String password) {
//        this.userId = userId;
//        this.name = name;
//        this.email = email;
//        this.mobile = mobile;
//        this.password=password;
//    }
//}
//
//class RentalRequest {
//    int requestId;
//    int tenantId;
//    String houseId;
//    boolean approved;
//
//    public RentalRequest(int requestId, int tenantId, String houseId) {
//        this.requestId = requestId;
//        this.tenantId = tenantId;
//        this.houseId = houseId;
//        this.approved = false;
//    }
//}
//
//class Advertisement {
//    String content;
//    int duration;
//
//    public Advertisement(String content, int duration) {
//        this.content = content;
//        this.duration = duration;
//    }
//}
//
//class OnlineHouseRentingPortal {
//    List<User> users;
//    List<House> houses;
//    List<RentalRequest> rentalRequests;
//    Advertisement advertisement;
//    User loggedInUser;
//
//    public OnlineHouseRentingPortal() {
//        this.users = new ArrayList<>();
//        this.houses = new ArrayList<>();
//        this.rentalRequests = new ArrayList<>();
//        this.advertisement = null;
//        this.loggedInUser = null;
//    }
//
//    public boolean validateUser(int userId) {
//        for (User user : users) {
//            if (user.userId == userId) {
//                return true;
//            }
//        }
//        return false;
//    }
//
//    public void addUser(User user) {
//        users.add(user);
//    }
//
//    public void addHouse(House house) {
//        houses.add(house);
//    }
//
//    public void postHouseForRent(int ownerId, House house) {
//        if (validateUser(ownerId)) {
//            addHouse(house);
//        } else {
//            System.out.println("Invalid owner ID. Please provide a valid user ID.");
//        }
//    }
//
//    public void removeHouseForRent(int ownerId, String houseId) {
//        if (validateUser(ownerId)) {
//            houses.removeIf(house -> house.houseId.equals(houseId));
//        } else {
//            System.out.println("Invalid owner ID. Please provide a valid user ID.");
//        }
//    }
//
//    public void createRentalRequest(int tenantId, String houseId) {
//        if (validateUser(tenantId)) {
//            int requestId = rentalRequests.size() + 1;
//            RentalRequest rentalRequest = new RentalRequest(requestId, tenantId, houseId);
//            rentalRequests.add(rentalRequest);
//        } else {
//            System.out.println("Invalid tenant ID. Please provide a valid user ID.");
//        }
//    }
//
//    public void viewHousesForRent() {
//        System.out.println("Houses available for rent:");
//        for (House house : houses) {
//            System.out.println("House ID: " + house.houseId);
//            System.out.println("Locality: " + house.locality);
//            System.out.println("City: " + house.city);
//            System.out.println("Square Feet: " + house.squareFeet);
//            System.out.println("Type: " + house.type);
//            System.out.println("Owner ID: " + house.ownerId);
//            System.out.println("Rent: " + house.rent);
//            System.out.println("-------------------------");
//        }
//    }
//
//    public void viewRentalRequests(int ownerId) {
//        if (validateUser(ownerId)) {
//            boolean requestsFound = false;
//            for (RentalRequest request : rentalRequests) {
//                if (request.houseId.equals(ownerId)) {
//                    requestsFound = true;
//                    System.out.println("Request ID: " + request.requestId);
//                    System.out.println("Tenant ID: " + request.tenantId);
//                    System.out.println("House ID: " + request.houseId);
//                    System.out.println("-------------------------");
//                }
//            }
//            if (!requestsFound) {
//                System.out.println("No rental requests found for owner ID " + ownerId + ".");
//            }
//        } else {
//            System.out.println("Invalid owner ID. Please provide a valid user ID.");
//        }
//    }
//
//    public void displayAdvertisement() {
//        if (advertisement != null) {
//            System.out.println("Advertisement: " + advertisement.content + " (Duration: " + advertisement.duration + " seconds)");
//        } else {
//            System.out.println("No advertisement available.");
//        }
//    }
//
//    public void setAdvertisement(String content, int duration) {
//        advertisement = new Advertisement(content, duration);
//    }
//
//    public static void main(String[] args) {
//        OnlineHouseRentingPortal portal = new OnlineHouseRentingPortal();
//        Scanner scanner = new Scanner(System.in);
//
//        User user1 = new User(1, "Peter Parker", "peterparker@example.com", "1234567890",null);
//        User user2 = new User(2, "Tony Stark", "tonystark@example.com", "9876543210",null);
//
//        portal.addUser(user1);
//        portal.addUser(user2);
//
//        House house1 = new House("28HK", "Kodambakkam", "Chennai", 798, "1BHK", 1, 6000);
//        House house2 = new House("38-K", "Gorpalayam", "Madurai", 560, "2BHK", 2, 5500);
//
//        portal.postHouseForRent(1, house1);
//        portal.postHouseForRent(2, house2);
//
//        portal.viewHousesForRent();
//        System.out.println();
//
//        System.out.print("Enter tenant ID: ");
//        int tenantId = scanner.nextInt();
//        scanner.nextLine(); // Consume newline character
//
//        System.out.print("Enter house ID for rental request: ");
//        String houseId = scanner.nextLine();
//
//        portal.createRentalRequest(tenantId, houseId);
//
//        System.out.print("Enter owner ID to view rental requests: ");
//        int ownerId = scanner.nextInt();
//        scanner.nextLine(); // Consume newline character
//
//        portal.viewRentalRequests(ownerId);
//        System.out.println();
//
//        System.out.println("Advertisement Details:");
//        System.out.print("Enter advertisement content: ");
//        String content = scanner.nextLine();
//
//        System.out.print("Enter advertisement duration (in seconds): ");
//        int duration = scanner.nextInt();
//        scanner.nextLine(); // Consume newline character
//
//        portal.setAdvertisement(content, duration);
//
//        System.out.println();
//        portal.displayAdvertisement();
//    }
//}
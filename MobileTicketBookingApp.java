//package demo;
//
//import java.util.*;
//
//class User {
//    private int userId;
//    private String name;
//    private String email;
//    private String password;
//    private List<Booking> bookingHistory;
//    
//    public String getEmail() {
//    	return email ;
//    }
//    public String getPassword() {
//    	return password ;
//    }
//    
//  
//    public User(int userId, String name, String email, String password) {
//        this.userId = userId;
//        this.name = name;
//        this.email = email;
//        this.password = password;
//        this.bookingHistory = new ArrayList<>();
//    }
//  
//}
//
//class Movie {
//    private int movieId;
//    private String title;
//    private String genre;
//    private String director;
//    private double rating;
//    private List<Review> reviews;
//  
//    public Movie(int movieId, String title, String genre, String director) {
//        this.movieId = movieId;
//        this.title = title;
//        this.genre = genre;
//        this.director = director;
//        this.rating = 0.0;
//        this.reviews = new ArrayList<>();
//    }
//  
//}
//
//class Review {
//    private int reviewId;
//    private int userId;
//    private String comment;
//    private double rating;
//  
//    public Review(int reviewId, int userId, String comment, double rating) {
//        this.reviewId = reviewId;
//        this.userId = userId;
//        this.comment = comment;
//        this.rating = rating;
//    }
//
//}
//
//class Theater {
//    private int theaterId;
//    private String name;
//    private String location;
//    private List<Showtime> showtimes;
//  
//    public Theater(int theaterId, String name, String location) {
//        this.theaterId = theaterId;
//        this.name = name;
//        this.location = location;
//        this.showtimes = new ArrayList<>();
//    }
//  
//}
//
//class Showtime {
//    private int showtimeId;
//    private int movieId;
//    private Date startTime;
//    private Date endTime;
//    private List<Seat> availableSeats;
//  
//    public Showtime(int showtimeId, int movieId, Date startTime, Date endTime) {
//        this.showtimeId = showtimeId;
//        this.movieId = movieId;
//        this.startTime = startTime;
//        this.endTime = endTime;
//        this.availableSeats = new ArrayList<>();
//    }
//  
//
//}
//
//class Seat {
//    private int seatId;
//    private int theaterId;
//    private int showtimeId;
//    private String seatNumber;
//    private boolean isAvailable;
//  
//    public Seat(int seatId, int theaterId, int showtimeId, String seatNumber) {
//        this.seatId = seatId;
//        this.theaterId = theaterId;
//        this.showtimeId = showtimeId;
//        this.seatNumber = seatNumber;
//        this.isAvailable = true;
//    }
//  
// 
//}
//
//class Booking {
//    private int bookingId;
//    private int userId;
//    private int showtimeId;
//    private List<Seat> bookedSeats;
//    private Date bookingDate;
//    private PaymentOption paymentOption;
//  
//    public Booking(int bookingId, int userId, int showtimeId, List<Seat> bookedSeats, Date bookingDate, PaymentOption paymentOption) {
//        this.bookingId = bookingId;
//        this.userId = userId;
//        this.showtimeId = showtimeId;
//        this.bookedSeats = bookedSeats;
//        this.bookingDate = bookingDate;
//        this.paymentOption = paymentOption;
//    }
//
//}
//
//enum PaymentOption {
//    CARD,
//    UPI,
//    CASH_ON_DELIVERY
//}
//
//public class MobileTicketBookingApp {
//    private List<User> users;
//    private List<Movie> movies;
//    private List<Theater> theaters;
//    private List<Booking> bookings;
//  
//    public MobileTicketBookingApp() {
//        this.users = new ArrayList<>();
//        this.movies = new ArrayList<>();
//        this.theaters = new ArrayList<>();
//        this.bookings = new ArrayList<>();
//    }
//
//   
//    
//   public void run() {
//    Scanner scanner = new Scanner(System.in);
//    boolean isRunning = true;
//
//    while (isRunning) {
//        System.out.println("Welcome to the Mobile Ticket Booking App");
//        System.out.println("1. Register");
//        System.out.println("2. Login");
//        System.out.println("3. Exit");
//        System.out.print("Enter your choice: ");
//        int choice = scanner.nextInt();
//
//        switch (choice) {
//            case 1:
//                System.out.println("Registration");
//                int id = scanner.nextInt();
//                System.out.print("Enter your name: ");
//                String name = scanner.next();
//                System.out.print("Enter your email: ");
//                String email = scanner.next();
//                System.out.print("Enter your password: ");
//                String password = scanner.next();
//                User newUser = new User(id,name, email, password);
//                users.add(newUser);
//                System.out.println("Registration successful!");
//                break;
//            case 2:
//              
//                System.out.println("Login");
//                System.out.print("Enter your email: ");
//                String loginEmail = scanner.next();
//                System.out.print("Enter your password: ");
//                String loginPassword = scanner.next();
//
//                
//                boolean isLoggedIn = false;
//                User loggedInUser = null;
//                for (User user : users) {
//                    if (user.getEmail().equals(loginEmail) && user.getPassword().equals(loginPassword)) {
//                        isLoggedIn = true;
//                        loggedInUser = user;
//                        break;
//                    }
//                }
//
//                if (isLoggedIn) {
//                    System.out.println("Login successful!");
//                  
//                } else {
//                    System.out.println("Invalid email or password. Please try again.");
//                }
//                break;
//            case 3:
//                
//                isRunning = false;
//                break;
//            default:
//                System.out.println("Invalid choice. Please try again.");
//                break;
//        }
//    }
//
//    System.out.println("Thank you for using the Mobile Ticket Booking App!");
//}
//
//  
//    public static void main(String[] args) {
//        MobileTicketBookingApp app = new MobileTicketBookingApp();
//        app.run();
//    }
//}
//	
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//

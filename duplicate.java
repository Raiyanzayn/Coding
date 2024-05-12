package demo;
import java.util.* ;
public class duplicate {

	
	
	
	
	
	
	
public static void duplicate( int arr[]) {
	
HashSet<Integer> hs= new HashSet<>();	
ArrayList<Integer> arrl = new ArrayList<>();
	for (int i=0 ; i< arr.length ; i++) {
	hs.add(arr[i]);
	}
	for ( int output: hs) {
		
		System.out.println(output);

	}
	
}
	public static void main(String args[]) {
	int arr[] = {1,1,2,3,4,4,4} ;	
	duplicate( arr);
	}
}





















//class User {
//private int userid;   
// private String name;
// private String email;
// private String password;
//// i am using get funtion then only , i can access this private access specifier
// 
// public String getEmail() {
// 	return email ;
// }
// public String getPassword() {
// 	return password ;
// }
//public  User(int id , String name, String email, String password ) {
//this.userid=userid;
//	this.name=name;
//	this.email=email;
//	this.password=password ;
//}
//}
//public class practice {
//List<User> users;
//public practice() {
//	this.users=new ArrayList<>();
//}
//
//public void run() {
//	    Scanner scanner = new Scanner(System.in);
//	    boolean isRunning = true;
//
//	    while (isRunning) {
//	        System.out.println("Welcome to the Mobile Ticket Booking App");
//	        System.out.println("1. Register");
//	        System.out.println("2. Login");
//	        System.out.println("3. Exit");
//	        System.out.print("Enter your choice: ");
//	        int choice = scanner.nextInt();
//
//	        switch (choice) {
//	            case 1:
//	                System.out.println("Registration");
//	                System.out.print("Enter your ID: ");
//	                int id = scanner.nextInt();
//	                System.out.print("Enter your name: ");
//	                String name = scanner.next();
//	                System.out.print("Enter your email: ");
//	                String email = scanner.next();
//	                System.out.print("Enter your password: ");
//	                String password = scanner.next();
//	                User newUser = new User(users.size()+1,name, email, password);
//	                users.add(newUser);
//	                System.out.println("Registration successful!");
//	                break;
//	            case 2:
//	              
//	                System.out.println("Login");
//	                System.out.print("Enter your email: ");
//	                String loginEmail = scanner.next();
//	                System.out.print("Enter your password: ");
//	                String loginPassword = scanner.next();
//
//	                
//	                boolean isLoggedIn = false;
//	                User loggedInUser = null;
//	                for (User user : users) {
//	                    if (user.getEmail().equals(loginEmail) && user.getPassword().equals(loginPassword)) {
//	                        isLoggedIn = true;
//	                        loggedInUser = user;
//	                        break;
//	                    }
//	                }
//
//	                if (isLoggedIn) {
//	                    System.out.println("Login successful!");
//	                  
//	                } else {
//	                    System.out.println("Invalid email or password. Please try again.");
//	                }
//	                break;
//	            case 3:
//	                
//	                isRunning = false;
//	                break;
//	            default:
//	                System.out.println("Invalid choice. Please try again.");
//	                break;
//	        }
//	    }
//
//	    System.out.println("Thank you for using the Mobile Ticket Booking App!");
//	}
//
//public static void main(String[] args) {
//	practice app= new practice();
//	app.run();
// 
//}
//}
//
//











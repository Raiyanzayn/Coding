//package demo;
//import java.util.* ;
//
//class User {
//    int userID;
//    String name;
//    String email;
//    String password;
//    String role;
//
//    public User(int userID, String name, String email, String password, String role) {
//        this.userID = userID;
//        this.name = name;
//        this.email = email;
//        this.password = password;
//        this.role = role;
//    }
//}
//
//class GroceryItem {
//    int groceryId;
//    String groceryName;
//    String quantity;
//    String price;
//
//    public GroceryItem(int groceryId, String groceryName, String quantity, String price) {
//        this.groceryId = groceryId;
//        this.groceryName = groceryName;
//        this.quantity = quantity;
//        this.price = price;
//    }
//}
//class CartItem {
//    int cartId;
//    int userId;
//    int groceryId;
//    int quantity;
//    String bookedAt;
//
//    public CartItem(int cartId, int userId, int groceryId, int quantity, String bookedAt) {
//        this.cartId = cartId;
//        this.userId = userId;
//        this.groceryId = groceryId;
//        this.quantity = quantity;
//        this.bookedAt = bookedAt;
//    }
//}
//
//class Payment {
//    int paymentId;
//    String paymentMethod;
//    String cardNumber;
//    String month;
//    String year;
//    String cvv;
//    int amount;
//    String paymentStatus;
//
//    public Payment(int paymentId, String paymentMethod, String cardNumber, String month, String year, String cvv, int amount, String paymentStatus) {
//        this.paymentId = paymentId;
//        this.paymentMethod = paymentMethod;
//        this.cardNumber = cardNumber;
//        this.month = month;
//        this.year = year;
//        this.cvv = cvv;
//        this.amount = amount;
//        this.paymentStatus = paymentStatus;
//    }
//}
//public class grocery {
//
//	ArrayList<User> users ;
//	ArrayList<GroceryItem> groceryitem ;
//	ArrayList<CartItem> cartitem ;
//	ArrayList<Payment> payment ;
//	
//	public  grocery() {
//		users= new ArrayList<>() ;
//		groceryitem = new ArrayList<>() ;
//		cartitem = new ArrayList<>()  ;
//		payment =new ArrayList<>() ;
//	}
//	
//	public User validatelogin(String email , String password , List<User> users) {
//		
//		for(User   user :users)
//		if ( user.email.equals(email) && user.password.equals(password) ) {
//			return user ;
//		}
//		return null ;
//	}
//	
//	public void adduser(User user) {
//		users.add(user);
//	}
//	
//	public void addgrocery(GroceryItem groceryitems) {
//		groceryitem.add(groceryitems);
//	}
//	public void addcartitem(CartItem cartitems) {
//		cartitem.add(cartitems);
//	}
//	public void addpayment(Payment payments) {
//	    payment.add(payments);	
//	}
//	
//	public User groceryforcustomer(User user ,List<GroceryItem> grocerylistitem,List<CartItem> cartitem ,List<Payment> payment  ) {
//		
//      
//		boolean stayinmenu = true ;
//		Scanner scanner= new Scanner(System.in);
//		
//		while(stayinmenu) {
//			
//			int choice = scanner.nextInt();
//			
//			
//		switch(choice) {
//		
//		case 1 : 
//			System.out.println(" the grocery List");
//		for(GroceryItem grocery :grocerylistitem) {
//			System.out.println( "groceryId" +grocery.groceryId);
//			System.out.println( "groceryName" +grocery.groceryName);
//			System.out.println( "quantity"  + grocery.quantity);
//			System.out.println( "price" +grocery.price);
//			
//			break ;
//			
//		}
//		case 2 : 
//			System.out.println(" Enter the groceryId");
//			int groceryid = scanner.nextInt();
//			System.out.println(" quantity");
//			int quantity = scanner.nextInt() ;
//			System.out.println(" booked at");
//		    String booked = scanner.nextLine();	
//			
//			CartItem cartitems = new CartItem(cartitem.size()+1  ,user.userID, groceryid ,quantity , booked );
//			cartitem.add(cartitems);
//			
//		break ;
//		case 3 :
//			
//		for(CartItem cart :cartitem) {
//			if( cart.cartId == cart.groceryId) {
//			System.out.println(" cartid" + cart.cartId);
//			System.out.println("GroceryId" + cart.groceryId);
//			System.out.println(" quantity " + cart.quantity);
//			System.out.println(" booked " + cart.bookedAt);
//			
//		}
//		}
//		case 4 : 	
//			System.out.println(" the payment mode" );  
//			    String paymentMethod = scanner.nextLine();
//			    System.out.println(" the cardnumber" );
//			    String cardNumber = scanner.nextLine();
//			    System.out.println(" the month");
//			    String month =scanner.nextLine();
//			    System.out.println(" the year");
//			    String year=scanner.nextLine();
//			    System.out.println(" the cv" );
//			    String cvv =scanner.nextLine();
//			    System.out.println(" the amount" );
//			    int amount = scanner.nextInt();
//			    System.out.println("  the payment" );
//			    String payment1 = scanner.nextLine();
//			    System.out.println("  the payment" );
//		  Payment payments = new Payment(payment.size(), paymentMethod,cardNumber,  month,  year , cvv , amount,payment1  );
//			
//		  addpayment(payments);
//		  System.out.println("  the payment made successfull" );
//			break ;
//			
//			
//		case 5 : 
//			
//			stayinmenu = false  ;
//			
//			default : 
//				System.out.println( " invalid choice");
//				break ;
//		}
//	}
//	
//		
//		return user;
//	}
//
//	
//	public static void main(String args[]) {
//		
//	     GroceryApp portal = new GroceryApp();
//
//	        // Adding sample data
//	        User user1 = new User(1, "John", "john@example.com", "password123", "customer");
//	        User user2 = new User(2, "Admin", "admin@example.com", "admin123", "admin");
//	        portal.addUser(user1);
//	        portal.addUser(user2);
//
//	        GroceryItem item1 = new GroceryItem(1, "Apple", "5", "2.99");
//	        GroceryItem item2 = new GroceryItem(2, "Banana", "10", "1.99");
//	        portal.addGroceryItem(item1);
//	        portal.addGroceryItem(item2);
//
//	        // Simulating login for a customer
//	        User loggedInUser = portal.validateLogin("john@example.com", "password123", portal.users);
//	        if (loggedInUser != null && loggedInUser.role.equals("customer")) {
//	            portal.groceryForCustomer(loggedInUser, portal.groceryItems, portal.cartItems, portal.payments);
//	        }
//		
//	}
//}





















	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

//class LL{
//	Node head ;
//	Node tail;
//	int size ;
//	public void size() {
//		this.size=size ;
//	}
//	public void insertfirst(int value) {
//		Node node = new Node(value);
//		node.next= head ;
//		head =  node; 
//		  size ++ ;
//	}
//	
//	
//	public void display() {
//		Node temp =head ;
//		while( temp != null) {
//			System.out.println(temp.value);
//			 temp=	temp.next ;
//			
//		}
//		
//	}
//	public void insert(int value , int index) {
//		Node temp =head ;
//		for( int i=1 ; i<index ; i++) {
//			  temp = temp.next ;
//		}
//		Node node = new Node(value , temp.next);
//		   temp.next =node ;
//		
//	}
//	public int deletefirst(Node head) {
//		int value = head.value ;
//		head.next = head ;
//		size -- ;
//		return value ;
//	}
//
//	
//}
//	class Node {
//		int value ;
//		Node next ;
//		
//		public  Node(int value) {
//			this.value=value ;
//			
//		}
//		public  Node(int value , Node next) {
//			this.value=value ;
//			this.next=next;
//		}
//	}
//	
//	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	public static void freq(String str) {
//		
//		char arr[]=str.toCharArray();
//		int n =arr.length;
//		boolean visited[]=new boolean[n];
//		for(int i=0 ; i<n ; i++) {
//			if(visited[i] == true) {
//				continue ;
//			}
//			int cnt =1;
//			for( int j=i+1 ; j<n ; j++) {
//				if( arr[i] == arr[j]) {
//					visited[j] = true ;
//					cnt ++ ;
//				}
//			}
//			System.out.println(arr[i]+ " " +  cnt);
//		}
//
//	}
//	public static void main(String args[]) {
//	  String str= "hello";
//	  freq(str);
//	   }
//	}
//public static void frequency(String data) {
//	char[] arr= data.toCharArray();
//	
//	
//	int n = arr.length ;
//	boolean visited[]= new boolean[n];	
//		for( int i=0 ; i< n ; i++) {
//			
//			if ( visited[i] == true) {
//				continue ;
//			}
//			int count =1 ;
//			for(int j = i+1 ; j< n ; j++) {
//				if ( arr[i]==arr[j]) {				
//					visited[j] =true ;
//					count ++ ;
//				}
//				
//			}
//			System.out.println(arr[i] +" "+ count);
//}
//}
//
//public static void main(String args[]){  
//  String data = "hello";
//    frequency(data);
//}
//}






//
//class User {
//	 private int userid;   
//	  private String name;
//	   String email;
//	   String password;
//	// i am using get funtion then only , i can access this private access specifier
//	  
//	  public String getEmail() {
//	  	return email ;
//	  }
//	  public String getPassword() {
//	  	return password ;
//	  }
//	public  User(int id , String name, String email, String password ) {
//	     this.userid=userid;
//		this.name=name;
//		this.email=email;
//		this.password=password ;
//	}
//}
//class Flight {
//	int id;
//	String destination;
//	int nooftickets;
//	String price;
//	
//	public Flight(int id,String destination,int nooftickets,String price ) {
//		this.id= id;
//		this.destination= destination;
//		this.nooftickets= nooftickets;
//		this.price= price;
//	}
//	
//}
//
//class History{
//	int bookingid;
//	int flightid;
//	int userid;
//	String Class;
//	int totalprice ;
//	
//	public History(int bookingid,int flightid,int userid,String Class,int totalprice ) {
//		this.bookingid=   bookingid;
//		this.flightid= flightid;
//	     this.userid=userid;
//		 this.Class=Class;
//		 this.totalprice=  totalprice ;
//		
//	}
//}
//public class practice {
//	List<User> users;
//	List<Flight> flight;
//	Stack<History> history;
//	public practice() {
//		this.users=new ArrayList<>();
//		this.flight=new ArrayList<>();
//		this.history=new Stack<>();
//	}
//	  public User validateLogin(String email, String password, List<User> users) {
//	        for (User user : users) {
//	            if (user.email.equals(email) && user.password.equals(password)) {
//	                return user;
//	            }
//	        }
//	        return null;
//	    }
//
//	public void adduser(User user) {
//		   users.add(user);
//	}
//	public void addflight(Flight flight1) {
//		flight.add(flight1);
//	}
//	public void addhistory(History history1) {
//		history.push(history1);
//	}
////	public void removehistory(History history1) {
////		history.remove(0);
////	}
//	 public boolean cancelBooking(int bookingId) {
//         for ( History hist:history) {
//             if (hist.bookingid == bookingId) {
//                 // Remove the booking from the bookings list
//                 history.remove(hist);
//                 // Optionally, update the booking history to reflect the cancellation
//                 return true; // Return true to indicate successful cancellation
//                 
//             }
//         }
//         // If no booking with the specified bookingId is found, return false
//         return false;
//     }
//	 
//	 public  User validateLogin(String email, String password) {
//	        for (User user : users) {
//	            if (user.email.equals(email) && user.password.equals(password)) {
//	                return user;
//	            }
//	        }
//	        return null;
//	    }
//	 public void run() {
//		    Scanner scanner = new Scanner(System.in);
//		    boolean isRunning = true;
//             int tickets=50 ;  
//		    while (isRunning) {
//		        System.out.println("Welcome to the Mobile Ticket Booking App");
//		        System.out.println("1.Avaialable Flight Details");
//		        System.out.println("2.For Booking ");
//		        System.out.println("3. Payment");
//		        System.out.println("4. History");
//		        System.out.println("5. Cancellation");
//		        System.out.println("6. Exit");
//		        System.out.print("Enter your choice: ");
//		        int choice = scanner.nextInt();
//		        switch (choice) {
//		        case 1 : 
//		        	  System.out.println("-------------------------");
//		        	 System.out.println("Available Flight Details");	
//		        for(Flight flight1:flight) {
//		        	 System.out.println("1.Flight id:" + flight1.id);
//		        	 System.out.println("2.Destination:" + flight1.destination);
//		        	 System.out.println("3.No of tickets:" + flight1.nooftickets);
//		        	 System.out.println("4.Price:" + flight1.price);
//		        	  System.out.println("-------------------------");
//		        }
//		        break;
//		        case 2:
//		        	 System.out.println("2. Booking ");
//		        	 System.out.println("Enter the flightid:  ");
//		        int flightid=scanner.nextInt();
//		        System.out.println("Userid: ");
//		        int userid=scanner.nextInt();
//		        System.out.println("Nooftickets: ");
//		        int nooftickets=scanner.nextInt();
//		        System.out.println("Enter the class: ");
//		        String prefer=scanner.next();
//		        
//		        if( flightid == 1) {
//		        	int sum1=nooftickets *20000;
//		        	System.out.println("Amount to be paid: " + sum1);
//		        	 History book1=new History(history.size()+1,flightid,userid,prefer,sum1);
//			            addhistory(book1);
//		        } else {
//		        
//		        int sum=nooftickets *10000;
//		        System.out.println("Amount to be paid: " + sum);
//		        Booking newbook=new Booking(booking.size()+1,userid,nooftickets,flightid,prefer,sum);
//		        addbooking(newbook);
		        
		        
		       // Flight flight =new Flight(userid,nooftickets,prefer);
		        
		       
//		            History book2=new History(history.size()+1,flightid,userid,prefer,sum);
//		            addhistory(book2);
//		        }
//		        
//		        
//		        break ;
//		        case 3:
//		            System.out.println("Payment Method");
//		            String paymentmethod = scanner.next();
//		            System.out.println("Enter the flightID");
//		            int flightid1 = scanner.nextInt(); 
//		            System.out.println("Enter the userID");
//		            int userID = scanner.nextInt(); 
//		            System.out.println("Enter the amount");
//		            int amount = scanner.nextInt();
//		            
//		            // Iterate through the bookings and check if the amount matches for the same flight ID
//		            boolean paymentSuccessful = false;
//		            for(History history1:history) {
//		                if (  history1.totalprice == amount) {
//		                    paymentSuccessful = true;
//		                    break;
//		                }
//		            }
//		            
//		            if (paymentSuccessful) {
//		                System.out.println("Payment Successfully");
//		            } else {
//		                System.out.println("Payment Failed");
//		            }
//		            break;
//		        case 4 :
//		        	     System.out.println("-------------------------");
//		        	 System.out.println("History");
//		            
//		            for(History history1:history) {
//		            	System.out.println("Bookingid:" + history1.bookingid);
//		            	 System.out.println("Userid:" + history1.userid);	
//		            	 System.out.println("Flightid:" + history1.flightid);
//		            	 System.out.println("Class:" + history1.Class );		            	 
//		            	 System.out.println("Totalprice:" + history1.totalprice);
//		            	// System.out.println("Total price :" + history1);
//		            	  System.out.println("-------------------------");
//	            }
//		            break;
//		        
//		        case 5 :
//		        	 System.out.println(" Cancellation");
//		        	 
//		        	 System.out.println(" Enter the bookingid");
//		            int canceluserid=scanner.nextInt();
//		            if(cancelBooking(canceluserid) == true) {  
//		            	 System.out.println("Cancel sucessfully , Amount will be refund in 24 hours ");	
//		            } else {
//		            	 System.out.println("Invalid details ,Try again");
//		            }
//		        
//		            break;
//		            
//		         
//		            case 6:
//		                
//		                isRunning = false;
//		                break;
//		            default:
//		                System.out.println("Invalid choice. Please try again.");
//		                break;
//		        }
//		    }
//
//		    System.out.println("Thank you for using the Mobile Ticket Booking App!");
//		}
// 
//    public static void main(String[] args) {
//    	practice app= new practice();
//    	 User user1 = new User(1, "John", "john@example.com", "password123");
//         User user2 = new User(2, "Admin", "admin@example.com", "admin123");
//         app.adduser(user1);        
//          app.adduser(user2);
//         User loggedInUser = app.validateLogin("john@example.com", "password123", app.users);
//         
//
//          
//    	
//         Flight flight1=new Flight(1,"delhi",25,"20000 perticket");
//         Flight flight2=new Flight(2,"chennai",25,"10000 perticket");
//         app.addflight(flight1);
//          app.addflight(flight2);       
//    	app.run();
//      
//    }
//}

//class User {
//	private int id ;
//	private String name ;
//     private String email ;
//	private String password ;
//	private String address ;
//	
//	
//	public String getEmail() {
//		return email ;
//	}
//	public String getPassword() {
//		return password;
//	}
//	
//	public User(int id ,String name,String email,String password ,String address ) {
//		this.id= id ;
//		this.name= name ;
//		this.email= email ;
//		this.password= password ;
//		this.address= address ;
//	}
//}
//class Cartitem {
//	int id ;
//	String service;
//	String location ;
//	
//	public  Cartitem(int id ,String service ,String location) {
//		this.id= id ;
//		this.service= service;
//		this.location= location ;
//	}
//}
//
//
//
//
//class Service {
//	int id ;
//	String name ;
//	String description ;
//	String cost ;
//	
//	public Service(int id, String name,String description ,String cost) {
//		this.id= id ;
//		this.name= name ;
//		this.description= description ;
//		this.cost= cost ;
//		
//	}
//}
//public class practice {
//   List<User> users ;
//   List<Service> service;
//   List<Cartitem> cartitem;
//	public practice() {
//		this.users=new ArrayList<>();
//		this.service=new ArrayList<>();
//		this.cartitem=new ArrayList<>();
//	}
//	public void addservice(Service sevices) {
//		 service.add(sevices);
//	}
//	public void addcart(Cartitem carts) {
//		cartitem.add(carts);
//	}
//	
//	
//	public void run() {
//	Scanner sc= new Scanner(System.in);	
//	boolean isrunning = true ;
//		
//		while(isrunning) {
//			System.out.println("Welcome to the Mobile Ticket Booking App");
//	        System.out.println("1. Register");
//	        System.out.println("2. Login");
//	        System.out.println("3. Available service");
//	        System.out.println("4. add service");
//	        System.out.println("5.view cart");
//	        System.out.print("Enter your choice: ");
//	        int choice = sc.nextInt();
//			
//		
//			switch(choice) {
//			case 1 :
//				System.out.println(" the Registration form");
//				System.out.println(" Enter id ");
//			     int id=sc.nextInt();
//			     System.out.println(" Enter the name");
//			    String name=sc.next();
//			    System.out.println(" Enter the email");
//			    String email= sc.next();
//			    System.out.println(" Enter the password");
//			      String password =sc.next();
//			      System.out.println(" Enter the Address");
//			      String address =sc.next();   
//			    
//			    User user= new User(id, name,email,password, address);
//			    users.add(user);
//			    System.out.println(" Registration Sucessful");    
//			      break ;
//			case 2 :
//				System.out.println(" the login form");
//				 
//				    System.out.println(" Enter the email");
//				    String loginemail= sc.next();
//				    System.out.println(" Enter the password");  
//				    String loginpassword= sc.next();
//				    boolean loginterm= false;
//				    User detail= null ;
//				for(User user1:users) {
//					if(user1.getEmail().equals(loginemail) && user1.getPassword().equals(loginpassword)) {
//						loginterm = true ;
//						detail = user1;
//					  break ;							
//					}
//				}
//					if(loginterm) {
//						 System.out.println(" Login Sucessfully"); 
//					} else {
//						 System.out.println(" Invalid detailed "); 
//					}
//			case 3: 
//				 System.out.println(" available services");
//					for(Service services:service ) {
//						System.out.println(" services id" + services.id);
//						System.out.println("  service name" + services.name);
//						System.out.println("  the service" + services.description);
//						System.out.println("  the cost " + services.cost);
//						break ;
//						
//					}
//					break ;
//			case 4 :		
//				 System.out.println(" Add the available services"); 
//				 System.out.println(" enter the serviceid"); 
//					int Id=sc.nextInt();
//					 System.out.println(" enter the service "); 
//					String service=sc.next();
//					 System.out.println(" Enter the location"); 
//					String location=sc.next();
//					
//					Cartitem cart=new Cartitem(Id,service,location);
//					addcart(cart);
//					break;
//			case 5 :
//				 System.out.println(" cart items"); 
//					for(Cartitem carts:cartitem) {
//						 System.out.println("enter the cartid" + carts.id);
//						 System.out.println(" enter the service" +carts.service);
//						 System.out.println(" enter the location" + carts.location);
//						 
//						 break ;
//					}
//					
//					
//					
//					
//					
//			case 6:	
//				
//				isrunning = false ;
//				break ;
//				default:
//				 System.out.println("Invalid choice. Please try again. "); 
//				break ;
//			}
//		}
//		
//		
//	}
//	public static void main(String args[]) {
//		practice app= new practice();
//		Service electrical=new Service(1,"raju","this is jj","1222");
//		app.addservice(electrical);
//		
//		
//		
//		app.run();
//		
//		
//	}
//}

package demo;
import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.*;
public class practice{

	  public  static  int fact(int n) {
	      if( n==0 || n==1) {
	    	  return n;
	      }
	      int fact1=fact(n-1);
	      int fact2=fact(n-2);
	      int fact=fact1 + fact2 ;
	      return fact;
		 
	  }
	    public static void main(String args[]){
	    	 int n =5 ;
	    	 System.out.println(fact(n));	    	
	    	 
	}
	}






























//class User{
//	int userid;
//	String email;
//	String name ;
//	String password ;
//	int phoneno;
//	
//	
//	public User(int userid,String email,String name, String password , int phoneno) {
//		this.userid =userid;
//		this.email= email;
//		this.name= name ;
//		this.password = password ;
//		this.phoneno= phoneno;
//		
//	}
//}
//class Train {
//	int trainid ;
//	String trainname;
//	String destination;	
//	int price ;
//	
//	public Train(	int trainid ,String trainname ,String destination , int price) {
//		this.trainid= trainid ;
//		this.trainname= trainname;
//		this.destination= destination;
//		this.price= price ;
//		
//	}
//}
//class Payment {
//	int paymentid ;
//	int bookingid ;
//	int cvv ;
//	int cardnumber ;
//	
//	public Payment(int paymentid,int bookingid, int cvv ,int cardnumber ) {
//		this.paymentid= paymentid ;
//		this.bookingid= bookingid ;
//		this.cvv= cvv ;
//		this.cardnumber= cardnumber ;
//		
//	}
//}
//class Booked {
//	int bookingid ;
//	int userid ;	
//	int trainid ;
//	String classes ;
//	int nooftickets;
//	int amount ;
//	
//	public Booked(int bookingid,int userid, int trainid ,String classes,int nooftickets, int amount ) {
//		this.bookingid= bookingid ;
//		this.userid= userid;
//		this.trainid= trainid ;
//		this.classes= classes;
//		this.amount= amount ;
//	}
//}
//public class practice {	
//	
//	List<User> users ;
//	List<Train> train ;
//	List<Payment> payment;
//	List<Booked> booked;
//	public practice () {
//		this.users=new ArrayList<>();
//		this.train=new ArrayList<>();
//		this.payment=new ArrayList<>();
//		this.booked=new ArrayList<>();
//	}
//	
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
//	
//	public void addtrain(Train trains) {
//		    train.add(trains);
//	}
//	public void addbooked(Booked book) {
//		booked.add(book);
//	}
//	
//	
//	public void run() {
//		
//		boolean stayinmenu = true ;
//		Scanner sc =new Scanner(System.in);
//		
//		while(stayinmenu) {
//			 System.out.println("Welcome to the Mobile Ticket Booking App");
//		        System.out.println("1.Avaialable Train Details");
//		        System.out.println("2.For Booking ");
//		        System.out.println("3. Payment");
//	           System.out.println("4. History");
//		        System.out.println("5. Cancellation");
//		        System.out.println("6. Exit");
//		        System.out.print("Enter your choice: ");
//			
//			
//			int choice =sc.nextInt();
//			
//			switch(choice) {
//			
//			case 1 :
//				 System.out.println("1.Avaialable Train Details");
//				 for(Train trains:train) {
//					 System.out.println("------------------------------");
//					 System.out.println("Train id :" + trains.trainid);
//					 System.out.println("Trainname :" + trains.trainname);
//					 System.out.println("Destination :" + trains.destination);
//					 System.out.println("Price :" + trains.price);
//					 System.out.println("------------------------------");
//				 }
//				 break ;
//			case 2 :
//		     System.out.println("Enter the trainid");   	
//			int trainid =sc.nextInt();
//			System.out.println("Enter the userid");   	
//			int userid =sc.nextInt();
//			
//			System.out.println("Enter the class");   	
//			String classes =sc.next();
//			
//			System.out.println("Enter the number of tickets");
//			int notickets=sc.nextInt();
//			
//			if(trainid == 1) {
//				int sum =notickets *120 ;
//				System.out.println("Amount to be paid :" + sum);
//				Booked book1=new Booked(booked.size()+1 , trainid,userid ,classes,notickets ,sum);
//				
//				
//				booked.add(book1);
//			} else {
//				int sum= notickets *150 ;
//				System.out.println("Amount to be paid :" + sum);
//				Booked book2=new Booked(booked.size()+1 , trainid,userid ,classes,notickets ,sum);
//				booked.add(book2);
//			}
//			 break ;
//			case 3 :
//				System.out.println("Payment Method");
//				String name=sc.next();
//				System.out.println("Booking id");
//				int bookingid=sc.nextInt();
//				System.out.println("Amount to be paid");
//				int totamount =sc.nextInt();
//				boolean paymentsuccessfull =false ;
//				for(Booked book:booked) {
//					if(book.amount == totamount) {
//						paymentsuccessfull  = true ;
//						
//					}
//				}
//					if (paymentsuccessfull ) {
//						System.out.println("Payment Succesfull");
//					} else {
//						System.out.println("Payment unSuccesfull ");
//					}
//				
//				 break ;
//			case 4 :
//				System.out.println("Booked History");
//				for(Booked book1:booked) {
//					System.out.println("------------------------------");
//					System.out.println("Bookedid :" + book1.bookingid);
//					System.out.println("Userid :" + book1.userid);
//					System.out.println("Trainid :" + book1.trainid);
//					System.out.println("Classes" + book1.classes);
//					System.out.println(" Total Amount :"  + book1.amount);
//					System.out.println("------------------------------");
//				}
//				break ;
//			case 5 :
//	                
//				stayinmenu = false;
//	                break;
//	            default:
//	                System.out.println("Invalid choice.Please try again.");
//	                break;
//	        }
//	    }
//
//	    System.out.println("Thank you for using the Mobile Ticket Booking App!");
//	}
//					
//	public static void main(String args[]) {
//	practice app=new practice();
//	User user1 = new User(1, "John", "john@example.com", "password123",999);
//    User user2 = new User(2, "Admin", "admin@example.com", "admin123",88765);
//    app.adduser(user1);
//    app.adduser(user2);
//	
//	
//	
//	Train train1=new Train(1,"chennai" ,"brindavan" ,120);
//	   app.addtrain(train1);
//	   Train train2=new Train(2,"Bangalore" ,"Yelegiri" ,150);
//	   app.addtrain(train2);
//
//	app.run();
//	
//	}
//}

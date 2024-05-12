//package demo;
//
//public class maxsubarr {
//
//
//	    public  static  int sort(int[] arr) {
//	       int  n= arr.length ;
//	       int  max =0 ;
//	    	for( int i=0 ; i<n ; i++ ) {
//	    		
//	    		for( int j =i ; j< n ; j++) {
//	    			int sum =0 ;
//	    			for( int k = i ; k<=j ; k++) {
//	    	            sum += arr[k];
//	    			}
//	    			max = Math.max(max,sum);
//	    		}
//	    	
//	    	}
//	    	return max ;
//	    }   	
//	    public static void main(String args[]){
//	   int arr[] =	{-2, 1, -3, 4, -1, 2, 1, -5, 4};
//	    	 System.out.println(sort(arr));  
//	}
//	}
//	
//import json
//import copy
//
//users = []
//GroceryListItems = []
//cart_list = []
//payment_details = [] #[{}, {}, {}]
//
//# userid,name, email, pasw, role, cart_id, user_id, paymentId, cart_id, grocery_details,quantity_need, booked_at, payment_id, payment_method, '', '', '', '', 500, 'paid'
//
//class groceryApp:
//    # booking_count = 0
//
//    def _init_(self, id: int, Name: str, Email: str, Password: str, Role: str):
//        self.userID = id
//        self.name = Name
//        self.email = Email
//        self.password = Password
//        self.role = Role
//
//    def hardCodedData(self): #polymorphism
//        users.append(self)
//        return users
//
//    def validateLogin(self, email, password):#polymorphism
//        for user in users:
//            if user.email == email and user.password == password:
//                return user
//            else:
//                return False
//        return None
//
//
//class Admin:
//    # booking_count = 0
//
//    def _init_(self, id: int, Name: str, Email: str, Password: str, Role: str):
//        self.userID = id
//        self.name = Name
//        self.email = Email
//        self.password = Password
//        self.role = Role
//
//    def hardCodedData(self): #polymorphism
//        users.append(self)
//        return users
//
//    def validateLogin(self, email, password): #polymorphism
//        for user in users:
//            if user.email == email and user.password == password:
//                return user
//            else:
//                return False
//        return None
//
//class GroceryList:
//    def _init_(self, id, groceryname, quantity, price):
//        self.groceryId = id
//        self.groceryName = groceryname
//        self.Quantity = quantity
//        self.Price = price
//
//
//class cart:
//    def _init_(self, BookingID, userId, item_id, quantity, BookedAt):
//        self.cart_id = BookingID
//        self.userId = userId
//        self.groceryDetails = item_id
//        self.quantity_need = quantity
//        self.booked_at = BookedAt
//
//class Payment:
//    def _init_(self, paymentId, payment_method, card_no, month, year, cvv, amount, payment_status = 'not_paid'):
//        self.paymentId = paymentId
//        self.card_no = card_no
//        self.cvv = cvv
//        self.payment_method = payment_method
//        self.month = month
//        self.year = year
//        self.amount = amount
//        self.payment_status = payment_status
//
//    def hardCodedData(self):
//        payment_details.append(self)
//
//class AdminReport(groceryApp, Payment):
//    def _init_(self, userid, Name, Email, Password, Role):
//        super()._init_(userid, Name, Email, Password, Role)
//
//
//
//
//
//
//class groceryShowCase(groceryApp):  #simple inheritance
//    def _init_(self, userid, Name, Email, Password, Role):
//        super()._init_(userid, Name, Email, Password, Role)
//
//
//    def grocery_for_customer(self):
//        grocery1 = GroceryList(1, 'Mango', '10', '20')
//        grocery2 = GroceryList(2, 'Cauliflower', '10', '40')
//        grocery3 = GroceryList(3, 'Cabbage', '10', '30')
//        GroceryListItems.append(grocery1)
//        GroceryListItems.append(grocery2)
//        GroceryListItems.append(grocery3)
//
//        stayInCustomerMenu = True
//        while(stayInCustomerMenu):
//            print("Customer Menu")
//            print("1. Display the grocery")
//            print("2. Add to cart")
//            print("3. do payment")
//            print("4. Booked History")
//            print("5. Delete your history")
//            print("6. Logout")
//            choice = int(input("Enter your Choice: "))
//
//            if choice == 1:
//
//                #queue
//                items = copy.copy(GroceryListItems)
//
//                while (items != []):
//                    item_ = items.pop(0)
//                    print(item_.groceryId)
//                    print(item_.groceryName)
//                    print(item_.Quantity)
//                    print(item_.Price)
//                    print('---------------------------------------------')
//                print('.............................', GroceryListItems)
//
//            if choice == 2:
//                booking_count = 0
//                item_id = int(input("Enter the ID of your grocery: "))
//                quantity = int(input("Enter the quantity: "))
//                booking_data = cart(booking_count, self.userID, item_id, quantity, '12-2-2023')
//                cart_list.append(booking_data)
//                booking_count += 1
//
//            if choice == 3:
//                paymentId = len(payment_details) #2
//                payment_method = input('enter your payment method card/cash')
//                internet_issue = 'good'
//                if (payment_method == 'card'):
//                    card_no = input('card number')
//                    month = input('month')
//                    year = input('year')
//                    cvv = input('cvv')
//                    payment_details_data_from_constructor = Payment(paymentId, payment_method, card_no, month, year, cvv, 500, 'pending')
//                    payment_details.append(payment_details_data_from_constructor)
//                    internet_issue = 'bad'
//
//                if (internet_issue == 'bad'):
//                    pending_details_only = []
//                    for pending_details in payment_details:
//                        if(pending_details[7] == 'pending'):
//                            pending_details_only.append(pending_details)
//
//                # internet_issue = 'good'
//                # if internet_issue == 'good':
//                #     temporary_pending_details = pending_details_only
//                #     temporary_pending_details.pop()
//
//
//
//
//
//
//
//
//                elif(payment_method == 'cash'):
//                    payment_details_data_from_constructor = Payment(paymentId, cart_id,  payment_method, '', '', '', '', 500, 'paid')  [{1,1,'card', 2132,12,12,344,500, 'paid'}]
//                    payment_details.append(payment_details_data_from_constructor)
//                print(payment_details)
//
//            if choice == 4:
//                temporaryBokingList = payment_details
//                while (temporaryBokingList != []):
//                    print(temporaryBokingList.pop()) # LIFO stack
//
//
//
//
//
//
//if _name_ == "_main_":
//    app = groceryApp(1, "Priya", "kamal@gmail.com", "kamal123", "customer")
//    app.hardCodedData()
//    app = groceryApp(2, "Kamali", "kamali@gmail.com", "kamali123", "Admin")
//    app.hardCodedData()
//    app = groceryApp(3, "Kamal", "kamali@gmail.com", "kamali123", "Servicer")
//    app.hardCodedData()
//
//
//    app = Admin(1, "Priya", "kamal@gmail.com", "kamal123", "customer")
//    app.hardCodedData()
//    app = Admin(2, "Kamali", "kamali@gmail.com", "kamali123", "Admin")
//    app.hardCodedData()
//    app = Admin(3, "Kamal", "kamali@gmail.com", "kamali123", "Servicer")
//    app.hardCodedData()
//
//
//    paymentData = Payment(0,'cash', '', '', '', '', 500, 'paid')
//    paymentData.hardCodedData()
//    paymentData = Payment(1,'cash', '', '', '', '', 500, 'pending')
//    paymentData.hardCodedData()
//
//    role = input('enter your role')
//    if role == 'customer':
//        login_user = app.validateLogin("kamal@gmail.com", "kamal123")
//        if login_user:
//          grocery_work = groceryShowCase(login_user.userID, login_user.name, login_user.email, login_user.password, login_user.role)
//          grocery_work.grocery_for_customer()
//
//    if role == 'admin':
//        login_user = app.validateLogin("kamal@gmail.com", "kamal123")
//        if login_user:
//          grocery_work = groceryShowCase(login_user.userID, login_user.name, login_user.email, login_user.password, login_user.role)
//          grocery_work.grocery_for_customer()	
//	
//	
//	
//	
//

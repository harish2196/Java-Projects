package util;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;
import dao.Validation;
import model.Product;
import model.UserRegister;

public class Customer {
	public void isCustomer() throws SQLException {
		Scanner sc = new Scanner(System.in);
		Validation v1 = new Validation();
		Product p = new Product();
		String choose;
		Viewproducts view=new Viewproducts();
		ProductDbConnection db=new ProductDbConnection();
		CrudOperations crud=new CrudOperations();
		UserRegister ur=new UserRegister();
		if(true) {
			System.out.println("Do you have any Account in our Store: \n(Yes or No)");
			String choose1=sc.nextLine().toLowerCase();
			while(!choose1.equals("yes") && !choose1.equals("no")) {
				System.err.println("Please Re-enter Valid Input:");
				choose1=sc.nextLine().toLowerCase();
			}
			 if (choose1.equals("no")) {
		            try {
		                Connection connection = db.getConnection();
		           
		                System.out.println("Please Sign Up");
		                System.out.println("Enter UserName:");
		                String userName = sc.nextLine();
		                System.out.println("Enter PassWord:");
		                String passWord = sc.nextLine();
		                while (!v1.isPassword(passWord)) {
		                    System.out.println("Please Re-enter Password:");
		                    passWord = sc.nextLine();
		                }
		               
		                ur.setName(userName);
		                ur.setPassword(passWord);
		       
		                crud.insertUser(connection, ur);
		                System.out.println("Signed Successfully!");

		                System.out.println("Please Log In!");
		                while (true) {
		                    System.out.println("Enter The Name: ");
		                    String name = sc.next();
		                    System.out.println("Enter The Password: ");
		                    String pass = sc.next();
		                    ur.setName(name);
		                    ur.setPassword(pass);
		                    if (crud.getUserPassword(ur)) {
		                        System.out.println("Login successful!");
		                        break; 
		                    } else {
		                        System.out.println("Login unsuccessful. Please try again.");
		                    }
		                }
		            } catch (SQLException e) {
		                System.err.println("Database error: " + e.getMessage());
		            }
		        }
			 if (choose1.equals("yes")) {
			    Connection connection = db.getConnection();
			    while (!crud.getUserPassword(ur)) {
			        System.out.println("Enter The Name: ");
			        String name = sc.next();
			        System.out.println("Enter The Password: ");
			        String pass = sc.next();
			        ur.setName(name);
			        ur.setPassword(pass);

			        if (crud.getUserPassword(ur)) {
			            System.out.println("Login successful!");
			            break; 
			        } else {
			            System.out.println("Login unsuccessful. Please try again.");
			        }
			    }
			}



			while(true) {
				System.out.println("Enter 1 to View the Products");
				System.out.println("Enter 2 to buy the Products");
				System.out.println("Enter 3 to Exit!");
				System.out.println("Enter choice: ");
				int cusOption = sc.nextInt();
				switch(cusOption) {
				case 1:
					view.viewById(db.getConnection());
					break;
				case 2:
					crud.retrieveProducts1(db.getConnection());
				case 3:
					System.out.println("Exiting...");
					return;
				}
			}
		}
	}
}

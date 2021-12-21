import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Company {

  public static void main(String[] args) {
    
    Database db = Database.getInstance();
    
    try {
      db.connect();
    } catch (SQLException e) {
      System.out.println("Database connection failed");
      e.printStackTrace();
    }
    
    System.out.println("Connected");
    
    
    try {
      //ArrayList<User> users = new ArrayList<>();
      User u = new User(2000, "Rock", "Johnson", 10, 42);
      db.UpdateUser(u);
      db.insertUser(u);
      db.DeleteUser(11);
      
      //ResultSet results = db.runQuery("SELECT StartYear, FirstName, LastName, UserID, Age FROM User");
      //User u  =  db.userLookup(5);
      //System.out.println(u);
      //while(results.next()) {
        //int year = results.getInt(1);
        //String first = results.getString(2);
        //String last = results.getString(3);
        //int id = results.getInt(4);
        //int age = results.getInt(5);
        
      //  User u = new User(year, first, last, id, age);
       // users.add(u);
     // }
      //for(User u : users) {
       // System.out.println(u);
      //}
      
    } catch (SQLException e1) {
      System.out.println("Something went wrong");
    }
    
    
    try {
      db.disconnect();
    } catch (SQLException e) {
      System.out.println("Database closure failed");
      e.printStackTrace();
    }
    System.out.println("Disconnected");
  }

}

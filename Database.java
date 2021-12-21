import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Database {
  
  private String url = "jdbc:sqlite:C:/Users/colin/CS364/movies.db";
  
  private static final Database INSTANCE = new Database();
  
  private Connection connection;
  
  Database() {
    
  }
  
  public static Database getInstance() {
    return INSTANCE;
  }
  
  public void connect() throws SQLException {
    connection = DriverManager.getConnection(url);
  }
  
  public void disconnect() throws SQLException {
    connection.close();
  }
  
  public ResultSet runQuery(String query) throws SQLException {
    PreparedStatement stmt = connection.prepareStatement(query);
    ResultSet results = stmt.executeQuery();
    return results;
  }
  
  public User userLookup (int id2) throws SQLException {
    String query = "SELECT StartYear, FirstName, LastName, UserID, Age FROM User WHERE UserID = ?";
    PreparedStatement stmt = connection.prepareStatement(query);
    stmt.setInt(1, id2);
    ResultSet results = stmt.executeQuery();
   
    User u = null;
    while(results.next()) {
      int year = results.getInt(1);
      String first = results.getString(2);
      String last = results.getString(3);
      int id = results.getInt(4);
      int age = results.getInt(5);
       u = new User(year, first, last, id, age);
    }
    return u;
  }
  
  public void insertUser(User u) throws SQLException {
    String sql = "INSERT INTO User(StartYear, FirstName, LastName, UserID, Age) VALUES (?, ?, ?, ?, ?)";
    PreparedStatement stmt = connection.prepareStatement(sql);
    stmt.setInt(1, u.getYear());
    stmt.setString(2, u.getFirst());
    stmt.setString(3, u.getLast());
    stmt.setInt(4, u.getId());
    stmt.setInt(5, u.getAge());
    stmt.executeUpdate();
  }
  
  public void DeleteUser(int u) throws SQLException {
    String sql = "DELETE FROM User WHERE User.UserID = ?";
    PreparedStatement stmt = connection.prepareStatement(sql);
    stmt.setInt(1, u);
    stmt.executeUpdate();
  }
  
  public void UpdateUser(User u) throws SQLException {
    DeleteUser(u.getId());
    insertUser(u);
  }

}

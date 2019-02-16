
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;

public class TryCon {
    private final String url = "jdbc:postgresql://localhost:5432/";
    private final String user = "postgres";
    private final String password = "2283";

    public Connection connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the PostgreSQL server succesfully. ");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

  public HashMap<Cars,String> getAll() {
    HashMap<Cars,String> carsHash=new HashMap<>();
        String SQL = "select c.*,  d.id_of_Car, d.yearOfRelease, d.model, d.price, d.color\n" +
                "from \n" +
                "cars c join dataOfCar d on c.id= d.id_of_Car;\n";
        try (Connection conn = connect()) {
            PreparedStatement stmt = conn.prepareStatement(SQL);
            ResultSet rs = stmt.executeQuery();
            Cars cars = null;
            while(rs.next()){
                cars = new Cars(rs.getInt("id"),
                        rs.getString("numberOfCar"),
                        rs.getInt("id_of_Car"),
                        rs.getInt("yearOfRelease"),
                        rs.getString("model"),
                        rs.getDouble("price"),
                        rs.getString("color"));
                carsHash.put(cars,"id_of_Car");
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return null;
        }

        return carsHash;
    }
    }

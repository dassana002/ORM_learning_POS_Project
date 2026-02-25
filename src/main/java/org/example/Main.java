package org.example;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class Main {
    static void main() {
        try {
            Connection conn = DBConnection.getInstance().getConnection();
            PreparedStatement ps = conn.prepareStatement("INSERT INTO customers (name, address) VALUES (?,?)");
            ps.setString(1,"Dassana");
            ps.setString(2,"galle");
            int result = ps.executeUpdate();
            if (result > 0) {
                System.out.println("Insert Data Successfully....");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

package com.doctorrv2.DAO;

import com.doctorrv2.Model.User;
import java.sql.*;

public class UserDAO {
    private static final String INSERT_USER_SQL = "INSERT INTO users (full_name, email, password, phone, role, specialization) VALUES (?, ?, ?, ?, ?, ?)";
    private static final String SELECT_USER_BY_EMAIL = "SELECT * FROM users WHERE email = ?";

    public void registerUser(User user) throws SQLException {
        try (Connection conn = DBconnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(INSERT_USER_SQL)) {
            ps.setString(1, user.getFullName());
            ps.setString(2, user.getEmail());
            ps.setString(3, user.getPassword());
            ps.setString(4, user.getPhone());
            ps.setString(5, user.getRole());
            ps.setString(6, user.getSpecialization());
            ps.executeUpdate();
        }
    }

    public boolean validateUser (String email, String password)
            throws SQLException {
        try (Connection conn = DBconnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(SELECT_USER_BY_EMAIL)) {
            ps.setString(1, email);
            ResultSet rs = ps.executeQuery();
            if (rs.next() && rs.getString("password").equals(password)) {
              return true;
            }
            else {
                return false;
            }
        }

    }
}
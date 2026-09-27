package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.model.Admin;
import com.util.Constants;
import com.util.DbConnection;

public class AdminDAO {
	
	public void saveAdmin(Admin admin)throws SQLException{
		Connection connection;
		try {
			connection = DbConnection.getConnection();
			PreparedStatement statement = connection.prepareStatement(Constants.INSERT_ADMIN);
			statement.setString(1,admin.getUsername());
			statement.setString(2,admin.getPassword());
			
			statement.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
			
		}
	}
}
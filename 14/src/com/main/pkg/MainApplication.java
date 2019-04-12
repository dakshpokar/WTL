package com.main.pkg;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.context.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainApplication {
	public static void main(String[] args) throws SQLException {
		ApplicationContext context = new ClassPathXmlApplicationContext("app.xml");
		Student student = context.getBean("student", Student.class);
		Student student1 = context.getBean("student", Student.class);
		try {
		Class.forName("com.mysql.jdbc.Driver");
		}
		catch(ClassNotFoundException x) {
			System.out.println("Class Not Found!");
		}
		Connection conn = null;
		Statement stmt = null;
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/main", "dakshpokar", "password");
			stmt = conn.createStatement();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ResultSet rs = null;
		try {
			rs = stmt.executeQuery("select * from Student");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		while(rs.next()) {
			System.out.println(rs.getString(2));
		}
	}
}

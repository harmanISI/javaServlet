package db;

import java.util.ArrayList;

import javax.sql.DataSource;

import model.Register;
import model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;

public class usersdb {
	private DataSource ds;
	private Register R;

	public usersdb(DataSource ds) {
		this.ds = ds;
	}

	public void getAll(Register R) throws Exception {
		ArrayList<Register> temp = new ArrayList<>();

		Connection conn = null;
		Statement smt = null;
		PreparedStatement psmt = null;
		ResultSet res = null;

		try {
			conn = this.ds.getConnection();
			System.out.print(conn);
			
			//String sql = "SELECT * FROM circle.user";
			PreparedStatement ps=conn.prepareStatement(  
                    "insert into user(email,pass,date,que,ans,name) values (?,?,?,?,?,?)");  
			
			
			 ps.setString(1,R.getEmail());  
	            ps.setString(2,R.getPass());  
	            ps.setString(3,R.getDate());  
	            ps.setString(4,R.getQue());  
	            ps.setString(5,R.getAns());  
	            ps.setString(6,R.getName());  
	            System.out.print(R.getEmail());
			ps.executeUpdate();
		

			//smt = conn.createStatement();
			//res = smt.executeQuery(sql);

			/*
			 * while (res.next()) { String name = res.getString("email").toString(); String
			 * pass = res.getString("pass").toString(); System.out.println(name + pass );
			 * temp.add(new Register(name, pass, " ", " ", " ")); }
			 */

		} finally {
			close(conn, smt, psmt, res);
		}

		
	}

//GET_STUDENTS
	
	 public ArrayList<User> getAllStudents() throws Exception{ ArrayList<User>
	  tempStudents = new ArrayList<>();
	  
	  Connection conn = null; Statement smt = null; PreparedStatement psmt = null;
	  ResultSet res = null;
	  
	  
	  try { 
		  conn = this.ds.getConnection(); System.out.print(conn); 
		  String sql =
	  "SELECT * FROM user";
	  
	  smt = conn.createStatement(); res = smt.executeQuery(sql);
	  
	  while(res.next())
	  { 
		  String name = res.getString("email").toString(); 
		  String id = res.getString("pass").toString(); 
	  
	
	  
	  tempStudents.add(new User(name,id,id,name )); }
	  
	  }finally { close(conn,smt,psmt,res); }
	  
	  return tempStudents; }
	 
	
	// To Close the Connection
	private void close(Connection conn, Statement smt, PreparedStatement psmt, ResultSet res) {
		try {
			if (conn != null)
				conn.close();

			if (smt != null)
				smt.close();

			if (psmt != null)
				psmt.close();

			if (res != null)
				res.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


import java.sql.ResultSet;
import java.sql.SQLException;

import dto.MemberDTO;
import dto.MovieDTO;

public class DBService {
	public DBService(){
		Connection con;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@210.221.253.215:1521:xe","five","oracle");
			System.out.println("연결 성공");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	String sql;
	int result;
	PreparedStatement ps;
	ResultSet rs;
	
	/*public void insertMember() {
		sql = "insert into research values(?,?,?,?,?,?)";
		try {
			ps = dbCommon.con.prepareStatement(sql);
			ps.setString();
			ps.setString();
			ps.setString();
			ps.setString();
			ps.setString();
			ps.setString();
			result = ps.executeUpdate();
			if(result==1) {System.out.println("저장 성공");}
			else {System.out.println("저장 실패");}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	
	
	
	// 영화리스트페이지에 name님 환영합니다에서 name 불러오기
	public MemberDTO nameSearch(String id) {
		System.out.println("로그인한 유저아이디 ");
		//select name from membership where id = ?;
		String sql = "select name from membership where id = ?";
		MemberDTO dto = null;
		try {
			ps=DBCommon.con.prepareStatement(sql);
			ps.setString(1, id);
			//성공시 데이터를 가져오고 실패하면 catch
			rs = ps.executeQuery();
			if(rs.next()) {
				dto=new MemberDTO();
				dto.setId(rs.getString("id"));
				dto.setName(rs.getString("name"));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return dto ;
	}
	
	public MovieDTO movieInfo() {
		
		return null;
		
	}
	// 메인영화페이지에서 사진클릭하면 해당하는디테일페이지에 들어갈 디비정보 보여주는
	/*
	public MovieDTO viewDetail() {
		System.out.println("영화디테일페이지");
		//select name from membership where id = ?;
		String sql = "select movieTitle from movie";
		MovieDTO dto = null;
		try {
			ps=DBCommon.con.prepareStatement(sql);
			ps.setString();
			//성공시 데이터를 가져오고 실패하면 catch
			rs = ps.executeQuery();
			if(rs.next()) {
				dto=new movieDto();
				dto.set(rs.getString(""));
				dto.set(rs.getString(""));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return dto ;
		return null;
		
	}
	*/
	
	
	
	}

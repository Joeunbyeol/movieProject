package db;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import dto.MemberDTO;
import dto.MovieDTO;
import javafx.scene.Parent;
import javafx.scene.control.Label;

public class DBService {

	final static String DRIVER = "oracle.jdbc.driver.OracleDriver";
	final String URL = "jdbc:oracle:thin:@210.221.253.215:1521:xe";
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	String user, pw;
	static {
		try {
			Class.forName(DRIVER);
			System.out.println("디비성공");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public DBService() {
		user = "five";
		pw = "oracle";
	}

	public MovieDTO selectSQL() {
		String sql = "select * from movieinfo";
		MovieDTO dto = new MovieDTO();
		try {
			conn = DriverManager.getConnection(URL, user, pw);
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				dto.setTitle(rs.getString("title"));
				dto.setInfomation(rs.getString("information"));
				dto.setNation(rs.getString("nation"));
				dto.setDirector(rs.getString("director"));
				dto.setActor(rs.getString("actor"));
				dto.setFilmRate(rs.getString("filmrate"));
				dto.setMovieDate(rs.getString("moviedate"));
				dto.setRunningTime(rs.getInt("runningtime"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return dto;
	}

}

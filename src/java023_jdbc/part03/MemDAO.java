package java023_jdbc.part03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MemDAO {
	private Connection conn;
	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;

	private static MemDAO dao = new MemDAO();

	private MemDAO() {
	}

	public static MemDAO getInstance() {
		return dao;
	}

	private Connection init() throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.OracleDriver");
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String username = "hr";
		String password = "a1234";
		return DriverManager.getConnection(url, username, password);
	} // end init()

	private void exit() throws SQLException {
		if (rs != null)
			rs.close();
		if (stmt != null)
			stmt.close();
		if (pstmt != null)
			pstmt.close();
		if (conn != null)
			conn.close();
	}

	public List<MemDTO> listMethod() {
		List<MemDTO> aList = new ArrayList<MemDTO>();
		try {
			conn = init();
			conn.setAutoCommit(false);
			stmt = conn.createStatement();

			String sql = "SELECT * FROM mem ORDER BY num";
			rs = stmt.executeQuery(sql);

			while (rs.next()) {
				MemDTO dto = new MemDTO();
				dto.setNum(rs.getInt("num"));
				dto.setName(rs.getString("name"));
				dto.setAge(rs.getInt("age"));
				dto.setLoc(rs.getString("loc"));
				aList.add(dto);
			}
			conn.commit();
		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		} finally {
			try {
				conn.setAutoCommit(true);
				exit();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return aList;
	} // end listMethod()

	public int insertMethod(MemDTO dto) {
		int chk = -1;
		try {
			conn = init();
			conn.setAutoCommit(false);

			String sql = "INSERT INTO mem(num, name, age, loc)";
			sql += "VALUES(mem_num_seq.nextval, ?, ?, ?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getName());
			pstmt.setInt(2, dto.getAge());
			pstmt.setString(3, dto.getLoc());

			chk = pstmt.executeUpdate(); // INSERT, UPDATE, DELETE
			conn.commit();
		} catch (ClassNotFoundException | SQLException e) {
			try {
				conn.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			e.printStackTrace();
		} finally {
			try {
				conn.setAutoCommit(true);
				exit();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return chk;
	} // end insertMethod()

	public int updateMethod(HashMap<String, Object> hmap) {
		int chk = -1;

		try {
			conn = init();
			conn.setAutoCommit(false);

			String sql = "UPDATE mem SET name=? WHERE num=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, hmap.get("name").toString());
			pstmt.setInt(2, Integer.parseInt(hmap.get("num").toString()));
			
			chk = pstmt.executeUpdate();
			conn.commit();
		} catch (ClassNotFoundException | SQLException e) {
			try {
				conn.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			e.printStackTrace();
		} finally {
			try {
				conn.setAutoCommit(true);
				exit();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return chk;
	} // end updateMethod()
	
	public int deleteMethod(int age) {
		int chk = -1;
		
		try {
			conn = init();
			conn.setAutoCommit(false);
			
			String sql = "DELETE FROM mem WHERE age>=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, age);
			
			chk = pstmt.executeUpdate();
			
			conn.commit();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		} finally {
			try {
				conn.setAutoCommit(true);
				exit();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return chk;
	} // end deleteMethod()
} // end class

package java023_jdbc.part01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcTest {
	private Connection conn;
	private Statement stmt;
	private ResultSet rs;

	public JdbcTest() {

	}

	public void process() {
		try {
			// 1. 드리이버 연결
			Class.forName("oracle.jdbc.OracleDriver");

			// 2. 서버 연결
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String username = "hr";
			String password = "a1234";
			conn = DriverManager.getConnection(url, username, password);
			
//			System.out.println(conn);
			
			conn.setAutoCommit(false); // 자동 오토 커밋
			
			// 3. 쿼리문 실행을 위한 statement 타입의 객체를 가져옴
			stmt = conn.createStatement();
			
			// 4. 쿼리문을 실행 : SELECT - executQuery(), INSERT, UPDATE, DELETE - executeUdate()
			String sql = "SELECT * FROM departments ORDER BY department_id";
			rs = stmt.executeQuery(sql);
//			System.out.println(rs);
			
			// 5. 쿼리문의 결과 출력
			while(rs.next()) {
				int departmentId = rs.getInt("department_id");
				String departmentName = rs.getString("department_name");
				int managerId = rs.getInt("manager_id");
				int locationId = rs.getInt("location_id");
				System.out.printf("%d %s %d %d\n", departmentId, departmentName, managerId, locationId);
			}
			
			conn.commit();
			
			
		} catch (ClassNotFoundException e) {
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.setAutoCommit(true);
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			
			// 6. JDBC 연결 종료
			if (rs != null)
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			if (stmt != null)
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			if (conn != null)
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
	}
}

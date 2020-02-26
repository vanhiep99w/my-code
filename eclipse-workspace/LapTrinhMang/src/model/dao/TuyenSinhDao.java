package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.bean.CumThi;
import model.bean.Nam;
import util.LibraryConnectDb;

public class TuyenSinhDao {
	private LibraryConnectDb connectDB;
	private Connection conn;
	private PreparedStatement pst;
	private Statement st;
	private ResultSet rs;

	public TuyenSinhDao() {
		connectDB = new LibraryConnectDb();
	}

	public ArrayList<CumThi> getListCumThi() {
		ArrayList<CumThi> listCum = new ArrayList<>();
		conn = connectDB.getConnectMySql();
		String sql = "SELECT * FROM cumthi";
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			while (rs.next()) {
				int id = rs.getInt("id");
				String ten_cum = rs.getString("ten_cum");
				CumThi objCum = new CumThi(id, ten_cum);
				listCum.add(objCum);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (conn != null && st != null && rs != null) {
				try {
					rs.close();
					st.close();
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return listCum;
	}

	public ArrayList<Nam> getListNam() {
		ArrayList<Nam> listNam = new ArrayList<>();
		conn = connectDB.getConnectMySql();
		String sql = "SELECT * FROM nam";
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			while (rs.next()) {
				int id = rs.getInt("id");
				String nam = rs.getString("nam");
				Nam objCat = new Nam(id, nam);
				listNam.add(objCat);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (conn != null && st != null && rs != null) {
				try {
					rs.close();
					st.close();
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return listNam;
	}

	public ResultSet view(String search, String jradio, int id_cum, int id_nam) {
		ResultSet result = null;
		conn = connectDB.getConnectMySql();
		String sql = null;
		if(id_cum == 1 && id_nam == 1){
			if ("ten".equals(jradio)) {
				sql = "SELECT * FROM student WHERE HoTen LIKE '%" + search + "%'";
			} else if ("bdanh".equals(jradio)) {
				sql = "SELECT * FROM student WHERE SoBaDanh LIKE '%" + search + "%'";
			} else if ("mthu".equals(jradio)) {
				sql = "SELECT * FROM student WHERE Cmt LIKE '%" + search + "%'";
			}
		} else if (id_cum != 1 && id_nam == 1) {
			if ("ten".equals(jradio)) {
				sql = "SELECT * FROM student WHERE HoTen LIKE '%" + search + "%' AND cumthi_id =" + id_cum;
			} else if ("bdanh".equals(jradio)) {
				sql = "SELECT * FROM student WHERE SoBaDanh LIKE '%" + search + "%' AND cumthi_id =" + id_cum;
			} else if ("mthu".equals(jradio)) {
				sql = "SELECT * FROM student WHERE Cmt LIKE '%" + search + "%' AND cumthi_id =" + id_cum;
			}
		} else if (id_cum == 1 && id_nam != 1) {
			if ("ten".equals(jradio)) {
				sql = "SELECT * FROM student WHERE HoTen LIKE '%" + search + "%' AND nam_id =" + id_nam;
			} else if ("bdanh".equals(jradio)) {
				sql = "SELECT * FROM student WHERE SoBaDanh LIKE '%" + search + "%' AND nam_id =" + id_nam;
			} else if ("mthu".equals(jradio)) {
				sql = "SELECT * FROM student WHERE Cmt LIKE '%" + search + "%' AND nam_id =" + id_nam;
			}
		} else if (id_cum != 1 && id_nam != 1) {
			if ("ten".equals(jradio)) {
				sql = "SELECT * FROM student WHERE HoTen LIKE '%" + search + "%' AND nam_id =" + id_nam + " AND cumthi_id =" + id_cum;
			} else if ("bdanh".equals(jradio)) {
				sql = "SELECT * FROM student WHERE SoBaDanh LIKE '%" + search + "%' AND nam_id =" + id_nam + " AND cumthi_id =" + id_cum;
			} else if ("mthu".equals(jradio)) {
				sql = "SELECT * FROM student WHERE Cmt LIKE '%" + search + "%' AND nam_id =" + id_nam + " AND cumthi_id =" + id_cum;
			}
		}
		
		try {
			Statement statement = (Statement) conn.createStatement();
			return statement.executeQuery(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	public ArrayList<CumThi> Cum(String value) {
		ArrayList<CumThi> listCum = new ArrayList<>();
		conn = connectDB.getConnectMySql();
		String sql = "SELECT * FROM cumthi WHERE ten_cum LIKE '%"+value+"%'";
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			while (rs.next()) {
				int id = rs.getInt("id");
				String nam = rs.getString("ten_cum");
				CumThi objCat = new CumThi(id, nam);
				listCum.add(objCat);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (conn != null && st != null && rs != null) {
				try {
					rs.close();
					st.close();
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return listCum;
	}
	
	public ArrayList<Nam> Nam(String ten_nam) {
		ArrayList<Nam> listNam = new ArrayList<>();
		conn = connectDB.getConnectMySql();
		String sql = "SELECT * FROM nam WHERE nam LIKE '%"+ten_nam+"%'";
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			while (rs.next()) {
				int id = rs.getInt("id");
				String nam = rs.getString("nam");
				Nam objCat = new Nam(id, nam);
				listNam.add(objCat);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (conn != null && st != null && rs != null) {
				try {
					rs.close();
					st.close();
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return listNam;
	}

}

package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.Student;
import util.ConnectDB;

public class StudentDao {
	private Connection conn;
	private ConnectDB connDB;
	private PreparedStatement pst;
	private ResultSet rs;
	private ArrayList<Student> arrStudents;
	private Student student;
	
	public StudentDao() {
		connDB = new ConnectDB();
	}
	
	public ArrayList<Student> getDataByName(String name) {
		arrStudents = new ArrayList<>();
		conn = connDB.getConnection();
		String sql = "select sbd, ho_ten, ngay_sinh, dia_chi, khoi_thi_id, kt.ten as khoi, kt.mon_1, kt.mon_2, kt.mon_3, dt.mon_1 as diem_1, dt.mon_2 as diem_2, dt.mon_3 as diem_3 from hoc_sinh as hs inner join khoi_thi as kt on hs.khoi_thi_id = kt.id inner join diem_thi as dt on dt.hoc_sinh_id = hs.sbd where ho_ten like ?";
		try {
			pst = conn.prepareStatement(sql);
			pst.setString(1, "%" + name + "%");
			rs = pst.executeQuery();
			while (rs.next()) {
				student = new Student(rs.getInt("sbd"), rs.getString("ho_ten"), rs.getString("dia_chi"), rs.getDate("ngay_sinh"), rs.getInt("khoi_thi_id"), rs.getString("khoi"), rs.getString("mon_1"), rs.getString("mon_2"), rs.getString("mon_3"), rs.getFloat("diem_1"), rs.getFloat("diem_2"), rs.getFloat("diem_3"));
				arrStudents.add(student);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeConnect();
		}
		
		return arrStudents;
	}
	
	public ArrayList<Student> getDataByID(int id) {
		arrStudents = new ArrayList<>();
		conn = connDB.getConnection();
		String sql = "select sbd, ho_ten, ngay_sinh, dia_chi, khoi_thi_id, kt.ten as khoi, kt.mon_1, kt.mon_2, kt.mon_3, dt.mon_1 as diem_1, dt.mon_2 as diem_2, dt.mon_3 as diem_3 from hoc_sinh as hs inner join khoi_thi as kt on hs.khoi_thi_id = kt.id inner join diem_thi as dt on dt.hoc_sinh_id = hs.sbd where sbd = ?";
		try {
			pst = conn.prepareStatement(sql);
			pst.setInt(1, id);
			rs = pst.executeQuery();
			if (rs.next()) {
				student = new Student(rs.getInt("sbd"), rs.getString("ho_ten"), rs.getString("dia_chi"), rs.getDate("ngay_sinh"), rs.getInt("khoi_thi_id"), rs.getString("khoi"), rs.getString("mon_1"), rs.getString("mon_2"), rs.getString("mon_3"), rs.getFloat("diem_1"), rs.getFloat("diem_2"), rs.getFloat("diem_3"));
				arrStudents.add(student);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeConnect();
		}
		
		return arrStudents;
	}

	private void closeConnect() {
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (pst != null) {
			try {
				pst.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public ArrayList<Student> getDataByKhoiId(int idKhoi) {
		arrStudents = new ArrayList<>();
		conn = connDB.getConnection();
		String sql = "select sbd, ho_ten, ngay_sinh, dia_chi, khoi_thi_id, kt.ten as khoi, kt.mon_1, kt.mon_2, kt.mon_3, dt.mon_1 as diem_1, dt.mon_2 as diem_2, dt.mon_3 as diem_3 from hoc_sinh as hs inner join khoi_thi as kt on hs.khoi_thi_id = kt.id inner join diem_thi as dt on dt.hoc_sinh_id = hs.sbd where hs.khoi_thi_id = ?";
		try {
			pst = conn.prepareStatement(sql);
			pst.setInt(1, idKhoi);
			rs = pst.executeQuery();
			while (rs.next()) {
				student = new Student(rs.getInt("sbd"), rs.getString("ho_ten"), rs.getString("dia_chi"), rs.getDate("ngay_sinh"), rs.getInt("khoi_thi_id"), rs.getString("khoi"), rs.getString("mon_1"), rs.getString("mon_2"), rs.getString("mon_3"), rs.getFloat("diem_1"), rs.getFloat("diem_2"), rs.getFloat("diem_3"));
				arrStudents.add(student);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeConnect();
		}
		
		return arrStudents;
	}
}

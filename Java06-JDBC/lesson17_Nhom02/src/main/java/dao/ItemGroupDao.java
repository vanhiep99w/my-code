package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import connection.ConnectionProvider;
import entities.ItemGroup;

public class ItemGroupDao {
	private Connection conn = null;
	private ConnectionProvider connPro = null;
	private Statement sta = null;
	private PreparedStatement preSta = null;
	private ResultSet result = null;

	public ItemGroupDao() {
		connPro = new ConnectionProvider();
		conn = connPro.getConnection();
	}

	//Hiệp câu 5
	public List<ItemGroup> getItemGroups(String dayOfSale) {
		List<ItemGroup> itemGroups =new ArrayList<ItemGroup>();
		String query = "SELECT * FROM mathang "
				+ "WHERE MaMH IN ("
				+ "SELECT MaMH FROM chitietdonhang "
				+ "WHERE SoDH IN ("
				+ "SELECT SoDH FROM donhang "
				+ "WHERE CAST(NgayDat AS DATE) "
				+ "LIKE ? ))" ;
		try {
			preSta= conn.prepareStatement(query);
			preSta.setString(1, dayOfSale);
			result = preSta.executeQuery();
			while(result.next()) {
				int id = result.getInt("MaMH");
				String name = result.getString("TenMH");
				ItemGroup testGroup=new ItemGroup(id,name);
				itemGroups.add(testGroup);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				preSta.close();
				conn.close();
				result.close();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		return itemGroups;
	}
	//Hiệp câu 6
	public int getItemGroups(int idBill) {
		List<ItemGroup> itemGroups =new ArrayList<ItemGroup>();
		String query = "UPDATE hoadon hd ," 
				+ "(SELECT SoDH,SUM(ct.SoLuong* mh.GiaBan) " 
				+"AS Gia FROM chitietdonhang ct " 
				+"LEFT JOIN mathang mh ON ct.MaMH = mh.MaMH " 
				+"WHERE ct.SoDH = ? "
				+"GROUP BY SoDH) AS dh2 " 
				+"SET hd.TongTien = dh2.Gia " 
				+"WHERE hd.SoDH = dh2.SoDH" ;
		try {
			preSta= conn.prepareStatement(query);
			preSta.setInt(1, idBill);
			return preSta.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				preSta.close();
				conn.close();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		return 0;
	}

}

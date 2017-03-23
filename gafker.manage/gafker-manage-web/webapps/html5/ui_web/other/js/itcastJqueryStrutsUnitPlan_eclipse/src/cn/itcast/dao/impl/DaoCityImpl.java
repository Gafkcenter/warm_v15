package cn.itcast.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cn.itcast.bean.City;
import cn.itcast.util.DBManager;

public class DaoCityImpl {

	public List<City> findALLCity(Integer pid) {
		DBManager dbManager = null;
		Connection conn = null;
		ResultSet rs = null;
		PreparedStatement pstmt = null;
		dbManager = new DBManager();
		conn = dbManager.getConnection();
		List<City> list = new ArrayList<City>();

		String sql = "SELECT cid,cname FROM city where pid=? order by cid";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, pid);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				City c = new City();
				c.setCid(rs.getInt(1));
				c.setCname(rs.getString(2));
				list.add(c);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally{
			dbManager.closeResource(conn, pstmt, rs);
		}

		return list;
	}

}

package cn.itcast.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cn.itcast.bean.City;
import cn.itcast.bean.County;
import cn.itcast.util.DBManager;

public class DaoCountyImpl {

	public List<County> findALLCounty(Integer cid) {
		DBManager dbManager = null;
		Connection conn = null;
		ResultSet rs = null;
		PreparedStatement pstmt = null;
		dbManager = new DBManager();
		conn = dbManager.getConnection();
		List<County> list = new ArrayList<County>();

		String sql = "SELECT tid,tname FROM county where cid=? order by tid";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, cid);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				County c = new County();
				c.setTid(rs.getInt(1));
				c.setTname(rs.getString(2));
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

package cn.itcast.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cn.itcast.bean.Province;
import cn.itcast.util.DBManager;

public class DaoProvinceImpl {

	public List<Province> findALLProvince() {
		DBManager dbManager = null;
		Connection conn = null;
		ResultSet rs = null;
		PreparedStatement pstmt = null;
		dbManager = new DBManager();
		conn = dbManager.getConnection();
		List<Province> list = new ArrayList<Province>();

		String sql = "SELECT pid,pname FROM province ORDER BY pid";
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				Province p = new Province();
				p.setPid(rs.getInt(1));
				p.setPname(rs.getString(2));

				list.add(p);

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

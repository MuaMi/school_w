package com.wyz.LoginMod;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.wyz.DbMod.w_db;

public class LoginDao {
	/**
	 * 学生端登录
	 * @param phone手机号
	 * @param pass密码
	 * @return 如果登录成功返回success，否则返回sorry
	 * @throws Exception
	 * 
	 * @author 姜华起  @time 2016.2.29
	 */
	
	public static String StuLogin(String phone,String pass) throws Exception{
		Connection conn = w_db.getConnection();
		Statement stm = conn.createStatement();
		String sql = "select phone from us_stuser where phone='"+phone+"'  and  password='"+pass+"'";
		ResultSet rs = stm.executeQuery(sql);
		
		if (rs.next()) {
			conn.close();
			return "success";
		}else{
			conn.close();
			return "sorry";
		}
	}

}

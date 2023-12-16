package com.zumba.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.zumba.bean.Participants;
import com.zumba.resource.DbResource;

public class ParticipantsDao {

	public int storeParticipantsDetails(Participants participant) {
		try {
		Connection con = DbResource.getDbConnection();
		PreparedStatement pstmt = con.prepareStatement("insert into participants(pname,age,phonenumber,batchid) values(?,?,?,?)");
		pstmt.setString(1,participant.getPname());
		pstmt.setInt(2, participant.getAge());
		pstmt.setString(3, participant.getPhonenumber());
		pstmt.setInt(4, participant.getBatchid());
		return pstmt.executeUpdate();
		} catch (Exception e) {
			System.err.println("Participants insert error "+e.toString());
			return 0;
		}
	}
}

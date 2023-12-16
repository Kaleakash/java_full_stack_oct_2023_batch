package com.zumba.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.zumba.bean.Batch;
import com.zumba.resource.DbResource;

public class BatchDao {

	public int storeBatchDetails(Batch batch) {
		try {
		Connection con = DbResource.getDbConnection();
		PreparedStatement pstmt = con.prepareStatement("insert into batch values(?,?,?)");
		pstmt.setInt(1, batch.getBatchid());
		pstmt.setString(2, batch.getTypeofbatch());
		pstmt.setString(3, batch.getTime());
		return pstmt.executeUpdate();
		} catch (Exception e) {
			System.err.println("Batch insert error "+e.toString());
			return 0;
		}
	}
	
	

	public List<Batch> findAllBatchInfo() {
	List<Batch> listOfBatch = new ArrayList<>();
		try {
		Connection con = DbResource.getDbConnection();
		PreparedStatement pstmt = con.prepareStatement("select * from batch");
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()) {
			Batch batch = new Batch();
			batch.setBatchid(rs.getInt(1));
			batch.setTypeofbatch(rs.getString(2));
			batch.setTime(rs.getString(3));
			listOfBatch.add(batch);
		}
		} catch (Exception e) {
			System.err.println("Batch retrieve error "+e.toString());
		}
		return listOfBatch;
	}
	
	
	public List<Object[]> findBatchAndStudentInfo() {
		List<Object[]> listOfBatch = new ArrayList<>();
			try {
			Connection con = DbResource.getDbConnection();
	PreparedStatement pstmt = con.prepareStatement("select b.typeofbatch,b.time,p.sname, p.age from batch b, participants p where b.batchid = p.batchid");
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				Object obj[]=new Object[4];
				obj[0]=rs.getString(1);
				obj[1]=rs.getString(2);
				obj[2]=rs.getString(3);
				obj[3]=rs.getInt(4);
				listOfBatch.add(obj);
			}
			} catch (Exception e) {
				System.err.println("Batch retrieve error "+e.toString());
			}
			return listOfBatch;
		}
}

package com.zumba.service;

import java.util.List;

import com.zumba.bean.Batch;
import com.zumba.dao.BatchDao;

public class BatchService {

	BatchDao db = new BatchDao();
	public String storeBatch(Batch batch) {
		if(db.storeBatchDetails(batch)>0) {
			return "Batch details stored successfully";
		}else {
			return "Batch details didn't store";
		}
	}
	
	public List<Batch> findAllBatch(){
		return db.findAllBatchInfo();
	}
	
	public List<Object[]> findBatchAndStudentInfo() {
		return db.findBatchAndStudentInfo();
	}
}

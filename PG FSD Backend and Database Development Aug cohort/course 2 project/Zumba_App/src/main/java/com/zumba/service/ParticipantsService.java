package com.zumba.service;

import com.zumba.bean.Participants;
import com.zumba.dao.ParticipantsDao;

public class ParticipantsService {

	ParticipantsDao pd = new ParticipantsDao();
	public String storeParticipant(Participants participant) {
		if(pd.storeParticipantsDetails(participant)>0) {
			return "Participants details stored successfully";
		}else {
			return "Participant details didn't store";
		}
	}
}

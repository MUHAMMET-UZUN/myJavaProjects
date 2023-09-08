package com.um4m1.service.concretes;

import java.sql.SQLException;

import com.um4m1.repository.abstracts.StatusDao;
import com.um4m1.repository.concretes.StatusRepo;
import com.um4m1.service.abstracts.StatusService;

public class StatusManager implements StatusService{

	@Override
	public String getById(int id) throws SQLException {
		StatusDao status = new StatusRepo();
		return status.getStatusById(id);
	}

}

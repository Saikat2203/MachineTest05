package com.sales.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sales.dao.VisitDAO;
import com.sales.entity.Visit;

@Service
public class VisitServiceImpl implements IVisitService {

	@Autowired
	private VisitDAO visitDAO;
	
	// method to save Visit details
	@Override
	public Visit addVisitDetails(Visit visit) {
		return visitDAO.save(visit);
	}

	@Override
	public List<Visit> getAllVisits() {
		// TODO Auto-generated method stub
		return visitDAO.findAll();
	}

}

package com.nccapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nccapp.bean.Ncc;
import com.nccapp.repository.INccRepository;

@Service
public class NccServiceImpl implements INccService {

	@Autowired
	private INccRepository dao;
	
	@Autowired
	INccService iNccService;

	@Autowired
	public void setiInvestmentRepository(INccRepository dao) {
		this.dao = dao;
	}

	@Override
	public void addNcc(Ncc ncc) {
		dao.addNcc(ncc);

	}

	@Override
	public void updateNcc(String cadetName, int cadetId) {
		dao.updateNcc(cadetName, cadetId);

	}

	@Override
	public void deleteNcc(int cadetId) {
		dao.deleteNcc(cadetId);

	}

	public List<Ncc> getAll() {
		return dao.findAll();
	}

	public List<Ncc> getByName(String cadetName) {
		return dao.findByName(cadetName);

	}

	public List<Ncc> getByDesignation(String designation) {

		return dao.findByDesignation(designation);
	}

	public List<Ncc> getByDivision(String division) {

		return dao.findByDivision("major");
	}

	public Ncc getBycadetId(int cadetId) {

		return dao.findBycadetId(cadetId);
	}

	public Ncc getByDuration(int duration) {

		return dao.findByDuration(duration);
	}

}

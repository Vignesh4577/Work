package com.nccapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.nccapp.bean.Ncc;

@Service
public interface INccService {

	
	void addNcc(Ncc ncc);
	void updateNcc(String cadetName,int cadetId);
	void deleteNcc(int cadetId);
	
	
	List<Ncc> getAll();
	List<Ncc> getByName(String cadetName);
	List<Ncc> getByDesignation(String designation);
	List<Ncc> getByDivision(String division);
	Ncc getBycadetId(int cadetId);
	Ncc getByDuration(int duration);
}

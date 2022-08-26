package com.nccapp.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.nccapp.bean.Ncc;

@Repository
public interface INccRepository {

	void addNcc(Ncc ncc);
	void updateNcc(String cadetName,int cadetId);
	void deleteNcc(int cadetId);
	
	List<Ncc> findAll();
	List<Ncc> findByName(String cadetName);
	List<Ncc> findByDesignation(String designation);
	List<Ncc> findByDivision(String division);
	Ncc findBycadetId(int cadetId);
	Ncc findByDuration(int duration);
}

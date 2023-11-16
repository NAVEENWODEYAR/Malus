package com.bhas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bhas.dto.AppleDTO;
import com.bhas.modal.Apple;
import com.bhas.repo.AppleRepo;

@Service
public class AppleService 
{
	//DI,
	@Autowired
	private AppleRepo appleRepo;
	
	// CRUD operations,
	// 1.INSERT INTO TABLE-NAME VALUES();
	public Apple insertAppl(AppleDTO aplDTO)
	{
		Apple ap = new Apple(aplDTO);
		return appleRepo.save(ap);
	}
	
	// 2. SELECT * FROM TABLE-NAME WHERE id = " ";
	public Apple getApl(Integer aplId)
	{
		return appleRepo.findById(aplId).get();
	}
	
	// 3. UPDATE
	public Apple updateApl(Integer aplId,AppleDTO aplAppleDTO)
	{
		Apple ap = appleRepo.findById(aplId).get();
				ap.setAplName(aplAppleDTO.getAplName());
				ap.setAplPrice(aplAppleDTO.getAplPrice());
				ap.setAplQty(aplAppleDTO.getAplQty());
				
				return appleRepo.save(ap);
	}
	
	// 4. DELETE
	public String deleteApl(Integer aplId)
	{
		appleRepo.deleteById(aplId);
		return " ";
	}
	
}

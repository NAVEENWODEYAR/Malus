package com.bhas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

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
	
	// 2.a SELECT * FROM TABLE-NAME;
	public List<Apple> getApls()
	{
		List<Apple> apl = appleRepo.findAll();
		return apl;
	}
	
	// 3. UPDATE
	public Apple updateApl(Integer aplId,AppleDTO aplAppleDTO)
	{
		Apple ap = appleRepo.findById(aplId).get();
				ap.setAplName(aplAppleDTO.getAplName());
				ap.setAplPrice(aplAppleDTO.getAplPrice());
				ap.setAplQty(aplAppleDTO.getAplQty());
				ap.setDealers(aplAppleDTO.getDealers());;
				
				return appleRepo.save(ap);
	}
	
	// 4. DELETE
	public String deleteApl(Integer aplId)
	{
		appleRepo.deleteById(aplId);
		return " ";
	}
	
}

package com.bhas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

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
	// 1. Get for receiving the data,
	@GetMapping("/wish")
	public String greet()
	{
		return "Welcome to the Malus_App!,";
	}
	
	// 2.Post for sending the data,
	@PostMapping("/insertApl")
	public Apple insertAppl(AppleDTO aplDTO)
	{
		Apple ap = new Apple(aplDTO);
		return appleRepo.save(ap);
	}
	
	// 3. SELECT * FROM TABLE-NAME WHERE id = " ";
	@GetMapping("/getApl/{id}")
	public Apple getApl(Integer aplId)
	{
		return appleRepo.findById(aplId).get();
	}
	
}

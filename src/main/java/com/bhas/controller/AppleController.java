package com.bhas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.bhas.dto.AppleDTO;
import com.bhas.dto.RequestDTO;
import com.bhas.modal.Apple;
import com.bhas.service.AppleService;

@RestController
public class AppleController 
{
	// DI,
	@Autowired
	private AppleService appleService;
	
	// API's,
	// 1. test EndPoint,
	@ResponseStatus(code = HttpStatus.UPGRADE_REQUIRED)
	@GetMapping("/msg")
	public String greet()
	{
		return "Welcome to Malus_App,";
	}
	
	// 2. Post for sending the data,
	@PostMapping("/insertApl")
	public ResponseEntity<RequestDTO> insertApl(@RequestBody AppleDTO aplAppleDTO)
	{
		Apple ap = appleService.insertAppl(aplAppleDTO);
				RequestDTO requestDTO = new RequestDTO("Apple inserted successfult", ap);
				return new ResponseEntity<RequestDTO>(requestDTO, HttpStatus.CREATED);
	}
	
	// 2. Get for receiving the data,
	@GetMapping("/getApl/{aplId}")
	public ResponseEntity<RequestDTO> getApl(@PathVariable int aplId)
	{
		Apple ap = appleService.getApl(aplId);
				RequestDTO requestDTO = new RequestDTO("Apple found!", ap);
				return new ResponseEntity<>(requestDTO,HttpStatus.FOUND);
	}
	
	// 2.a
	@GetMapping("/getApl's")
	public ResponseEntity<RequestDTO> getApls()
	{
		List<Apple> apl = appleService.getApls();
					RequestDTO requestDTO = new RequestDTO("Found in the db", apl);
					return new ResponseEntity<RequestDTO>(requestDTO,HttpStatus.FOUND);
	}
	
	// 3. Put for updating the data,
	@PutMapping("/updateApl/{aplId}")
	public ResponseEntity<RequestDTO> updateApl(@PathVariable int aplId, @RequestBody AppleDTO appleDTO)
	{
		Apple ap = appleService.updateApl(aplId, appleDTO);
			RequestDTO requestDTO = new RequestDTO("Successfully updated the Apple", ap);
			return new ResponseEntity<RequestDTO>(requestDTO,HttpStatus.OK);
	}
	
	// 4. Delete for deleting the data,
	@DeleteMapping("/deleteApl/{aplId}")
	public ResponseEntity<RequestDTO> deleteApl(@PathVariable int aplId)
	{
		appleService.deleteApl(aplId);
		RequestDTO requestDTO = new RequestDTO("Deleted", "Id"+aplId);
		return new ResponseEntity<RequestDTO>(requestDTO,HttpStatus.GONE);
		
	}
}

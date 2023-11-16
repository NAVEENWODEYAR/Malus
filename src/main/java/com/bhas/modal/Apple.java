package com.bhas.modal;

import com.bhas.dto.AppleDTO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Sebu")
public class Apple 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int aplId;
	
	private String aplName;
	
	private double aplPrice;
	
	private String aplQty;
	
	public Apple(AppleDTO aplDto)
	{
		this.aplName = aplDto.getAplName();
		this.aplPrice = aplDto.getAplPrice();
		this.aplQty = aplDto.getAplQty();
	}

}

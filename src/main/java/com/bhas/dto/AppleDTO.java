package com.bhas.dto;

import java.util.List;

import com.bhas.modal.Dealer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AppleDTO
{
	private String aplName;
	private double aplPrice;
	private String aplQty;
	private List<Dealer> dealers;
}

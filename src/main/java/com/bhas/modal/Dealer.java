package com.bhas.modal;

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
@Table(name = "Apple-Vendor")
public class Dealer 
{
	@Id
	@GeneratedValue (strategy = GenerationType.SEQUENCE)
	private int dId;
	private String dName;
	private String ddddress;
	private String dEmail;
}

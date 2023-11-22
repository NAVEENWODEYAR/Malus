package com.bhas.modal;

import jakarta.persistence.Entity;
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
	private int dId;
	private String dName;
	private String ddddress;
	private String dEmail;
}

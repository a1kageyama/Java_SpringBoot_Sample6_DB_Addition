package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/**
 * Class for bridging DB and customer information
 */
@Entity
@Data
@Table(name="customer_table")
public class Customer {

	/**
	 * PRIMARY KEY
	 */
	@Id
	@Column(name="cus_Num")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long num;

	/**
	 * Name
	 */
	@Column(name="cus_Name")
	private String name;

	/**
	 * Address
	 */
	@Column(name="cus_Address")
	private String address;

	/**
	 * Phone number
	 */
	@Column(name="cus_Telno")
	private String telno;

}

package com.provivi.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "power")
public class Power implements Serializable {

	/**
	 * SerialVersion
	 */
	private static final long serialVersionUID = -5915592612536124302L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idPower;
	
	@Column(name = "product_value", nullable = false)
	private int value;
	
	@Column(name = "result", nullable = false)
	private int result;
	
	/**
	 * 
	 */
	public Power() {
		super();
	}

	public int getIdPower() {
		return idPower;
	}

	public void setIdPower(int idPower) {
		this.idPower = idPower;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}

	@Override
	public String toString() {
		return "Power [idPower=" + idPower + ", value=" + value + ", result=" + result + "]";
	}
}
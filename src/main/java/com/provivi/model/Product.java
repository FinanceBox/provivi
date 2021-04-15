package com.provivi.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Product")
public class Product implements Serializable {

	/**
	 * SerialVersion
	 */
	private static final long serialVersionUID = 8322546835060952920L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idProduct;
	
	@Column(name = "product_value", nullable = false)
	private int value;
	
	@Column(name = "result", nullable = false)
	private int result;
	
	public Product() {
		super();
	}

	public int getIdProduct() {
		return idProduct;
	}

	public void setIdProduct(int idProduct) {
		this.idProduct = idProduct;
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
		return "Product [idProduct=" + idProduct + ", value=" + value + ", result=" + result + "]";
	}
}
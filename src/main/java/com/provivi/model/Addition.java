package com.provivi.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "addition")
@Entity
public class Addition implements Serializable {
	/**
	 * SerialVersion
	 */
	private static final long serialVersionUID = -3759202136079659535L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idAddition;
	
	@Column(name = "first_number", nullable = false)
	private int first;
	
	@Column(name = "second_number", nullable = false)
	private int second;
	
	@Column(name = "result", nullable = false)
	private int result;
	
	public Addition() {
		super();
	}

	public int getIdAddition() {
		return idAddition;
	}

	public void setIdAddition(int idAddition) {
		this.idAddition = idAddition;
	}

	public int getFirst() {
		return first;
	}

	public void setFirst(int first) {
		this.first = first;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}

	@Override
	public String toString() {
		return "Addition [idAddition=" + idAddition + ", first=" + first + ", second=" + second + ", result=" + result
				+ "]";
	}
}
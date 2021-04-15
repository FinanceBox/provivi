package com.provivi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.provivi.dao.AdditionDao;
import com.provivi.dao.PowerDao;
import com.provivi.dao.ProductDao;
import com.provivi.model.Addition;
import com.provivi.model.Power;
import com.provivi.model.Product;

@Service
public class OperationService {

	@Autowired
	private AdditionDao additionDao;
	
	@Autowired
	private ProductDao productDao;
	
	@Autowired
	private PowerDao powerDao;
	
	public List<Addition> getAdditions() {
		return additionDao.findAll();
	}
	
	public int addition(int first, int second) {
		int resultAddition = -1;
		Addition addition = new Addition();
		addition.setFirst(first);
		addition.setSecond(second);
		addition.setResult(first + second);
		Addition result = additionDao.save(addition);
		if(result != null) {
			resultAddition = result.getResult();
		}
		return resultAddition;
	}
	
	public int productBy(int value) {
		int result = -1;
		Product product = new Product();
		product.setValue(value);
		product.setResult(value * 2);
		Product resultProduct = productDao.save(product);
		if(resultProduct != null) {
			result = resultProduct.getResult();
		}
		return result;
	}
	
	public int power(int value) {
		int result = -1;
		Power power = new Power();
		power.setValue(value);
		power.setResult((int) Math.pow(value, 2));
		Power resultPower = powerDao.save(power);
		if(resultPower != null) {
			result = resultPower.getResult();
		}
		return result;
	}
}

package com.provivi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.provivi.model.Addition;
import com.provivi.service.OperationService;

@Controller
public class OperationController {

	@Autowired
	private OperationService operationService;
	
	@GetMapping("/index")
	public String index() {
		return "index";
	}
	
	@PostMapping("/addition/all")
	public @ResponseBody List<Addition>  getAllAdition(){
		return operationService.getAdditions();
	}
	
	@PostMapping("/addition/{firstNumber}/{secondNumber}")
	public @ResponseBody int addition(@PathVariable(name = "firstNumber") int firstNumber, @PathVariable(name = "secondNumber") int secondNumber) {
		return operationService.addition(firstNumber, secondNumber);
	}
	
	@PostMapping("/product/{value}")
	public @ResponseBody int product(@PathVariable(name = "value") int value) {
		return operationService.productBy(value);
	}
	
	@PostMapping("/power/{value}")
	public @ResponseBody int power(@PathVariable(name = "value") int value) {
		return operationService.power(value);
	}
}

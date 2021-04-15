'use strict'

function addition() {
		$.ajax({
			url: "/addition/" + $("#addFirstNumber").val() + "/" +$("#addSecondNumber").val(),
			 async: false,
			 type: 'POST',
			 success: function(data) {
			 	$("#resultSum").text(data);
			 }, error: function(xhr, options, error) {
			 	alert(error);
			 }
		});
}

function cleanAddition(){
 	$("#addFirstNumber").val('');
 	$("#addSecondNumber").val('');
 	$("#resultSum").text(0);
}

function product() {
		$.ajax({
			url: "/product/" + $("#productValue").val(),
			 async: false,
			 type: 'POST',
			 success: function(data) {
			 	$("#resultProduct").text(data);
			 }, error: function(xhr, options, error) {
			 	alert(error);
			 }
		});
}

function cleanProduct(){
 	$("#productValue").val('');
 	$("#resultProduct").text(0);
}

function power() {
	$.ajax({
			url: "/power/" + $("#powerValue").val(),
			 async: false,
			 type: 'POST',
			 success: function(data) {
			 	$("#resultPower").text(data);
			 }, error: function(xhr, options, error) {
			 	alert(error);
			 }
		});
}

function cleanPower(){
 	$("#powerValue").val('');
 	$("#resultPower").text(0);
}
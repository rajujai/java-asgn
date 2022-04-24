package com.raju;

public class CalculatorImpl {
	Calculator cal;

	public void setCal(Calculator cal) {
		this.cal = cal;
	}
	int calculate(int a,int b, String operation) throws ArithmeticException {
		if(operation.equals("add")) return cal.sum(a, b);
		else if(operation.equals("substract")) return cal.substract(a, b);
		else if(operation.equals("multiply")) return cal.multiply(a, b);
		else if(operation.equals("divide")) return cal.divide(a, b);
		else throw new ArithmeticException("Invalid operation!");
	}
}

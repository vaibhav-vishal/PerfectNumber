package com.training.apps;

import com.training.domain.PerfectNumber;

public class Application {

	public static void main(String[] args) {
		PerfectNumber pnumber = new PerfectNumber(10);
		System.out.println(pnumber.checkPerfectNumber());
		pnumber = new PerfectNumber(1, 100);
		pnumber.printPerfectNumber();
	}

}

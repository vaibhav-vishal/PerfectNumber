package com.training.domain;

public class PerfectNumber {
	private int num, start, end;

	public PerfectNumber(int start, int end) {
		super();
		this.start = start;
		this.end = end;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public PerfectNumber(int num) throws NumberFormatException {
		super();
		if (num < 0)
			throw new NumberFormatException();
		else
			this.setNum(num);

	}

	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public int getEnd() {
		return end;
	}

	public void setEnd(int end) {
		this.end = end;
	}

	public PerfectNumber() {
		super();
	}

	public boolean checkPerfectNumber() {
		boolean check;
		int temp = 0;
		for (int i = 1; i <= num / 2; i++) {
			if (num % i == 0) {
				temp += i;
			}
		}
		if (temp == num) {
			check = true;
		} else {
			check = false;
		}
		return check;
	}

	public boolean checkPerfectNumber(int num) {
		boolean check;
		int temp = 0;
		for (int i = 1; i <= num / 2; i++) {
			if (num % i == 0) {
				temp += i;
			}
		}
		if (temp == num) {
			check = true;
		} else {
			check = false;
		}
		return check;
	}

	public void printPerfectNumber() {
		for (int i = start; i <= end; i++) {

			if (checkPerfectNumber(i)) {

				System.out.println(i + " is a perfect number");

			}

		}

	}

}

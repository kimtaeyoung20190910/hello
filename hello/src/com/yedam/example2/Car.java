package com.yedam.example2;

import com.yedam.example.Tire;

public class Car {
	Tire[] carary = { new Tire("앞왼쪽", 6), new Tire("앞오른쪽", 2),
			new Tire("뒤왼쪽", 3), new Tire("뒤오른쪽", 4) };

	int run() {
		System.out.println("[자동차가 달립니다]");
		
	for(int i=0; i<carary.length; i++) {
		if(carary[i].roll() == false) { 
			stop();
			return i + 1; 
	
			}
		}return 0;

	}

	private void stop() {
		
	}
	
	}


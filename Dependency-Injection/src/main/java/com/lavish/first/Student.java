package com.lavish.first;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {
	@Autowired
	Laptop lap;
	
public void code() {
	lap.compile();
}
}

package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

public class Coder {
	@Autowired
	Laptop laptop;
public void code() {
	laptop.compile();
}
}

package com.cg.ixd.service;

import org.springframework.stereotype.Component;

@Component
public class GreetServiceImpl implements IGreetService {

public String getGreeting(String userName) {
	return "Hello "+userName;
}
}

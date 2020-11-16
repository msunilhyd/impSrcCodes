package com.github.jrhenderson1988.customerservice;

import java.util.Collections;

import org.springframework.stereotype.Component;

@Component
public class OrderClientFallback implements OrderClient {

	@Override
	public Object getOrdersForCustomer(int customerId) {
		return Collections.emptyList();
	}
}
